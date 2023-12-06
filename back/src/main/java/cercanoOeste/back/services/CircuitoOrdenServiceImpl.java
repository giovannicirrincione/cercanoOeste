package cercanoOeste.back.services;

import cercanoOeste.back.entities.CircuitoOrden;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.CircuitoOrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircuitoOrdenServiceImpl extends BaseServiceImpl<CircuitoOrden,Long> implements CircuitoOrdenService{
    @Autowired
    CircuitoOrdenRepository circuitoOrdenRepository;
    public CircuitoOrdenServiceImpl(BaseRepository<CircuitoOrden, Long> baseRepository,CircuitoOrdenRepository circuitoOrdenRepository) {
        super(baseRepository);
    }
}
