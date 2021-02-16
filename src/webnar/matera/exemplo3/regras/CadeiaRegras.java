package webnar.matera.exemplo3.regras;

import webnar.matera.exemplo3.Cliente;

public abstract class CadeiaRegras implements Regra {
    private Regra proxima;

    public CadeiaRegras(Regra proximaRegra) {
        proxima = proximaRegra;
    }

    protected boolean aplicarProximaRegra(Cliente cli) {
        if (proxima == null) {
            return true;
        }
        return proxima.aplicar(cli);
    }
}