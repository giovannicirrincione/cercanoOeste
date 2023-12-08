package cercanoOeste.back.services;

import cercanoOeste.back.entities.Producto;

import java.util.List;

public interface ProductoService extends BaseService<Producto,Long>{
    List<Producto> busquedaPorAlta() throws Exception;
}
