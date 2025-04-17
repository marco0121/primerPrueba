package ClaseCompuesta;

public class Pantalla {
    private String Resolucion;
    private String tipo;

    public Pantalla (String resolucion, String tipo) {
        Resolucion = resolucion;
        this.tipo = tipo;
    }

    public String getResolucion () {
        return Resolucion;
    }

    public void setRresolucion (String resolucion) {
        Resolucion = resolucion;
    }

    public String getTipo () {
        return tipo;
    }

    public void setTipo (String tipo) {
        this.tipo = tipo;
    }
}
