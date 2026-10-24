public class Gastos {
    private String descripcion;
    private double importe;
    private String categoria;

    public Gastos(String descripcion, double importe, String categoria) {
        this.descripcion = descripcion;
        this.importe = importe;
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getImporte() {
        return importe;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override 
    public String toString() {
        return descripcion + " (" + categoria + ");"  + importe + " €";
    }

}
