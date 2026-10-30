class Prestamo {
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo registrado para "
                + usuario.getNombre() + ": " + libro.getTitulo());
        } else {
            System.out.println("No se pudo registrar el préstamo para "
                + usuario.getNombre() + ": libro no disponible.");
        }
    }
}
