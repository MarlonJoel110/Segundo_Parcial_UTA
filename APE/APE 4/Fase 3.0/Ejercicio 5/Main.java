public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ana", "0000000001");
        Usuario usuario2 = new Usuario("Luis", "0000000002");
        Libro libro = new Libro("Programación en Java");
        Prestamo prestamo1 = new Prestamo(usuario1, libro);
        Prestamo prestamo2 = new Prestamo(usuario2, libro);

        prestamo1.registrar();
        prestamo2.registrar();
    }
}
