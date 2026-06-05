import java.util.Scanner;
import java.util.function.Function;

public class Main {
     private static final Conta conta = new Conta();

     public static void main(String[] args) {
        conta.setSaldo(500.0);
        int opcao;
        do {
            println("============================================");
            println("1-Consultar saldo");
            println("2-consultar cheque especial");
            println("3-Depositar dinheiro");
            println("4-Sacar dinheiro");
            println("5-Pagar um boleto");
            println("6-Verificar se a conta está usando cheque especial.");
            println("Escolha qualquer numero fora da lista de opções para sair do menu!");
            println("============================================");
            opcao = scanner(Integer::parseInt);
            switch (opcao) {
                case 1 -> println(String.valueOf(conta.getSaldo()));
                case 2 -> println(String.valueOf(conta.getChequeEspecial()));
                case 3 -> depositoDinheiro();
                case 4 -> sacarDinheiro();
                case 5 -> pagarBoleto();
                case 6 -> println(conta.getUsandoChequeEspecial() ? "sim, existe uso do cheque especial!" : "não existe uso do cheque especial!");
            }
        }while(opcao>=1 && opcao<=6);

    }

    public static void println(String mesangem){
        System.out.println(mesangem);
    }

    public static <T> T scanner(Function<String, T> conversor){
        Scanner input = new Scanner(System.in);
        return conversor.apply(input.nextLine());
    }

    public static void depositoDinheiro(){
        println("============================================");
        println("Digite o valor a ser depositado: ");
        double deposito =  scanner(Double::parseDouble);
        if (conta.getUsandoChequeEspecial() && deposito >= (conta.getSaldoDevedorChequeEspecial())){
            deposito = deposito - conta.getSaldoDevedorChequeEspecial();
            conta.setSaldoDevedorChequeEspecial(0.0);
            conta.setUsandoChequeEspecial(false);
            conta.setSaldo(conta.getSaldo() + deposito);
        }else if (conta.getUsandoChequeEspecial() && deposito <= (conta.getSaldoDevedorChequeEspecial())){
            conta.setSaldoDevedorChequeEspecial(conta.getSaldoDevedorChequeEspecial() - deposito);
        }else {
            conta.setSaldo(conta.getSaldo() + deposito);
        }
    }

    public static void sacarDinheiro(){
        println("============================================");
        println("Digite o valor do saque: ");
        double valorDoSaque = scanner(Double::parseDouble);
        if (valorDoSaque <= conta.getSaldo())
            conta.setSaldo(conta.getSaldo()-valorDoSaque);
        else if (valorDoSaque <= (conta.getSaldo() + conta.getChequeEspecial())) {
            double restoSaque = (double) (valorDoSaque - conta.getSaldo());
            conta.setSaldo(0.0);
            conta.setSaldoDevedorChequeEspecial(restoSaque + (restoSaque*0.20));
            conta.setChequeEspecial(conta.getChequeEspecial() - restoSaque);
            conta.setUsandoChequeEspecial(true);
        }else {
            println("Valor insuficiente");
        }
    }

    public static void pagarBoleto(){
        println("============================================");
        println("Digite o valor do boleto: ");
        double valorDoBoleto = scanner(Double::parseDouble);
        if (valorDoBoleto <= conta.getSaldo())
            conta.setSaldo(conta.getSaldo()-valorDoBoleto);
        else
            println("Valor insuficiente");
    }
}