public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Autor A", "Colombiana");
        Autor autor2 = new Autor("Autor B", "Ecuatoriana");
        Libro libro1 = new Libro("Introducción a Java", 2024, autor1);
        Libro libro2 = new Libro("Lógica de programación", 2025, autor2);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
