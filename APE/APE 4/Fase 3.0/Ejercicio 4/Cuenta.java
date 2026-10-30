class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void transferir(Cuenta destino, double monto) {
        if (destino == null || destino == this) {
            System.out.println("Cuenta destino no válida.");
            return;
        }
        if (!Double.isFinite(monto) || monto <= 0) {
            System.out.println("El monto debe ser positivo y finito.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
            return;
        }
        saldo -= monto;
        destino.saldo += monto;
        System.out.println("Transferencia realizada: " + monto);
        System.out.println("Origen: " + titular);
        System.out.println("Destino: " + destino.titular);
    }

    public void mostrarCuenta() {
        System.out.println(titular + " - Saldo: " + saldo);
    }
}
