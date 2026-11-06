import java.io.File;
import java.io.IOException;

public class CicloVidaFichero {
    public static void main(String[] args) {
        // 1. Construir un objeto File que represente la ruta especificada
        File archivoTemporal = new File("datos/temporal.txt");

        // 2. Consulta de estado y creación segura
        if (archivoTemporal.exists()) {
            System.out.println("El archivo temporal ya existe.");
        } else {
            System.out.println("El archivo no existe. Creándolo de forma segura...");
            
            // Asegurar que la carpeta contenedora exista
            File carpeta = archivoTemporal.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            // Bloque try-catch obligatorio para controlar IOException
            try {
                if (archivoTemporal.createNewFile()) {
                    System.out.println("Archivo temporal creado exitosamente.");
                } else {
                    System.out.println("No se pudo crear el archivo temporal.");
                }
            } catch (IOException e) {
                System.err.println("Error de E/S al crear el archivo: " + e.getMessage());
                return; // Finaliza si no se pudo crear por un error del sistema
            }
        }

        // 3. Declaración de la variable de control booleana para simular confirmación
        boolean confirmarBorrado = true; 
        System.out.println("\nSimulando validación de usuario... ¿Confirmar borrado?: " + confirmarBorrado);

        // 4. Utilizar el método delete() condicionado a la confirmación
        if (confirmarBorrado) {
            // El método delete() devuelve un booleano (true si se eliminó, false si falló)
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
