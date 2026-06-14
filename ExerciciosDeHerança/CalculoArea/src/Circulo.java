public record Circulo(double raio) implements CalculoArea {

    private static final double PI = 3.14;

    @Override
    public double calculoArea() {
        return PI * (raio * raio);
    }

    @Override
    public String areaCalculada() {
        return String.format("%.2f", calculoArea());
    }
}
