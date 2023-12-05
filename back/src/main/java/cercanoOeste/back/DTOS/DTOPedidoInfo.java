package cercanoOeste.back.DTOS;

import cercanoOeste.back.enumerations.TipoEnvio;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor

public class DTOPedidoInfo {

    private LocalTime horaEstimadaEntrega;
    private float Total;

    private float CostoEnvio;

    @Enumerated(EnumType.STRING)
    private TipoEnvio tipoEnvio;

    private List<DTOProducto> productoList = new ArrayList<DTOProducto>();

    public void setHoraEstimadaEntrega(LocalTime horaEstimadaEntrega) {
        this.horaEstimadaEntrega = horaEstimadaEntrega;
    }

    public void setTotal(float total) {
        Total = total;
    }
    public void setCostoEnvio(float costoEnvio) {
        this.CostoEnvio = costoEnvio;
    }


    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void setProductoList(List<DTOProducto> productoList) {
        this.productoList = productoList;
    }

    public LocalTime getHoraEstimadaEntrega() {
        return horaEstimadaEntrega;
    }

    public float getTotal() {
        return Total;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }
    public float getCostoEnvio(){
        return CostoEnvio;
    }

    public List<DTOProducto> getProductoList() {
        return productoList;
    }
}
