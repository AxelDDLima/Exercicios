import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int opcao;
        do {
            println("============================================");
            println("ESCOLHA QUAL CANAL A MENSAGEM SERÁ ENVIADA: ");
            println("1-SMS");
            println("2-E-MAIL");
            println("3-REDES SOCIAIS");
            println("4-WHATSAPP");
            println("Escolha qualquer numero fora da lista de opções para sair do menu!");
            println("============================================");
            opcao = scanner(Integer::parseInt);
            switch (opcao) {
                case 1 -> enviarMesagemSms();
                case 2 -> enviarMesagemEmail();
                case 3 -> enviarMesagemRedesSociais();
                case 4 -> enviarMesagemWhatsapp();
            }
        } while (opcao >= 1 && opcao <= 4);
    }

    public static void println(String mesangem) {
        System.out.println(mesangem);
    }

    public static <T> T scanner(Function<String, T> conversor) {
        Scanner input = new Scanner(System.in);
        return conversor.apply(input.nextLine());
    }

    private static void enviarMesagemWhatsapp() {
        println("DIGITE A MENSAGEM QUE SERÁ ENVIADA: ");
        println(new Whatsapp().enviarMensagem(scanner(String::valueOf)));
    }

    private static void enviarMesagemRedesSociais() {
        println("DIGITE A MENSAGEM QUE SERÁ ENVIADA: ");
        println(new RedesSociais().enviarMensagem(scanner(String::valueOf)));
    }

    private static void enviarMesagemEmail() {
        println("DIGITE A MENSAGEM QUE SERÁ ENVIADA: ");
        println(new Email().enviarMensagem(scanner(String::valueOf)));
    }

    private static void enviarMesagemSms() {
        println("DIGITE A MENSAGEM QUE SERÁ ENVIADA: ");
        println(new Sms().enviarMensagem(scanner(String::valueOf)));
    }

}