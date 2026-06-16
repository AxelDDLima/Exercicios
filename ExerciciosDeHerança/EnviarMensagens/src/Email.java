public record Email() implements EnvioMensagem{
    @Override
    public String enviarMensagem(String mensagem) {
        return "Mensagem enviada via E-mail: " + mensagem;
    }
}
