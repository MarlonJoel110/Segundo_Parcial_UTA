import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreArchivo = "productos.txt";
        
        System.out.println("--- Registro de Productos ---");
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = teclado.nextLine();
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = teclado.nextDouble();
        
        System.out.print("Ingrese la cantidad disponible: ");
        int cantidad = teclado.nextInt();
        
        double valorTotal = precio * cantidad;
        
        try (FileWriter fw = new FileWriter(nombreArchivo, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            
            String registro = String.format("Producto: %s | Precio: %.2f | Cantidad: %d | Total: %.2f", 
                                            nombre, precio, cantidad, valorTotal);
            
            bw.write(registro);
            bw.newLine();
            
            System.out.println("\nProducto registrado y aniadido con exito al archivo!");
            
        } catch (IOException e) {
            System.out.println("Ocurrio un error al escribir en el archivo: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
