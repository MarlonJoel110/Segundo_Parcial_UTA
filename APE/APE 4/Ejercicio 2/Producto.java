class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void vender(int cantidad) {
        this.stock -= cantidad;
    }

    public void imprimir() {
        String reponer = (stock < 5) ? " Reponer" : "";
        System.out.println(nombre + ": $" + precio + reponer);
    }
}