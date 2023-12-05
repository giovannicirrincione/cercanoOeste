package cercanoOeste.back.entities;

import cercanoOeste.back.enumerations.EstadoPedido;
import cercanoOeste.back.enumerations.FormaPago;
import cercanoOeste.back.enumerations.TipoEnvio;
import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pedido extends Base{
   private String apellidoCliente;

   private String direccionEntrega;

   private String nombreCliente;

   private int telefonoCliente;

   private float montoTotal;

    @Column(name = "fechaHoraPedido")
    private LocalDateTime fechaHoraPedido;

    @Column(name = "fechaHoraBaja")
    private LocalDateTime fechaHoraBaja;

    @Column(name="formaPago")
    @Enumerated(EnumType.STRING)
    private FormaPago formaPago;

    @Column(name = "estadoPedido")
    @Enumerated(EnumType.STRING)
    private EstadoPedido estadoPedido;

    @Column(name = "tipoEnvio")
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetallePedido> detalles = new ArrayList<DetallePedido>();
}
