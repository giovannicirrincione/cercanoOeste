package cercanoOeste.back.services;

import cercanoOeste.back.DTOS.DTOConfirmacion;
import cercanoOeste.back.DTOS.DTOPagoRealizado;
import cercanoOeste.back.DTOS.DTOPedidoAconfirmar;
import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.entities.Pedido;

import java.util.List;

public interface PedidoService extends BaseService<Pedido,Long>{
    DTOPedidoAconfirmar realizarPedido(Pedido pedido) throws Exception;

    Pedido rechazarPedido(Long id) throws Exception;
    Pedido AceptarPedidoDelivery(Long id,int demora, int costoEnvio)throws Exception;

    Pedido AceptarPedidoTakeAway(Long id, int demora) throws Exception;
    List<Pedido> BusquedaPedidos() throws Exception;
    DTOConfirmacion ConfirmarPedido(Long id) throws Exception;

    void cancelarPedido(Long id) throws Exception;
    DTOPagoRealizado pagoRealizado(Long id) throws Exception;
    Pedido PedidoListo(Long id) throws Exception;
}
