import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int opcao;
        do {
            println("============================================");
            println("1-calcula quadrado");
            println("2-calcula Circulo");
            println("3-calcula Retangulo");
            println("Escolha qualquer numero fora da lista de opções para sair do menu!");
            println("============================================");
            opcao = scanner(Integer::parseInt);
            switch (opcao) {
                case 1 -> calculoQuadrado();
                case 2 -> calculoCirculo();
                case 3 -> calculoRetangulo();
            }
        } while (opcao >= 1 && opcao <= 3);
    }

    public static void println(String mesangem) {
        System.out.println(mesangem);
    }

    public static <T> T scanner(Function<String, T> conversor) {
        Scanner input = new Scanner(System.in);
        return conversor.apply(input.nextLine());
    }

    public static void calculoQuadrado() {
        println("informe o valor do lado: ");
        Quadrado area = new Quadrado(scanner(Double::parseDouble));
        println(area.areaCalculada());
    }

    public static void calculoCirculo() {
        println("informe o valor do raio: ");
        Circulo area = new Circulo(scanner(Double::parseDouble));
        println(area.areaCalculada());
    }

    public static void calculoRetangulo() {
        println("informe o valor da largura e altura, respectivamente: ");
        Retangulo area = new Retangulo(scanner(Double::parseDouble),  scanner(Double::parseDouble));
        println(area.areaCalculada());
    }

}