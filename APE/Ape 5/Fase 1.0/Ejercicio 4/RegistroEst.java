import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEst{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombreArchivo = "estudiantes.txt";
        
        System.out.println("--- Registro de Estudiantes y Calificaciones ---");

        try (FileWriter fw = new FileWriter(nombreArchivo);
             BufferedWriter bw = new BufferedWriter(fw)) {

            for (int i = 1; i <= 3; i++) {
                System.out.println("\nEstudiante " + i + ":");
                
                System.out.print("Ingrese el nombre: ");
                String nombre = teclado.nextLine();
                
                System.out.print("Ingrese la calificacion: ");
                String calificacion = teclado.nextLine();
                
                bw.write(nombre);
                bw.newLine(); 
                bw.write(calificacion);
                bw.newLine(); 
            }
            
            System.out.println("\nInformacion guardada exitosamente en " + nombreArchivo + "!");
            
        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir en el archivo: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
