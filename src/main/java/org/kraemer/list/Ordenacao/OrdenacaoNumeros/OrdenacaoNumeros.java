package org.kraemer.list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numeros;

    public OrdenacaoNumeros() {
        numeros = new ArrayList<>();
    }

    public boolean adicionarNumero(Integer numero) {
        return numeros.add(numero);
    }

    public List<Integer> ordernarAscendente() {
        Collections.sort(numeros);
        return numeros;
    }

    public List<Integer> ordernarDescendente() {
        Collections.sort(numeros);
        Collections.reverse(numeros);
        return numeros;
    }

    public List<Integer> getNumeros() {
        return this.numeros;
    }

}
