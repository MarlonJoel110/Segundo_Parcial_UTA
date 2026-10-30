public class PasoPorValor {
    public void incrementar(int n) {
    n = n + 5;
}
public static void main(String[] args) {
    PasoPorValor ejemplo = new PasoPorValor();
    int numero = 10;
    ejemplo.incrementar(numero);
    // Imprime 10: n recibe una copia del valor.
    // Cambiar n no modifica numero en el main.
    System.out.println(numero);
    }
}
