public class ValidacionEdad {
  public boolean verificarEdad(int edad) {
    if (edad < 0 || edad > 120) {            
      System.out.println("Edad inválida");            
      return false;        
    }        
    return true;    
  }    
  
  public static void main(String[] args) {        
    ValidacionEdad validacion = new ValidacionEdad();        
    int edad = 19;        
    boolean esValida = validacion.verificarEdad(edad);        
    System.out.println("Edad válida: " + esValida);    
  } 
}
