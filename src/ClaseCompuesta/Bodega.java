package ClaseCompuesta;

import java.util.ArrayList;
import java.util.Scanner;

public class Bodega {
        static ArrayList<Articulos> inventario = new ArrayList<>();
        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            boolean salir = false;

            while (!salir) {
                System.out.println("\nMenú:");
                System.out.println("1. Agregar nuevo artículo");
                System.out.println("2. Editar datos de un artículo");
                System.out.println("3. Buscar un artículo por código de barras");
                System.out.println("4. Eliminar un artículo");
                System.out.println("5. Buscar artículos por nombre");
                System.out.println("6. Mostrar lista de artículos disponibles");
                System.out.println("7. Buscar por ID");
                System.out.println("8. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                switch (opcion) {
                    case 1:
                        agregarArticulo();
                        break;
                    case 2:
                        editarArticulo();
                        break;
                    case 3:
                        buscarPorCodigoBarras();
                        break;
                    case 4:
                        eliminarArticulo();
                        break;
                    case 5:
                        buscarPorNombre();
                        break;
                    case 6:
                        mostrarArticulos();
                        break;
                    case 7:
                        buscarPorID();
                        break;
                    case 8:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            }
        }

        static void agregarArticulo() {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            System.out.print("Código de barras: ");
            String codigoBarras = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Existencia: ");
            int existencia = scanner.nextInt();

            inventario.add(new Articulos (codigoBarras, existencia, nombre,precio,existencia));
            System.out.println("Artículo agregado.");
        }

        static void editarArticulo() {
            System.out.print("Ingrese el ID del artículo a editar: ");
            int id = scanner.nextInt();
            for (Articulos articulo : inventario) {
                if (articulo.getId ()==articulo.getId ());
                articulo.setNombre (articulo.getNombre ());
                articulo.setCodigoBarras (articulo.getCodigoBarras ());
                articulo.setId ();
            }
            System.out.println("Artículo no encontrado.");
        }

        static void buscarPorCodigoBarras() {
            System.out.print("Ingrese el código de barras: ");
            String codigoBarras = scanner.nextLine();
            for (Articulos articulos : inventario) {
                if (articulos.getCodigoBarras ().equals(codigoBarras)) {
                    System.out.println(articulos);
                    return ;
                }
            }
            System.out.println("Artículo no encontrado.");
        }

        static void eliminarArticulo() {
            for (Articulos articulos : inventario){
                if (articulos.getId ()== articulos.getId ());
                eliminarArticulo ();
        }

        static void buscarPorNombre() {
            System.out.print("Ingrese el nombre del artículo: ");
            String nombre = scanner.nextLine();
            for (Articulos articulo : inventario) {
                if (articulo.getNombre ().equalsIgnoreCase (nombre)) {
                    System.out.println(articulo);
                }
            }
        }

        static void mostrarArticulos() {
            for (Articulos articulo : inventario) {
                System.out.println(articulo);
            }
        }

        static void buscarPorID() {
            System.out.print("Ingrese el ID del artículo: ");
            int id = scanner.nextInt();
            for (Articulos articulo : inventario) {
                if (articulo.getId () == articulo.getId ()) {
                    System.out.println(articulo);
                    return;
                }
            }
            System.out.println("Artículo no encontrado.");
        }
    }

}
