public record Quadrado(double lado) implements CalculoArea {

    @Override
    public double calculoArea() {
        return lado * lado;
    }

    @Override
    public String areaCalculada() {
        return String.format("%.2f", calculoArea());
    }
}
