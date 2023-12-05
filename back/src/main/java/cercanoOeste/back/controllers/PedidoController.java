package cercanoOeste.back.controllers;

import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.entities.Pedido;
import cercanoOeste.back.services.PedidoService;
import cercanoOeste.back.services.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{

    @PostMapping("/realizarPedido")
    public ResponseEntity<?> realizarPedido(@RequestBody Pedido pedido){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.realizarPedido(pedido));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" + e.getMessage() + "\"}"));
        }
    }

}
