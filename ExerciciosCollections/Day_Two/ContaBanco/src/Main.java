import enums.ClassificacaoBiologica;
import model.C_Fisica;
import model.C_Juridica;
import model.Conta;
import service.ContaServiceImp;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ContaServiceImp serviceImp = new ContaServiceImp();

        Conta fisica = new C_Fisica(12L,
                1897L,
                "Mc Danone",
                BigDecimal.valueOf(10.000),
                ClassificacaoBiologica.MASCULINO,
                "359.501.180-57");

        Conta juridica = new C_Juridica(12L,
                1897L,
                "Mc Donalds",
                BigDecimal.valueOf(11202312300.123),
                ClassificacaoBiologica.MASCULINO,
                "9W.DS1.05O/0001-91");

        serviceImp.criarConta(juridica);
        serviceImp.criarConta(fisica);

        System.out.println(serviceImp.consultarContas());

    }
}
