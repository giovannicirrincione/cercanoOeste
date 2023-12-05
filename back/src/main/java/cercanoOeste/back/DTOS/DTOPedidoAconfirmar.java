package cercanoOeste.back.DTOS;

import cercanoOeste.back.enumerations.EstadoPedido;
import cercanoOeste.back.enumerations.TipoEnvio;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DTOPedidoAconfirmar {

    private String estadoPedido;
    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }
}
