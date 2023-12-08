package cercanoOeste.back.controllers;

import cercanoOeste.back.entities.CircuitoOrden;
import cercanoOeste.back.services.CircuitoOrdenServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/circuitoOrden")
public class CircuitoOrdenController extends BaseControllerImpl<CircuitoOrden, CircuitoOrdenServiceImpl>{
}
