public class Calculadora {    
  public double calcularPromedio(double n1,                                   
                                 double n2,                                   
                                 double n3) {        
    double promedio = (n1 + n2 + n3) / 3;        
    return promedio;    
  }    
  
  public static void main(String[] args) {        
    Calculadora calculadora = new Calculadora();        
    double resultado =                
      calculadora.calcularPromedio(8, 9, 10);        
    System.out.println("Promedio: " + resultado);    
  } 
}
