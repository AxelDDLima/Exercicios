package model;

import enums.Categoria;

import java.math.BigDecimal;

/**
 * Conceitos
 * Encapsulamento → atributos private.
 * Abstração → classe abstract.
 * Herança → outras classes herdarão de Produto.
 */
public abstract class Produto {
    private int id;
    private Categoria categoria;
    private String descricao;
    private BigDecimal preco;

    protected Produto(int id, Categoria categoria, String descricao, BigDecimal preco) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
