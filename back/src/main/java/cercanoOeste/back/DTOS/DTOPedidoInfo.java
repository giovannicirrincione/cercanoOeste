package cercanoOeste.back.DTOS;

import cercanoOeste.back.enumerations.TipoEnvio;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DTOPedidoInfo {

    private LocalTime horaEstimadaEntrega;
    private float Total;
    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    private List<DTOProducto> productoList = new ArrayList<DTOProducto>();

    public void setHoraEstimadaEntrega(LocalTime horaEstimadaEntrega) {
        this.horaEstimadaEntrega = horaEstimadaEntrega;
    }

    public void setTotal(float total) {
        Total = total;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void setProductoList(List<DTOProducto> productoList) {
        this.productoList = productoList;
    }
}
