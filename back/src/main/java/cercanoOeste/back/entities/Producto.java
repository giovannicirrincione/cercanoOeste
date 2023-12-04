package cercanoOeste.back.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto extends Base{
    private String nombre;
    private String descripcion;
    private float monto;
    private String urlImagen;

    @Column(name = "fechaAlta")
    private LocalDateTime fechaAlta;

    @Column(name = "fechaBaja")
    private LocalDateTime fechaBaja;

    @Column(name = "fechaModificacion")
    private LocalDateTime fechaModificacion;

    @ManyToOne(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_categoria")
    private Categoria categoria;
}
