package Poo;

public abstract class Figura {
    protected String nombre;

    //atributo comun a todas las figuras
    public Figura (String nombre) {
        this.nombre = nombre;
    }

    //cuando una clase es abstracta al menos uno de sus metodos de serlo tambien
    public abstract Double calcularArea ();

    public String mostrarNombre () {
        return "el nombre de la figura es " + nombre;
    }

}

