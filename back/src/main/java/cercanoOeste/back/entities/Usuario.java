package cercanoOeste.back.entities;

import cercanoOeste.back.enumerations.FormaPago;
import cercanoOeste.back.enumerations.Rol;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Usuario extends Base {
private String nombreUsuario;
    @Column(name="Rol")
    @Enumerated(EnumType.STRING)
    private Rol rol;
}
