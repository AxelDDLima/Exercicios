package service;

import model.Produto;
import repository.EstoqueProduto;

import java.util.List;

public class EstoqueServiceImp implements EstoqueService{

    private final EstoqueProduto estoqueProduto;

    public EstoqueServiceImp(EstoqueProduto estoqueProduto) {
        this.estoqueProduto = estoqueProduto;
    }

    @Override
    public void addProduto(Produto produto) {
        estoqueProduto.addProduto(produto);
    }

    @Override
    public Produto buscarPorId(long id) {
        return estoqueProduto
                .buscarPorId(id);
    }

    @Override
    public List<Produto> listarTodosProdutos() {
        return estoqueProduto.listarTodosProdutos();
    }

    @Override
    public void removerProduto(long idProduto) {

    }
}
