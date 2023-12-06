package cercanoOeste.back.repositories;

import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.entities.Pedido;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido,Long> {
    //Buscar los pedidos con estado EN_ESPERA, PENDIENTE PAGO, PAGADO. SOLO DEL DIA DE HOY
    @Query(
            value = "SELECT pedido.* "+
            "FROM pedido "+
            "JOIN estadopedido ON pedido.fk_estado_pedido = estadopedido.id "+
            "WHERE estadopedido.nombre IN ('EN_ESPERA', 'PENDIENTE_DE_PAGO', 'EN_PREPARACION') "+
            "AND DATE(pedido.fecha_hora_pedido) = CURRENT_DATE "+
            "ORDER BY CASE estadopedido.nombre "+
            "WHEN 'EN_ESPERA' THEN 1 "+
            "WHEN 'PENDIENTE_DE_PAGO' THEN 2 "+
            "WHEN 'PAGADO' THEN 3 "+
            "ELSE 4 "+
            "END",
            nativeQuery = true
    )
    List<Pedido> BusquedaPedidos();

}
