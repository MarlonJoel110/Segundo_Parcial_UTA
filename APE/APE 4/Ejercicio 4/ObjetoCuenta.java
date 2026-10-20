public class ObjetoCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Juan", 200.0);
        Cuenta c2 = new Cuenta("Sofia", 350.0);

        int mesesC1 = c1.simularAhorroHasta(500.0);
        int mesesC2 = c2.simularAhorroHasta(500.0);

        System.out.println("\nResultados finales:");
        System.out.println(c1.titular + " necesitó " + mesesC1 + " meses.");
        System.out.println(c2.titular + " necesitó " + mesesC2 + " meses.");
    }
}
