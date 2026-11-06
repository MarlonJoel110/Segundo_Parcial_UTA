import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraMaterias {
    public static void main(String[] args) {
        // Arreglo con el listado de 5 asignaturas de elección
        String[] asignaturas = {
            "Programación Orientada a Objetos",
            "Estructuras de Datos",
            "Bases de Datos",
            "Desarrollo Web",
            "Sistemas Operativos"
        };

        // 1 y 4. Configurar flujo de salida con try-with-resources (garantiza el close() automático)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("materias.txt"))) {
            
            // 2. Recorrer el listado de asignaturas
            for (String asignatura : asignaturas) {
                bw.write(asignatura);
                
                // 3. Emplear el método portable newLine() para separar por líneas independientes
                bw.newLine();
            }
            
            System.out.println("Archivo 'materias.txt' creado y guardado con éxito.");

        } catch (IOException e) {
            // 4. Controlar cualquier error potencial de escritura
            System.err.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
        }
    }
}
