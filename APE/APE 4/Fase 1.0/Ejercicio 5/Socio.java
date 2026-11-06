class Socio {
    String nombre;
    int librosPrestados;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }

    public void prestarLibro(Libro libro) {
        if (libro.disponible) {
            libro.prestar();
            this.librosPrestados++;
        }
    }

    public void imprimirEstado() {
        System.out.println(nombre + ": " + librosPrestados + " libros prestados");
    }
}