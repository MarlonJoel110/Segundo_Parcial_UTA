public class Producto {    
  String nombre;    
  int stock;    
  double precioUnitario;    
  public double calcularValorTotal() {        
    return stock * precioUnitario;    
  }    
  public static void main(String[] args) {        
    Producto producto = new Producto();        
    producto.stock = 10;        
    producto.precioUnitario = 25.5;        
    double total = producto.calcularValorTotal();        
    System.out.println("Valor del inventario: " + total);    
  } 
}
