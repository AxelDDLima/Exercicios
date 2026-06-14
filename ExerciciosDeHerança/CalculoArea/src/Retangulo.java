public record Retangulo(double largura, double altura) implements CalculoArea {

    @Override
    public double calculoArea() {
        return largura * altura;
    }

    @Override
    public String areaCalculada() {
        return String.format("%.2f", calculoArea());
    }
}
