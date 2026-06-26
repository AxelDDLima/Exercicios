package service;

import model.Conta;
import repository.C_RepositoryImp;

import java.util.List;

public class ContaServiceImp implements ContaService {

    C_RepositoryImp  cRepo = new C_RepositoryImp();

    @Override
    public void criarConta(Conta conta) {
        cRepo.criarConta(conta);
    }

    @Override
    public Conta consultarConta(long id) {
        return cRepo.consultarConta(id);
    }

    @Override
    public void fecharConta(long id) {
        cRepo.fecharConta(id);
    }

    @Override
    public List<Conta> consultarContas() {
        return cRepo.consultarContas();
    }
}
