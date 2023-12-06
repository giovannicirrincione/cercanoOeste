package cercanoOeste.back.services;

import cercanoOeste.back.entities.EstadoPedido;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.EstadoPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstadoPedidoServiceImpl extends BaseServiceImpl<EstadoPedido,Long> implements EstadoPedidoService{
    @Autowired
    EstadoPedidoRepository estadoPedidoRepository;
    public EstadoPedidoServiceImpl(BaseRepository<EstadoPedido, Long> baseRepository, EstadoPedidoRepository estadoPedidoRepository) {
        super(baseRepository);
    }
}
