package clase3;

import java.util.ArrayList;
import java.util.List;

public class Netflix {

       static class Suscriptor {
            private String nombreUsuario;
            private String contraseña; // Esto debería estar cifrado en una aplicación real.
            private String fechaInicio;
            private boolean estaActivo;

            public Suscriptor(String nombreUsuario, String contraseña, String fechaInicio, boolean estaActivo) {
                this.nombreUsuario = nombreUsuario;
                this.contraseña = contraseña;
                this.fechaInicio = fechaInicio;
                this.estaActivo = estaActivo;
            }

            public String getInfo() {
                return "Usuario: " + nombreUsuario +
                        "\nFecha de inicio: " + fechaInicio +
                        "\nActivo: " + (estaActivo ? "Sí" : "No");
            }
        }

        public static class NetflixSuscriptores {
            public void main (String[] args) {
                List<Suscriptor> suscriptores = new ArrayList<> ();

                // Agregar suscriptores de ejemplo
                suscriptores.add(new Suscriptor("usuario1", "contraseña1", "01/01/2025", true));
                suscriptores.add(new Suscriptor("usuario2", "contraseña2", "15/02/2025", false));
                suscriptores.add(new Suscriptor("usuario3", "contraseña3", "10/03/2025", true));

                // Mostrar información de cada suscriptor
                for (Suscriptor s : suscriptores) {
                    System.out.println(s.getInfo());
                    System.out.println("------------");
                }
            }
        }
    }

