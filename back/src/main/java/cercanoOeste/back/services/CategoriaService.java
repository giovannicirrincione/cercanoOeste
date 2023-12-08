package cercanoOeste.back.services;

import cercanoOeste.back.entities.Categoria;

import java.util.List;

public interface CategoriaService extends BaseService<Categoria,Long>{
    List<Categoria> busquedaPorAltaCategoria() throws Exception;
}
