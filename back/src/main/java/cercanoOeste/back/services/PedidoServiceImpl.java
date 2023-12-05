package cercanoOeste.back.services;

import cercanoOeste.back.Adapters.AdaptadorDistancia;
import cercanoOeste.back.DTOS.DTOPedidoAconfirmar;
import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.DTOS.DTOProducto;
import cercanoOeste.back.Factorys.FactoryAdapterCalculoDistancia;
import cercanoOeste.back.entities.DetallePedido;
import cercanoOeste.back.entities.Pedido;
import cercanoOeste.back.enumerations.EstadoPedido;
import cercanoOeste.back.enumerations.TipoEnvio;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.PedidoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;


    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoServiceRepository) {
        super(baseRepository);
    }
    // Caso de Uso realizar pedido
    @Override
    public DTOPedidoAconfirmar realizarPedido(Pedido pedido) {
        pedido.setEstadoPedido("EN_ESPERA");
        DTOPedidoAconfirmar pedidoDTO = new DTOPedidoAconfirmar();
        pedidoDTO.setEstadoPedido("EN_ESPERA");
        Pedido pedidoPersistido = pedidoRepository.save(pedido);
        return pedidoDTO;
    }
    //Buscar pedidos a confirmar
    @Override
    public List<Pedido> BusquedaAConfimar() throws Exception {
        try {
            List<Pedido> pedidosaconfir = pedidoRepository.BusquedaAConfimar();
            return pedidosaconfir;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}