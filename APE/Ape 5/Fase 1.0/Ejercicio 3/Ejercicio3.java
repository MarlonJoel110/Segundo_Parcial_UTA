import java.io.File;

public class Ejercicio3 {

    public static void main(String[] args) {
        File archivo = new File("estudiantes.txt");

        if (archivo.delete()) {
            System.out.println("El archivo " + archivo.getName() + " se eliminó correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo. Verifica que exista y que no esté abierto en otro programa.");
        }
    }
}
