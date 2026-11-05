import java.io.File;

public class EliminarFichero {
    public static void main(String[] args) {
        File archivo = new File("estudiantes.txt");
      
        if (archivo.delete()) {
            System.out.println("El archivo " + archivo.getName() + " fue eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo. Es posible que el archivo no exista o esté abierto en otra aplicación.");
        }
    }
}
