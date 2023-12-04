package cercanoOeste.back.services;

import cercanoOeste.back.entities.Categoria;
import cercanoOeste.back.entities.Pedido;
import cercanoOeste.back.repositories.BaseRepository;
import cercanoOeste.back.repositories.CategoriaRepository;
import cercanoOeste.back.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria,Long> implements CategoriaService{
    @Autowired
    CategoriaRepository categoriaRepository;
    public CategoriaServiceImpl(BaseRepository<Categoria, Long> baseRepository, CategoriaRepository categoriaRepository) {
        super(baseRepository);
    }
}


