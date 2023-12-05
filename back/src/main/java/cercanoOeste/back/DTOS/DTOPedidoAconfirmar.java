package cercanoOeste.back.DTOS;

import cercanoOeste.back.enumerations.EstadoPedido;
import cercanoOeste.back.enumerations.TipoEnvio;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class DTOPedidoAconfirmar {
    @Enumerated(EnumType.STRING)
    private EstadoPedido estadoPedido;
    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }
}
