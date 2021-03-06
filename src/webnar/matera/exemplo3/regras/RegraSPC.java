package webnar.matera.exemplo3.regras;

import webnar.matera.exemplo3.Cliente;

public class RegraSPC extends CadeiaRegras {

    public RegraSPC() {
        super(null);
    }

    public RegraSPC(Regra proximaRegra) {
        super(proximaRegra);
    }

    public boolean aplicar(Cliente cli) {
        if (!cli.temRestricoesSPC()) {
            return aplicarProximaRegra(cli);
        }
        return false;
    }
}