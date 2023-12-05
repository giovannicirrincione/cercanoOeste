package cercanoOeste.back.services;

import cercanoOeste.back.DTOS.DTOPedidoAconfirmar;
import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.entities.Pedido;

import java.util.List;

public interface PedidoService extends BaseService<Pedido,Long>{
    DTOPedidoAconfirmar realizarPedido(Pedido pedido);
    List<Pedido> BusquedaAConfimar() throws Exception;
}
