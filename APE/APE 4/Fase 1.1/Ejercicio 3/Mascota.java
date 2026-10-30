class Mascota {
    String nombre;
    String especie;
    int edad;
    double peso;

    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
    }

    public void imprimir() {
        String aviso = (peso > 20.0) ? " Revisar peso" : "";
        System.out.println(nombre + ": " + especie + ": " + peso + " kg" + aviso);
    }
}