class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public int simularAhorroHasta(double meta) {
        int meses = 0;
        System.out.println("--- Proceso de ahorro para " + titular + " ---");
        while (saldo < meta) {
            saldo += 50.0;
            meses++;
            System.out.println("Mes " + meses + " - " + titular + " : $" + saldo);
        }
        return meses;
    }
}