package model;

import enums.ClassificacaoBiologica;
import enums.TipoDeConta;

import java.math.BigDecimal;

public class C_Fisica extends Conta{
    private String cpf;

    public C_Fisica(long agencia, long contaNumero, String nome, BigDecimal saldo, ClassificacaoBiologica classificacaoBiologica, String documento) {
        super(agencia, contaNumero, nome, saldo, TipoDeConta.C_FISICA, classificacaoBiologica);
        this.cpf = documento;
    }

    @Override
    public String toString() {
        return "C_Fisica { \n" +
                "CPF = '" + cpf + "\n" +
                "Agencia e Conta = '" + getAgencia() + " " + getContaNumero() + "\n" +
                "Nome = '" + getNome() + "\n" +
                "Saldo = R$ " + getSaldo() + "\n" +
                "ClassificacaoBiologica = " + getClassificacaoBiologica() + "\n" +
                "Tipo Conta = " + getTipoDeConta() + "\n" +
                '}';
    }
}
