package repository;

import model.Conta;

import java.util.List;

public interface C_Repository<T> {

    void criarConta(Conta conta);

    Conta consultarConta(long id);

    void fecharConta(long id);

    List<Conta> consultarContas();
}
