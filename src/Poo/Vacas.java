package Poo;

public class Vacas extends Animal {
    private String nombre;
    private Integer edad;
    private String sexo;
    private String raza;

    //metodo constructor va a inicializar los atributos.


    public Vacas () {
    }

    public Vacas (String nombre, Integer edad, String sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }
    public void daleche(){
        System.out.println ("La vaca da leche");
    }

    public void comer(){
        System.out.println ("La vaca pide comida");
    }
    public void correr(){
        System.out.println ("la vaca corre");
    }
    public void respirar(){
        System.out.println ("La vaca respira");
    }

    public Integer getEdad () {
        return edad;
    }

    public void setEdad (Integer edad) {
        this.edad = edad;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getRaza () {
        return raza;
    }

    public void setRaza (String raza) {
        this.raza = raza;
    }

    public String getSexo () {
        return sexo;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }
}
