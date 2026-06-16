public record Whatsapp() implements EnvioMensagem{

    @Override
    public String enviarMensagem(String mensagem) {
        return "Mensagem enviada via Whatsapp: " + mensagem;
    }
}
