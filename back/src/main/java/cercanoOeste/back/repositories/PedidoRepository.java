package cercanoOeste.back.repositories;

import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.entities.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido,Long> {
    //Buscar los pedidos con estado A_Confirmar
    @Query(
            value = "SELECT * FROM pedido WHERE estado_pedido = 'EN_ESPERA'",
            nativeQuery = true
    )
    List<Pedido> BusquedaAConfimar();
}
