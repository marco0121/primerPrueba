package clase4;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main (String[] args) {
        Map<String, String> persona = new HashMap<> ();

        persona.put ("nombre", "Juan Perez");
        persona.put ("Edad", "32");
        persona.put ("sexo", "Hombre");
        persona.put ("Correo", "juanperez@gmail.com");

        for (String personas : persona.values ()) {
            System.out.println ("* " + personas);

        }
    }
}
