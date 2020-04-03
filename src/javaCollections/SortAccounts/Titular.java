package javaCollections.SortAccounts;

public class Titular implements Comparable<Titular>  {

    private String nome;

    @Override
    public int compareTo(Titular o) {
        return Character.compare(this.nome.charAt(0), o.nome.charAt(0));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
