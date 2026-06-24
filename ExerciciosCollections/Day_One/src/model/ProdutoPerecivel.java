package model;

import enums.Categoria;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto{
    private LocalDate dataDeValidade;

    public ProdutoPerecivel(int id, Categoria categoria, String descricao, BigDecimal preco, LocalDate dataDeValidade) {
        super(id, categoria, descricao, preco);
        this.dataDeValidade = dataDeValidade;
    }

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "categoria=" + getCategoria() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() + '\'' +
                ", dataDeValidade=" + dataDeValidade.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) +
                '}';
    }
}
