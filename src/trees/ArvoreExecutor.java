package trees;

public class ArvoreExecutor {

    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.insert(10);
        arvore.insert(8);
        arvore.insert(29);
        arvore.insert(51);
        arvore.insert(25);
        arvore.insert(18);
        arvore.insert(16);
        arvore.insert(14);
        arvore.insert(11);
        arvore.insert(17);
        arvore.insert(4);
        arvore.insert(3);
        arvore.insert(7);
        arvore.insert(15);
        arvore.insert(9);
        arvore.insert(6);
        arvore.insert(5);
        arvore.insert(1);
        arvore.insert(19);
        arvore.insert(29);
        System.out.println("preOrder");
        arvore.preOrder();
        System.out.println("inOrder");
        arvore.inOrder();
        System.out.println("posOrder");
        arvore.posOrder();
        System.out.println("existe: ");
        System.out.println(arvore.exist(13));
    }
}
