public class objetoMascota {
    public static void main(String[] args) {
        Mascota m1 = new Mascota("Max", "Perro", 3, 22.5);
        Mascota m2 = new Mascota("Michi", "Gato", 2, 4.0);
        Mascota m3 = new Mascota("Rocky", "Perro", 5, 18.0);

        m1.imprimir();
        m2.imprimir();
        m3.imprimir();

        Mascota m4 = m1;
        m4.edad += 1;

        System.out.println("\nEdad de m1 tras modificar m4: " + m1.edad);
    }
}
