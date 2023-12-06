package cercanoOeste.back.services;

import cercanoOeste.back.DTOS.DTOPedidoAconfirmar;
import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.entities.Pedido;

import java.util.List;

public interface PedidoService extends BaseService<Pedido,Long>{
    DTOPedidoAconfirmar realizarPedido(Pedido pedido) throws Exception;

    Pedido rechazarPedido(Long id) throws Exception;
    Pedido confirmarPedido(Long id)throws Exception;
    List<Pedido> BusquedaPedidos() throws Exception;

    Pedido PedidoListo(Long id) throws Exception;
}
