public class Bienvenida {        
  public void saludar(String nombre, int edad) {        
    System.out.println("Hola " + nombre + ", tienes "+ edad + " años. ¡Bienvenido al sistema!");    
  }    
  public static void main(String[] args) {        
    Bienvenida bienvenida = new Bienvenida();        
    bienvenida.saludar("Antony", 19);    
  } 
}
