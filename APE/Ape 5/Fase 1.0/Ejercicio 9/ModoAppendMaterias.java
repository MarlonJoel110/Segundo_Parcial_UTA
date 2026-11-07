import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ControlApertura {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("materias.txt", true));

            bw.write("Desarrollo Web");
            bw.newLine();

            bw.write("Inteligencia Artificial");
            bw.newLine();

            System.out.println("¡Nuevas asignaturas añadidas con éxito en modo append!");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                    System.out.println("Flujo de datos cerrado.");
                }
            } catch (IOException ex) {
                System.err.println("Error al cerrar el archivo: " + ex.getMessage());
            }
        }
    }
}
