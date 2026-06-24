package service;

import model.Produto;

import java.util.List;

/**
 * Conceito
 * Define um contrato.
 * Classes que implementam devem criar o método.
 */

public interface EstoqueService {

    void addProduto(Produto produto);

    Produto buscarPorId(long id);

    List<Produto> listarTodosProdutos();

    void removerProduto(long idProduto);



}
