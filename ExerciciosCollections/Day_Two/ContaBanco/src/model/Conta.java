package model;

import enums.TipoDeConta;
import enums.ClassificacaoBiologica;

import java.math.BigDecimal;

public class Conta {
    private long agencia;
    private long contaNumero;
    private String nome;
    private BigDecimal saldo;
    private TipoDeConta tipoDeConta;
    private ClassificacaoBiologica classificacaoBiologica;

    public Conta(long agencia, long contaNumero, String nome, BigDecimal saldo, TipoDeConta tipoDeConta, ClassificacaoBiologica classificacaoBiologica) {
        this.agencia = agencia;
        this.contaNumero = contaNumero;
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDeConta = tipoDeConta;
        this.classificacaoBiologica = classificacaoBiologica;
    }

    public long getAgencia() {
        return agencia;
    }

    public long getContaNumero() {
        return contaNumero;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public TipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public ClassificacaoBiologica getClassificacaoBiologica() {
        return classificacaoBiologica;
    }
}
