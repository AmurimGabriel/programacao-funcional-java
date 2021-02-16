package webnar.matera.exemplo3.regras;

import webnar.matera.exemplo3.Cliente;

public interface Regra {
    boolean aplicar(Cliente cli);
}