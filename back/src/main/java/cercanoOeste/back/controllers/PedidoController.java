package cercanoOeste.back.controllers;

import cercanoOeste.back.DTOS.DTOPedidoInfo;
import cercanoOeste.back.entities.Pedido;
import cercanoOeste.back.services.PedidoService;
import cercanoOeste.back.services.PedidoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{
    //CU realizar PEDIDO
    @PostMapping("/realizarPedido")
    public ResponseEntity<?> realizarPedido(@RequestBody Pedido pedido){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.realizarPedido(pedido));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" + e.getMessage() + "\"}"));
        }
    }
    //MOSTRAR LOS PEDIDOS A EL ADMIN
    @GetMapping("/buscarPedidos")
    public ResponseEntity<?> busquedaAconfirmar(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.BusquedaPedidos());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));

        }
    }
    @PostMapping("/ConfirmarPedido")
    public ResponseEntity<?> confirmarPedido(@RequestParam Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.confirmarPedido(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));

        }
    }
    @PostMapping("/RechazarPedido")
    public ResponseEntity<?> rechazarPedido(@RequestParam Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.rechazarPedido(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));

        }
    }
    @PostMapping("/PedidoListo")
    public ResponseEntity<?> PedidoListo(@RequestParam Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.PedidoListo(id));
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\":\"" +e.getMessage() +"\"}"));

        }
    }

}
