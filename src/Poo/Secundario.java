package Poo;

public class Secundario {
    public static void main (String[] args) {
        Gato gato = new Gato ("silvestre",5,"macho","carey");
        System.out.println ("El michi se llama "+gato.getNombre ()+
                "\n" + "edad: "+gato.getEdad ()
                        +"\n"+"sexo: "+gato.getSexo ()+
                        "\n"+"raza:"+gato.getRaza ());

        gato.comer ();
        gato.emitirSonidp ();

    }

}
