package Poo;

public class Principal {
    public static void main (String[] args) {
        //instanciando la clase perro
       /* Perro perro = new Perro ("bombom",4,"macho","mestizo");
        System.out.println ("El nombre del perro es: " + perro.getNombre ());*/


       /* Perro miPerro = new Perro ();
        miPerro.setNombre ("Roko");
        miPerro.setEdad (15);
        miPerro.setSexo ("Macho");
        miPerro.setRaza ("Doberman");
       System.out.println ("Nombre:" + miPerro.getNombre ()+ "\n" +
                "edad:" + miPerro.getEdad ()+ "\n" + "sexo:"
                + miPerro.getSexo ()+"\n"+ "raza: "+miPerro.getRaza ());
        miPerro.entrena ();
        miPerro.juega ();*/
        Vacas vacas = new Vacas ();
        vacas.setEdad (10);// seguir editando con vaca ave y caballo
        vacas.setRaza ("mestiza");
        vacas.setNombre ("lola");
        vacas.setSexo ("hembra");
        System.out.println ("mi vaca se llama "+vacas.getNombre ());

        vacas.correr ();




    }

}
