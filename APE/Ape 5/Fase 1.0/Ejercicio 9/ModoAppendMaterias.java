import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ModoAppendMaterias {
    public static void main(String[] args) {
        // Nuevas asignaturas para añadir al final del archivo existente
        String[] nuevasAsignaturas = {
            "Redes de Computadoras",
            "Inteligencia Artificial"
        };

        // El segundo parámetro 'true' en el constructor de FileWriter activa el modo APPEND
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("materias.txt", true))) {
            
            // Añadir las nuevas materias
            for (String asignatura : nuevasAsignaturas) {
                bw.write(asignatura);
                bw.newLine(); // Mantiene la estructura de una asignatura por línea
            }
            
            System.out.println("Nuevas asignaturas añadidas con éxito al final de 'materias.txt'.");

        } catch (IOException e) {
            System.err.println("Error al intentar escribir en el archivo: " + e.getMessage());
        }
    }
}
