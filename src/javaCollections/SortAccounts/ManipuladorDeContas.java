package javaCollections.SortAccounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipuladorDeContas {

    private final List<Conta> contas = new ArrayList<>();

    public void ordenaLista() {
        Collections.sort(contas);
    }

    public ManipuladorDeContas(){
        Conta c1 = new Conta("Andrey");
        Conta c2 = new Conta("Renato");
        Conta c3 = new Conta("Marcão");
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
    }

    public List<Conta> getContas(){
        return contas;
    }


}
