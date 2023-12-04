package cercanoOeste.back.services;

import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.entities.Pedido;

public interface PedidoService extends BaseService<Pedido,Long>{
    DTOPedidoInfo realizarPedido(Pedido pedido);
}
