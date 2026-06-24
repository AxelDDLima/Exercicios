package repository;

import model.Produto;

import java.util.*;

public class EstoqueProduto implements Estoque<Produto>{

    private final Map<Long, Produto> produtos = new HashMap<>();

    @Override
    public void addProduto(Produto produto) {
        produtos.put(new Random().nextLong(1000) , produto);
    }

    @Override
    public Produto buscarPorId(long id) { return produtos.get(id); }

    @Override
    public List<Produto> listarTodosProdutos() { return new ArrayList<>(produtos.values().stream().toList()); }

    @Override
    public void removerProduto(long idProduto) { produtos.remove(idProduto); }

}
