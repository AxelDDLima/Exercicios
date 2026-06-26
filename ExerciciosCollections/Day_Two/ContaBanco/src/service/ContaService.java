package service;

import model.Conta;

import java.util.List;

public interface ContaService {

    void criarConta(Conta conta);

    Conta consultarConta(long id);

    void fecharConta(long id);

    List<Conta> consultarContas();
}
