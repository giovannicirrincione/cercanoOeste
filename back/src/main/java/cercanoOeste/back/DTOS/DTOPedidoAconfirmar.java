package cercanoOeste.back.DTOS;

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
