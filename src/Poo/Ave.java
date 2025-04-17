package Poo;

public class Ave extends Animal{
    private String nombre;
    private Integer edad;
    private String sexo;
    private String raza;

    //metodo constructor va a inicializar los atributos.


    public Ave () {
    }

    public Ave (String nombre, Integer edad, String sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }
    //metodos propios de la clase
    public void vuela(){
        System.out.println ("El ave despliega el vuelo");
    }

    public void comer(){
        System.out.println ("El caza para comer");
    }
    public void correr(){
        System.out.println ("El ave corre");
    }
    public void respirar(){
        System.out.println ("el ave respira");
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
