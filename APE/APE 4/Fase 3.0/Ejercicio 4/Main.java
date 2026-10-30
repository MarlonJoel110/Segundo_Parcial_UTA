public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Ana", 500.0);
        Cuenta cuenta2 = new Cuenta("Luis", 100.0);

        System.out.println("Transferencia válida:");
        cuenta1.transferir(cuenta2, 200.0);
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();

        System.out.println("Transferencia que falla:");
        cuenta1.transferir(cuenta2, 400.0);
        cuenta1.mostrarCuenta();
        cuenta2.mostrarCuenta();
    }
}
