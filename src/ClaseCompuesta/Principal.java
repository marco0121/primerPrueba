package ClaseCompuesta;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private ArrayList<Articulos> articulos = new ArrayList<> ();
    private Scanner scanner = new Scanner (System.in);

    public void agregarArticulo(){
        System.out.println ("Ingrese id");
        String id = scanner.nextLine ();
        System.out.println ("Ingrese nombre: ");
        String nombre = scanner.nextLine ();
        System.out.println ("Ingrese codigo de barras: ");
        String codigoBarras = scanner.nextLine ();
    }
}
