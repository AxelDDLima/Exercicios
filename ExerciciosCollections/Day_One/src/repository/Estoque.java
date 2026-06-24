package repository;

import model.Produto;

import java.util.List;

/**
 * Conceito
 * Define um contrato.
 * Classes que implementam devem criar o método.
 */

public interface Estoque<T> {

    void addProduto(T produto);

    Produto buscarPorId(long id);

    List<T> listarTodosProdutos();

    void removerProduto(long idProduto);
}
