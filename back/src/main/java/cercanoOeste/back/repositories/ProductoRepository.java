package cercanoOeste.back.repositories;

import cercanoOeste.back.entities.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends BaseRepository<Producto,Long>{
    //Get all productos dados de alta
    @Query(
            value = "SELECT * FROM producto WHERE producto.fecha_baja IS NULL ",
            nativeQuery = true
    )
    List<Producto> busquedaPorAlta();
    //Dar de baja un producto mediante FechaBaja
}
