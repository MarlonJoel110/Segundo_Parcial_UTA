public class Estudiante{
    String nombre;
    double nota1;
    double nota2;
    double nota3;
    double promedio;

    //constructor para los datos del estudiante
   public Estudiante(String n, double n1, double n2, double n3) {
        nombre = n;      
        nota1 = n1;         
        nota2 = n2;      
        nota3 = n3;
    }

    //metodo para calcular el promedio
    public void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3.0;
    }
}
