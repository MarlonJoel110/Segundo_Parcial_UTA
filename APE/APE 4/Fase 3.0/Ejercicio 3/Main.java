public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Cuaderno", 3.50, 10);
        producto.mostrarProducto();
        new Venta(3).aplicar(producto);
        producto.mostrarProducto();
        new Venta(8).aplicar(producto);
        producto.mostrarProducto();
    }
}
