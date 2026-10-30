public class Area {    
  public double calcularArea(double base, double altura) {        
    double area = base * altura;        
    return area;    
  }    
  public static void main(String[] args) {        
    Area figura = new Area();        
    double resultado = figura.calcularArea(4.5, 3.0);        
    System.out.println("El área es: " + resultado);    
  } 
}
