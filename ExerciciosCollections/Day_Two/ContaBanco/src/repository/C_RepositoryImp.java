package repository;

import model.Conta;

import java.util.*;
import java.util.random.RandomGenerator;

public class C_RepositoryImp implements C_Repository<Conta> {

    private final Map<Long, Conta> contas = new HashMap<>();

    @Override
    public void criarConta(Conta conta) {
        contas.put(RandomGenerator.getDefault().nextLong(), conta);
    }

    @Override
    public Conta consultarConta(long id) {
        return contas.get(id);
    }

    @Override
    public void fecharConta(long id) {
        contas.remove(id);
    }

    @Override
    public List<Conta> consultarContas() {
        return new ArrayList<>(contas.values());
    }
}
