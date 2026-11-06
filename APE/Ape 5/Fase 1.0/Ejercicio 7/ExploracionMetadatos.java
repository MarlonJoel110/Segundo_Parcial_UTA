import java.io.File;
import java.io.IOException;

public class ExploracionMetadatos {
    public static void main(String[] args) {
        // Definir la ruta especificada
        File archivo = new File("datos/prueba.txt");

        // 1. Comprobación previa
        if (archivo.exists()) {
            System.out.println("El recurso ya existe en el disco.");
        } else {
            System.out.println("El recurso no existe. Iniciando creación...");
            
            // Asegurar que la carpeta contenedor 'datos' exista para evitar excepciones
            File carpeta = archivo.getParentFile();
            if (carpeta != null && !carpeta.exists()) {
                carpeta.mkdirs();
            }

            // 2. Creación controlada con bloque try-catch para IOException
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

        // 3. Extracción de información
        System.out.println("\n--- Información del Archivo ---");
        System.out.println("Último nombre de la ruta (getName()): " + archivo.getName());
        System.out.println("Ruta con la que se construyó (getPath()): " + archivo.getPath());
    }
}
