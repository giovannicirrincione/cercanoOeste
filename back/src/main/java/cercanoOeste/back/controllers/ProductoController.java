package cercanoOeste.back.controllers;

import cercanoOeste.back.entities.Producto;
import cercanoOeste.back.services.ProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/Producto")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl>{
}
