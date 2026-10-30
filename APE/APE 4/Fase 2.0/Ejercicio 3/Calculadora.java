public class Calculadora {
  public double multiplicar(double x, double y) {
    return x * y;
  }
  public static void main(String[] args) {
    Calculadora miObjeto = new Calculadora();
    // 4.0 y 5.5 son argumentos: valores de la llamada.
    double res = miObjeto.multiplicar(4.0, 5.5);
    System.out.println("Resultado: " + res);
  }
}
