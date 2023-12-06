package cercanoOeste.back.DTOS;

import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDateTime;

@NoArgsConstructor
public class DTOPagoRealizado {
    private LocalDateTime horaIniEsperada;
    private LocalDateTime horaFinEsperada;

    public DTOPagoRealizado(LocalDateTime horaIniEsperada, LocalDateTime horaFinEsperada) {
        this.horaIniEsperada = horaIniEsperada;
        this.horaFinEsperada = horaFinEsperada;
    }

    public LocalDateTime getHoraIniEsperada() {
        return horaIniEsperada;
    }

    public LocalDateTime getHoraFinEsperada() {
        return horaFinEsperada;
    }

    public void setHoraIniEsperada(LocalDateTime horaIniEsperada) {
        this.horaIniEsperada = horaIniEsperada;
    }

    public void setHoraFinEsperada(LocalDateTime horaFinEsperada) {
        this.horaFinEsperada = horaFinEsperada;
    }
}
