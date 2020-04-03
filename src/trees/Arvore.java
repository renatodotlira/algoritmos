package trees;

public class Arvore {

    private Node node;

    public void preOrder(){
        preOrder(this.node);
    }

    private void preOrder(Node node){
        System.out.println(node.getValor());
        if (node.getEsquerda() != null )
            preOrder(node.getEsquerda());
        if (node.getDireita() != null )
            preOrder(node.getDireita());
    }

    public void inOrder(){
        inOrder(this.node);
    }

    private void inOrder(Node node){
        if (node.getEsquerda() != null )
            inOrder(node.getEsquerda());
        System.out.println(node.getValor());
        if (node.getDireita() != null )
            inOrder(node.getDireita());
    }

    public void posOrder(){
        posOrder(this.node);
    }

    private void posOrder(Node node){
        if (node.getEsquerda() != null )
            posOrder(node.getEsquerda());
        if (node.getDireita() != null )
            posOrder(node.getDireita());
        System.out.println(node.getValor());
    }

    public void insert(int valor){
        if(node == null)
            node = newNode(valor);
        else
            insert(node, valor);
    }

    private void insert(Node node, int valor){
        if(valor < node.getValor()) {
            if(node.getEsquerda() == null)
                node.setEsquerda(newNode(valor));
            else
                insert(node.getEsquerda(), valor);
        }else if(valor > node.getValor()) {
            if (node.getDireita() == null)
                node.setDireita(newNode(valor));
            else
                insert(node.getDireita(), valor);
        }
    }

    public boolean exist(int valor){
        return exist(node, valor);
    }

    private boolean exist(Node node, int valor){
        if(node == null)
            return false;
        else if(valor == node.getValor())
            return true;
        else if(valor < node.getValor())
            return exist(node.getEsquerda(), valor);
        else if(valor > node.getValor())
            return exist(node.getDireita(), valor);
        return false;
    }

    private Node newNode(int valor){
        Node node = new Node();
        node.setValor(valor);
        node.setDireita(null);
        node.setEsquerda(null);
        return node;
    }

}
