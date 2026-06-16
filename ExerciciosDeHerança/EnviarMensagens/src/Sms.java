public record Sms() implements EnvioMensagem{
    @Override
    public String enviarMensagem(String mensagem) {
        return "Mensagem enviada via SMS: " + mensagem;
    }
}
