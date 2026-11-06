public class objetoLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        Libro l2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro l3 = new Libro("El Principito", "Antoine de Saint-Exupéry");
        Libro l4 = new Libro("Rayuela", "Julio Cortázar");

        Socio s1 = new Socio("Andrés");
        Socio s2 = new Socio("Lucía");

        s1.prestarLibro(l1);
        s1.prestarLibro(l2);

        s2.prestarLibro(l3);

        System.out.println("--- Estado de los Libros ---");
        l1.imprimirEstado();
        l2.imprimirEstado();
        l3.imprimirEstado();
        l4.imprimirEstado();

        System.out.println("\n--- Estado de los Socios ---");
        s1.imprimirEstado();
        s2.imprimirEstado();

        int disponibles = 0;
        if (l1.disponible) disponibles++;
        if (l2.disponible) disponibles++;
        if (l3.disponible) disponibles++;
        if (l4.disponible) disponibles++;

        System.out.println("\nQuedan " + disponibles + " libros disponibles.");
    }
}
