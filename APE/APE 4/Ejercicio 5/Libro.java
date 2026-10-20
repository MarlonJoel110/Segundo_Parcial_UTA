class Libro {
    String titulo;
    String autor;
    boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void imprimirEstado() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println(titulo + ": " + estado);
    }
}