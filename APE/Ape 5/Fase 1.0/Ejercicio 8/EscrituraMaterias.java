import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraMaterias {
    public static void main(String[] args) {

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("materias.txt"));

            bw.write("Programación I");
            bw.newLine();

            bw.write("Bases de Datos");
            bw.newLine();

            bw.write("Estructuras de Datos");
            bw.newLine();

            bw.write("Sistemas Operativos");
            bw.newLine();

            bw.write("Álgebra Lineal");
            bw.newLine();

            System.out.println("¡El archivo 'materias.txt' se ha generado con éxito!");

        } catch (IOException e) {
            System.err.println("Error durante la escritura del archivo: " + e.getMessage());
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                    System.out.println("Flujo de datos cerrado correctamente.");
                }
            } catch (IOException ex) {
                System.err.println("Error al cerrar el archivo: " + ex.getMessage());
            }
        }
    }
}
