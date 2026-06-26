package model;

import enums.ClassificacaoBiologica;
import enums.TipoDeConta;

import java.math.BigDecimal;

public class C_Juridica extends Conta{
    private String cnpj;

    public C_Juridica(long agencia, long contaNumero, String nome, BigDecimal saldo, ClassificacaoBiologica classificacaoBiologica, String documento) {
        super(agencia, contaNumero, nome, saldo, TipoDeConta.C_JURIDICA, classificacaoBiologica);
        this.cnpj = documento;
    }

    @Override
    public String toString() {
        return "C_Juridica { \n" +
                "CNPJ = '" + cnpj + "\n" +
                "Agencia e Conta = '" + getAgencia() + " " + getContaNumero() + "\n" +
                "Nome = '" + getNome() + "\n" +
                "Saldo = R$ " + getSaldo() + "\n" +
                "ClassificacaoBiologica = " + getClassificacaoBiologica() + "\n" +
                "Tipo Conta = " + getTipoDeConta() + "\n" +
                '}';
    }
}
