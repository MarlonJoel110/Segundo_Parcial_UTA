import java.io.File;
import java.io.IOException;

public class CicloVidaFichero {
    public static void main(String[] args) {
        File archivoTemporal = new File("datos/temporal.txt");

        if (archivoTemporal.exists()) {
            System.out.println("El archivo temporal ya existe.");
        } else {
            System.out.println("El archivo no existe. Creándolo de forma segura...");
            
            File carpeta = archivoTemporal.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            try {
                if (archivoTemporal.createNewFile()) {
                    System.out.println("Archivo temporal creado exitosamente.");
                } else {
                    System.out.println("No se pudo crear el archivo temporal.");
                }
            } catch (IOException e) {
                System.err.println("Error de E/S al crear el archivo: " + e.getMessage());
                return;
            }
        }

        boolean confirmarBorrado = true; 
        System.out.println("\nSimulando validación de usuario... ¿Confirmar borrado?: " + confirmarBorrado);

        if (confirmarBorrado) {
            boolean resultadoEliminacion = archivoTemporal.delete();
            
            System.out.println("Resultado booleano de la operación de eliminación (delete()): " + resultadoEliminacion);
            
            if (resultadoEliminacion) {
                System.out.println("El archivo se eliminó de forma segura de la carpeta.");
            } else {
                System.out.println("No se pudo eliminar el archivo físico (puede estar abierto en otro flujo).");
            }
        } else {
            System.out.println("Operación de borrado cancelada. El archivo permanece intacto.");
        }
    }
}
