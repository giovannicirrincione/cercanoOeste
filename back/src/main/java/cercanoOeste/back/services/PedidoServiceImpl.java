package cercanoOeste.back.services;

import cercanoOeste.back.DTOS.DTOConfirmacion;
import cercanoOeste.back.DTOS.DTOPagoRealizado;
import cercanoOeste.back.DTOS.DTOPedidoAconfirmar;
import cercanoOeste.back.entities.EstadoPedido;
import cercanoOeste.back.entities.Pedido;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.EstadoPedidoRepository;
import cercanoOeste.back.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.time.Duration;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService {
    @Autowired
    PedidoRepository pedidoRepository;
    @Autowired
    EstadoPedidoRepository estadoPedidoRepository;

    public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoServiceRepository) {
        super(baseRepository);
    }
    // Caso de Uso realizar pedido
    @Override
    public DTOPedidoAconfirmar realizarPedido(Pedido pedido) throws Exception {
       try {
           Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(1L);
           EstadoPedido estadoPedido = optionalEstado.get();
           pedido.setEstadoPedido(estadoPedido);
           DTOPedidoAconfirmar pedidoDTO = new DTOPedidoAconfirmar();
           pedidoDTO.setEstadoPedido("EN_ESPERA");
           Pedido pedidoPersistido = pedidoRepository.save(pedido);
           return pedidoDTO;
       }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    //Confirmar Pedido delivey(ADMIN)
    @Override
    public Pedido AceptarPedidoDelivery(Long id, int demora, int costoEnvio) throws Exception{
        try {
            Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
            Pedido pedido = optionalPedido.get();
            Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(2L);
            EstadoPedido estadoPedido = optionalEstado.get();
            pedido.setEstadoPedido(estadoPedido);
            pedido.setCostoDelivery(costoEnvio);
            pedido.setDemora(demora);
            Pedido pedidoPersistido = pedidoRepository.save(pedido);
            return pedido;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
    //aceptar pedido TAKE AWAY
    @Override
    public Pedido AceptarPedidoTakeAway(Long id, int demora) throws Exception{
        try {
            Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
            Pedido pedido = optionalPedido.get();
            Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(2L);
            EstadoPedido estadoPedido = optionalEstado.get();
            pedido.setEstadoPedido(estadoPedido);
            pedido.setDemora(demora);
            Pedido pedidoPersistido = pedidoRepository.save(pedido);
            return pedido;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
    //Cancelar Pedido(ADMIN)
    @Override
    public Pedido rechazarPedido(Long id) throws Exception{
        try {
            Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
            Pedido pedido = optionalPedido.get();
            Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(4L);
            EstadoPedido estadoPedido = optionalEstado.get();
            pedido.setEstadoPedido(estadoPedido);
            Pedido pedidoPersistido = pedidoRepository.save(pedido);
            return pedido;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    //Buscar pedidos a confirmar
    @Override
    public List<Pedido> BusquedaPedidos() throws Exception {
        try {
            List<Pedido> pedidosaconfir = pedidoRepository.BusquedaPedidos();
            return pedidosaconfir;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public DTOConfirmacion ConfirmarPedido(Long id) throws Exception {
        try {
            Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
            Pedido pedido = optionalPedido.get();
            Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(8L);
            EstadoPedido estadoPedido = optionalEstado.get();
            pedido.setEstadoPedido(estadoPedido);
            Pedido pedidoPersistido = pedidoRepository.save(pedido);
            DTOConfirmacion dtoPedido = new DTOConfirmacion();
            dtoPedido.setCostoTotal(pedido.getCostoDelivery() + pedido.getMontoTotal());
            dtoPedido.setIdpedido(pedido.getId());
            return dtoPedido;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    //El usuario cancela el pedido
    @Override
    public void cancelarPedido(Long id) throws Exception{
        try {
            Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
            Pedido pedido = optionalPedido.get();
            Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(5L);
            EstadoPedido estadoPedido = optionalEstado.get();
            pedido.setEstadoPedido(estadoPedido);
            Pedido pedidoPersistido = pedidoRepository.save(pedido);
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    //Cambiar Estado a pedido Listo para retirar
    @Override
    public Pedido PedidoListo(Long id) throws Exception{
        try {
            Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
            Pedido pedido = optionalPedido.get();
            Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(6L);
            EstadoPedido estadoPedido = optionalEstado.get();
            pedido.setEstadoPedido(estadoPedido);
            Pedido pedidoPersistido = pedidoRepository.save(pedido);
            return pedido;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    //Cuando el cliente realiza el pago con exito
    @Override
    public DTOPagoRealizado pagoRealizado(Long id) throws Exception{
        try {
            Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
            Pedido pedido = optionalPedido.get();
            Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(7L);
            EstadoPedido estadoPedido = optionalEstado.get();
            pedido.setEstadoPedido(estadoPedido);
            DTOPagoRealizado infoPedido = new DTOPagoRealizado();
            int horasAgregadas = pedido.getDemora();
            Duration duracion = Duration.ofHours(horasAgregadas);
            infoPedido.setHoraIniEsperada(pedido.getFechaHoraPedido().plus(duracion));
            Pedido pedidoPersistido = pedidoRepository.save(pedido);
            return infoPedido;
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}