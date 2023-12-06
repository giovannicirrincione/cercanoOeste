package cercanoOeste.back.services;

import cercanoOeste.back.entities.Circuito;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.CircuitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircuitoServiceImpl extends BaseServiceImpl<Circuito,Long> implements CircuitoService{
    @Autowired
    CircuitoRepository circuitoRepository;
    public CircuitoServiceImpl(BaseRepository<Circuito, Long> baseRepository,CircuitoRepository circuitoRepository) {
        super(baseRepository);
    }
}
