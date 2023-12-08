package cercanoOeste.back.controllers;

import cercanoOeste.back.entities.Categoria;
import cercanoOeste.back.services.CategoriaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/categoria")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaServiceImpl>{
    @GetMapping("/busquedaPorAltaCat")
    public ResponseEntity<?> busquedaPorAltaCategoria(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.busquedaPorAltaCategoria());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));

        }
    }
}
