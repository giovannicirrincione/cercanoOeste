package cercanoOeste.back.controllers;

import cercanoOeste.back.entities.EstadoPedido;
import cercanoOeste.back.services.EstadoPedidoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/admin/EstadoPedido")

public class EstadoPedidoController extends BaseControllerImpl<EstadoPedido, EstadoPedidoServiceImpl>{
}
