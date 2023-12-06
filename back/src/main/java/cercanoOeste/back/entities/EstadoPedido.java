package cercanoOeste.back.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "estadopedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EstadoPedido extends Base{
    private String nombre;
}
