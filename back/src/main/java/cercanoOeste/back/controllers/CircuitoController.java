package cercanoOeste.back.controllers;

import cercanoOeste.back.entities.Circuito;
import cercanoOeste.back.services.CircuitoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/admin/circuito")
public class CircuitoController extends BaseControllerImpl<Circuito, CircuitoServiceImpl> {
}
