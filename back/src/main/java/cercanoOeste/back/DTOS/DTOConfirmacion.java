package cercanoOeste.back.DTOS;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DTOConfirmacion {
    private Long idpedido;
    private float costoTotal;

    public DTOConfirmacion(Long idpedido, int costoTotal) {
        this.idpedido = idpedido;
        this.costoTotal = costoTotal;
    }

    public Long getIdpedido() {
        return idpedido;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setIdpedido(Long idpedido) {
        this.idpedido = idpedido;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }
}
