import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SistemaVentas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreArchivo = "ventas.txt";
        
        double totalAcumuladoGeneral = 0.0;
        
        System.out.println("--- SISTEMA DE REGISTRO DE VENTAS ---");
        
        try (FileWriter fw = new FileWriter(nombreArchivo, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            
            bw.write("=== Nueva Sesión de Ventas ===");
            bw.newLine();
            
            while (true) {
                System.out.print("\nIngrese el nombre del producto (o escriba 'fin' para terminar): ");
                String producto = teclado.nextLine();
                
                if (producto.equalsIgnoreCase("fin")) {
                    break;
                }
                
                System.out.print("Ingrese el precio: ");
                double precio = teclado.nextDouble();
                
                System.out.print("Ingrese la cantidad vendida: ");
                int cantidad = teclado.nextInt();
                teclado.nextLine(); 
                
                double subtotal = precio * cantidad;
                double descuento = 0.0;
                
                if (subtotal >= 100.0) {
                    descuento = subtotal * 0.10;
                }
                
                double totalPagar = subtotal - descuento;
                
                totalAcumuladoGeneral += totalPagar;
                
                System.out.printf("Subtotal: $%.2f | Descuento: $%.2f | Total a Pagar: $%.2f\n", 
                                  subtotal, descuento, totalPagar);
                
                String lineaVenta = String.format("Producto: %s | Cantidad: %d | Total Venta: $%.2f", 
                                                  producto, cantidad, totalPagar);
                bw.write(lineaVenta);
                bw.newLine();
            }
            
            String lineaTotal = String.format("TOTAL ACUMULADO DE LA SESION: $%.2f", totalAcumuladoGeneral);
            bw.write(lineaTotal);
            bw.newLine();
            bw.write("=================================");
            bw.newLine();
            
            System.out.printf("\nSesión finalizada. Total acumulado del día: $%.2f. Datos guardados.\n", totalAcumuladoGeneral);
            
        } catch (IOException e) {
            System.out.println("Error al interactuar con el archivo de ventas: " + e.getMessage());
        } finally {
            teclado.close();
        }
    }
}
