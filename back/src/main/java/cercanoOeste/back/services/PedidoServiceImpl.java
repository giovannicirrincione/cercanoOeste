package cercanoOeste.back.services;

import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.DTOS.DTOProducto;
import cercanoOeste.back.entities.DetallePedido;
import cercanoOeste.back.entities.Pedido;
import cercanoOeste.back.enumerations.EstadoPedido;
import cercanoOeste.back.enumerations.TipoEnvio;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Override
    public DTOPedidoInfo realizarPedido(Pedido pedido) {
        List<DetallePedido> detalles = pedido.getDetalles();

        DTOPedidoInfo pedidoInfo = new DTOPedidoInfo();


        LocalTime tiempoPreparacion = null;
        if (pedido.getTipoEnvio() == TipoEnvio.DELIVERY){
            tiempoPreparacion = LocalTime.of(1, 30);
        } else {
            tiempoPreparacion = LocalTime.of(1, 15);
        }



        LocalTime horaActual = LocalTime.now();

        pedidoInfo.setHoraEstimadaEntrega(horaActual.plus(tiempoPreparacion.getHour(), ChronoUnit.HOURS)
                .plus(tiempoPreparacion.getMinute(), ChronoUnit.MINUTES));
        pedidoInfo.setTipoEnvio(pedido.getTipoEnvio());

        pedidoInfo.setTotal(pedido.getMontoTotal());

        List<DTOProducto> productos = new ArrayList<DTOProducto>();

        for (DetallePedido detalle : detalles){
            DTOProducto producto = new DTOProducto();
            producto.setCantidad(detalle.getCantidadProducto());
            producto.setNombre(detalle.getProducto().getNombre());
            producto.setSubtotal(detalle.getSubtotalPedido());
            productos.add(producto);
        }
        pedidoInfo.setProductoList(productos);

        pedido.setEstadoPedido(EstadoPedido.EN_PREPARACION);

        Pedido pedidoPersistido = pedidoRepository.save(pedido);

        return pedidoInfo;
    }
}