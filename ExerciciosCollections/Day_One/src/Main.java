import enums.Categoria;
import model.Produto;
import model.ProdutoEletronico;
import model.ProdutoPerecivel;
import repository.EstoqueProduto;
import service.EstoqueServiceImp;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * variável é do tipo Produto
 * O método chamado depende do objeto real.
 *  Isso é polimorfismo.
 */

public class Main {
    public static void main(String[] args) {
        EstoqueServiceImp serviceImp = new EstoqueServiceImp(new EstoqueProduto());

        System.out.println(serviceImp.listarTodosProdutos());
        Produto perecivel = new ProdutoPerecivel(
                1, Categoria.ALIMENTO_PERECIVEL, "produto perecivel", new BigDecimal(5), LocalDate.of(2026, 6, 1)
        );

        Produto eletronico = new ProdutoEletronico(
                1, Categoria.ELETRONICO, "computador de mesa", new BigDecimal(100000), "1 ano"
        );

        serviceImp.addProduto(perecivel);
        serviceImp.addProduto(eletronico);
        System.out.println(serviceImp.listarTodosProdutos());
    }

    /**
     * Resumo para decorar
     * Conceito	Exemplo
     * Classe                  -> Produto
     * Objeto                  -> new ProdutoEletronico()
     * Encapsulamento          -> atributos private
     * Herança                 -> extends Produto
     * Interface               -> implements Descontavel
     * Polimorfismo            -> Produto p = new ProdutoEletronico()
     * Abstração               -> abstract class Produto
     * Sobrescrita (Override)  -> @Override calcularFrete()
     * Record                  -> ProdutoDTO
     * Coleções                -> Map<Long, Produto> e List<Produto>
     */
}
