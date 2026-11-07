import java.io.File;
import java.io.IOException;

public class ExploracionMetadatos {
    public static void main(String[] args) {
        // Definir la ruta especificada
        File archivo = new File("datos/prueba.txt");

        if (archivo.exists()) {
            System.out.println("El recurso ya existe en el disco.");
        } else {
            System.out.println("El recurso no existe. Iniciando creacion...");
            
            File carpeta = archivo.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado con éxito.");
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        }

        System.out.println("\n--- Informacion del Archivo ---");
        System.out.println("Ultimo nombre de la ruta (getName()): " + archivo.getName());
        System.out.println("Ruta con la que se construyo (getPath()): " + archivo.getPath());
    }
}
