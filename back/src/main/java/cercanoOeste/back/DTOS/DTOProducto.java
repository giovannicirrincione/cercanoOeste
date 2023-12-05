package cercanoOeste.back.DTOS;

public class DTOProducto {
    private int cantidad;
    private String Nombre;

    private float subtotal;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
