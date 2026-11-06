public class objetoProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("Arroz", 1.50, 10);
        Producto p2 = new Producto("Leche", 0.90, 4);
        Producto p3 = new Producto("Pan", 0.15, 7);
        Producto p4 = new Producto("Aceite", 2.50, 6);

        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
        p4.imprimir();

        p1.vender(3);
        p4.vender(3);

        System.out.println("\n--- Estado después de las ventas ---");
        p1.imprimir();
        p2.imprimir();
        p3.imprimir();
        p4.imprimir();

        double valorTotal = (p1.precio * p1.stock)+(p2.precio * p2.stock)+(p3.precio * p3.stock)+
                            (p4.precio * p4.stock);

        System.out.println("\nValor total del inventario: $" + valorTotal);
    }
}
