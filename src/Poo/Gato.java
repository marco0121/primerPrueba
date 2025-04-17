package Poo;

public class Gato extends Animal{
    private String nombre;
    private Integer edad;
    private String sexo;
    private String raza;

    //metodo constructor va a inicializar los atributos.


    public Gato () {
    }

    public Gato(String nombre, Integer edad, String sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;

    }

    //metodo
   // public void maullar(){
      //  System.out.println ("El Gato maulla");
    //}
    //public void comer(){
    //    System.out.println ("El Gato como wiskas");
   // }

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

    @Override
    public void comer () {

    }

    @Override
    public void respirar () {

    }
}
