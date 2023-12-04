package cercanoOeste.back.services;

import cercanoOeste.back.entities.Producto;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);

    }
}
