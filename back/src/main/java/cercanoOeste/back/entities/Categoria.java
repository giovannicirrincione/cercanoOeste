package cercanoOeste.back.entities;

import jakarta.persistence.Column;

import java.time.LocalDateTime;
import java.util.Date;

public class Categoria extends Base{
    private String nombreCategoria;
    @Column(name = "fechaAlta")

    private LocalDateTime fechaAlta;
    @Column(name = "fechaBaja")

    private LocalDateTime fechaBaja;
    @Column(name = "fechaModificacion")

    private LocalDateTime fechaModificacion;


}
