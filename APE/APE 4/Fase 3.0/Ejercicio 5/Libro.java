class Libro {
    private String titulo;
    private boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean prestar() {
        if (!disponible) {
            return false;
        }
        disponible = false;
        return true;
    }

    public void devolver() {
        disponible = true;
    }
}
