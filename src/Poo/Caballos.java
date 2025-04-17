package Poo;

public class Caballos extends Animal{
    private String nombre;
    private Integer edad;
    private String sexo;
    private String raza;

    //metodo constructor va a inicializar los atributos.


    public Caballos () {
    }

    public Caballos (String nombre, Integer edad, String sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }
    //metodos propios de la clase
    public void trotar(){
        System.out.println ("El caballo trota");
    }

    @Override
    public void comer () {

    }

    public void correr(){
        System.out.println ("El caballo corre sobre la pista ");
    }

    @Override
    public void respirar () {

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
