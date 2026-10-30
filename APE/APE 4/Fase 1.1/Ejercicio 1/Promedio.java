public class Promedio{
    public static void main (String[] args){
        
        int aprobados = 0;

        Estudiantes e1 = new Estudiantes("Pablo", 7.5, 8.57, 9.01);
        Estudiantes e2 = new Estudiantes("Paul", 10, 6.29, 3.6);
        Estudiantes e3 = new Estudiantes("Patricio", 3.7, 4.25, 10);
        Estudiantes e4 = new Estudiantes("Madeleine", 1.9, 10, 7.9);
        Estudiantes e5 = new Estudiantes("Leandro", 5.4, 7.0, 9.5);

        // Estudiante 1
        e1.calcularPromedio();
        System.out.print(e1.nombre + " : " + e1.promedio);
        if (e1.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e1.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Estudiante 2
        e2.calcularPromedio();
        System.out.print(e2.nombre + " : " + e2.promedio);
        if (e2.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e2.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Estudiante 3
        e3.calcularPromedio();
        System.out.print(e3.nombre + " : " + e3.promedio);
        if (e3.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e3.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Estudiante 4
        e4.calcularPromedio();
        System.out.print(e4.nombre + " : " + e4.promedio);
        if (e4.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e4.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        // Estudiante 5
        e5.calcularPromedio();
        System.out.print(e5.nombre + " : " + e5.promedio);
        if (e5.promedio >= 7.0) {
            System.out.println(" - Aprobado");
            aprobados = aprobados + 1;
        } else if (e5.promedio >= 5.0) {
            System.out.println(" - Supletorio");
        } else {
            System.out.println(" - Reprobado");
        }

        System.out.println("\nTotal de estudiantes aprobados: " + aprobados);
    }
}