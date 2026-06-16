public record Cultura() implements CalculoTributos{
    @Override
    public double calcularTributos(double valor) {
        return valor * 0.04;
    }

}
