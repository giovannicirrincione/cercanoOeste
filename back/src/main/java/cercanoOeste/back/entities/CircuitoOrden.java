package cercanoOeste.back.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "circuitoOrden")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CircuitoOrden extends Base{
    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_origen")
    private EstadoPedido origen;

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_destino")
    private EstadoPedido destino;
    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_circuito")
    private Circuito circuito;
}
