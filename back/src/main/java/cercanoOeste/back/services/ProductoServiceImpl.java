package cercanoOeste.back.services;

import cercanoOeste.back.entities.Producto;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto,Long> implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
        super(baseRepository);

    }
    @Override
    public List<Producto> busquedaPorAlta() throws Exception {
        try {
            List<Producto> productos = productoRepository.busquedaPorAlta();
            return productos;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
