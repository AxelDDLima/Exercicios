import java.util.Scanner;
import java.util.function.Function;

public class Main {

    private static double valorProduto;
    private static double valorDaTaxa;

    public static void main(String[] args) {
       int opcao;
        do {
            println("============================================");
            println("ESCOLHA QUAL CATEGORIA DE PRODUTO SERÁ APLICADO A TAXA: ");
            println("1-Alimentação");
            println("2-Saúde e bem estar");
            println("3-Vestuário");
            println("4-Cultura");
            println("Escolha qualquer numero fora da lista de opções para sair do menu!");
            println("============================================");
            opcao = scanner(Integer::parseInt);
            switch (opcao) {
                case 1 -> calcularTributoAlimentacao();
                case 2 -> calcularTributoSaudeEBemEstar();
                case 3 -> calcularTributoVestuario();
                case 4 -> calcularTributoCultura();
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

    private static void calcularTributoCultura() {
        println("DIGITE O VALOR DO PRODUTO: ");
        valorProduto = scanner(Double::parseDouble);
        valorDaTaxa = new Cultura().calcularTributos(valorProduto);

        println("VALORES DO PRODUTO CALCULADO: \n" +
                "TOTAL: " + (valorProduto +valorDaTaxa) + "\n" +
                "TAXA: " + valorDaTaxa + "\n");
    }

    private static void calcularTributoVestuario() {
        println("DIGITE O VALOR DO PRODUTO: ");
        valorProduto = scanner(Double::parseDouble);
        valorDaTaxa = new Vestuario().calcularTributos(valorProduto);

        println("VALORES DO PRODUTO CALCULADO: \n" +
                "TOTAL: " + (valorProduto +valorDaTaxa) + "\n" +
                "TAXA: " + valorDaTaxa + "\n");
    }

    private static void calcularTributoSaudeEBemEstar() {
        println("DIGITE O VALOR DO PRODUTO: ");
        valorProduto = scanner(Double::parseDouble);
        valorDaTaxa = new SaudeEBemEstar().calcularTributos(valorProduto);

        println("VALORES DO PRODUTO CALCULADO: \n" +
                "TOTAL: " + (valorProduto +valorDaTaxa) + "\n" +
                "TAXA: " + valorDaTaxa + "\n");
    }

    private static void calcularTributoAlimentacao() {
        println("DIGITE O VALOR DO PRODUTO: ");
        valorProduto = scanner(Double::parseDouble);
        valorDaTaxa = new Alimentacao().calcularTributos(valorProduto);

        println("VALORES DO PRODUTO CALCULADO: \n" +
                "TOTAL: " + (valorProduto +valorDaTaxa) + "\n" +
                "TAXA: " + valorDaTaxa + "\n");
    }

}