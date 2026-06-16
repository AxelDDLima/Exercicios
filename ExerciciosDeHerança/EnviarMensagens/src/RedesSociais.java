public record RedesSociais() implements EnvioMensagem{
    @Override
    public String enviarMensagem(String mensagem) {
        return "Mensagem enviada via Redes Sociais: " + mensagem;
    }
}
