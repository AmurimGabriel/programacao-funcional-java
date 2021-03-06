package webnar.matera.exemplo3.regras;

import webnar.matera.exemplo3.Cliente;

public class RegraTempoEmprego extends CadeiaRegras {
    public RegraTempoEmprego() {
        super(null);
    }

    public RegraTempoEmprego(Regra next) {
        super(next);
    }

    public boolean aplicar(Cliente cli) {
        if (cli.getTempoEmpregado() > 0) {
            return aplicarProximaRegra(cli);
        }
        return false;
    }
}