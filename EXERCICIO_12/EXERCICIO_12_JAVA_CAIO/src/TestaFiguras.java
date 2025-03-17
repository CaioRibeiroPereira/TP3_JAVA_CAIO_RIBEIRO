public class TestaFiguras {
    public static void main(String[] args) {
        // Círculo com raio 3.0
        Circulo circulo = new Circulo();
        circulo.raio = 3.0;
        System.out.printf("Área do círculo é: %.2f m²\n", circulo.calcularArea());


        // Esfera com raio 5.0
        Esfera esfera = new Esfera();
        esfera.raio = 5.0;
        System.out.printf("Volume da esfera é: %.2f m³\n", esfera.calcularVolume());
    }
}