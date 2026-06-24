package model;

import enums.Categoria;

import java.math.BigDecimal;

/**
 * Conceito
 * Herda da classe Produto todos os atributos.
 */
public class ProdutoEletronico extends Produto {

    private String garantiaFabricante;

    public ProdutoEletronico(int id, Categoria categoria, String descricao, BigDecimal preco, String garantiaFabricante) {
        super(id, categoria, descricao, preco);
        this.garantiaFabricante = garantiaFabricante;
    }

    public String getGarantiaFabricante() {
        return garantiaFabricante;
    }

    public void setGarantiaFabricante(String garantiaFabricante) {
        this.garantiaFabricante = garantiaFabricante;
    }

    @Override
    public String toString() {
        return "ProdutoEletronico{" +
                "categoria='" + getCategoria() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", preco=" + getPreco() +
                ", garantiaFabricante='" + garantiaFabricante + '\'' +
                '}';
    }
}
