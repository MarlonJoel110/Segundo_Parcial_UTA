class Producto {    
  String nombre;    
  int stock;    
  double precioUnitario;    
  public double calcularValorTotal() {        
    return stock * precioUnitario;    
  } 
} 
public class Principal {    
  public static void main(String[] args) {        
    Producto p = new Producto();        
    p.stock = 10;        
    p.precioUnitario = 25.5;        
    double totalInventario = p.calcularValorTotal();        
    System.out.println("Total del inventario: "+ totalInventario);    
  } 
}
