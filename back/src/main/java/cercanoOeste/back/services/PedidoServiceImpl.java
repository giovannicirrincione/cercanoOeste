package cercanoOeste.back.services;

import cercanoOeste.back.DTOS.DTOPedidoAconfirmar;
import cercanoOeste.back.entities.EstadoPedido;
import cercanoOeste.back.entities.Pedido;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.EstadoPedidoRepository;
import cercanoOeste.back.repositories.PedidoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
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
    //Confirmar Pedido(ADMIN)
    @Override
    public Pedido confirmarPedido(Long id) throws Exception{
        try {
            Optional<Pedido> optionalPedido = pedidoRepository.findById(id);
            Pedido pedido = optionalPedido.get();
            Optional<EstadoPedido> optionalEstado = estadoPedidoRepository.findById(2L);
            EstadoPedido estadoPedido = optionalEstado.get();
            pedido.setEstadoPedido(estadoPedido);
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
}