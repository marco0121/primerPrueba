package ClaseCompuesta;

public class Articulos {
    private String id;
    private String nombre;
    private String codigoBarras;
    private String precio;
    private String existencia;

    public Articulos (String codigoBarras, int existencia, String id, String nombre, String precio) {
        this.codigoBarras = codigoBarras;
        this.existencia = String.valueOf (existencia);
        this.id = id;
        this.nombre = nombre;
        this.precio = String.valueOf (Double.parseDouble (precio));
    }

    public Articulos (String codigoBarras, int existencia, String nombre, double precio, int existencia1) {
    }

    public String getCodigoBarras () {
        return codigoBarras;
    }

    public void setCodigoBarras (String codigoDeBarras) {
        this.codigoBarras = codigoDeBarras;
    }

    public String getExistencia () {
        return existencia;
    }

    public void setExistencia () {
        this.existencia = String.valueOf (existencia);
    }

    public String getId () {
        return id;
    }

    public void setId () {
        this.id = id;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio () {
        return precio;
    }

    public void setPrecio (String precio) {
        this.precio = String.valueOf (Double.parseDouble (precio));
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Código de Barras: " + codigoBarras + ", Existencia: " + existencia;
    }

}
