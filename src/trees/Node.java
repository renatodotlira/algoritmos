package trees;

public class Node {

    private Node esquerda;
    private Node direita;
    private Integer getValor;

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }

    public Integer getValor() {
        return getValor;
    }

    public void setValor(Integer valor) {
        this.getValor = valor;
    }

}
