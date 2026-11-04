import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese un mensaje: ");
            String mensaje = teclado.nextLine();

            FileWriter archivo = new FileWriter("estudiantes.txt", true);

            archivo.write(mensaje + "\n");

            archivo.close();

            System.out.println("La informacion se guardo correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir el archivo.");
        }
    }
}
