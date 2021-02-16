package webnar.matera.exemplo3.regras;

import webnar.matera.exemplo3.Cliente;

public class RegraSalario extends CadeiaRegras {

    public RegraSalario() {
        super(null);
    }

    public RegraSalario(Regra proxima) {
        super(proxima);
    }

    public boolean aplicar(Cliente cli) {
        if (cli.getSalario() > 2000.0) {
            return aplicarProximaRegra(cli);
        }
        return false;
    }
}