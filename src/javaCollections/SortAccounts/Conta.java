package javaCollections.SortAccounts;

public class Conta implements Comparable<Conta> {

    private Titular titular;

    @Override
    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public Titular getTitular(){
        return titular;
    }

    public Conta(String nome){
        Titular t = new Titular();
        t.setNome(nome);
        this.titular = t;
    }

    @Override
    public String toString(){
        return this.titular.getNome();
    }

}