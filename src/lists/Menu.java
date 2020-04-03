package lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    LinkedList lista = new LinkedList();
    public void exibir(){
        limpaTela();
        System.out.println("------------Escolha uma opção---------------");
        System.out.println("1 - Inserir");
        System.out.println("2 - Quantidade de elementos");
        System.out.println("3 - Remover elemento");
        System.out.println("4 - Listar");
        System.out.println("5 - Obter elemento em posicao");
        System.out.println("9 - Sair");
        System.out.println("Escolha: ");
    }

    public void lerOpcao(){
        exibir();
        int op;

        op = scanner.nextInt();
        switch (op){
            case 1:
                inserir();
                break;
            case 2:
                tamanho();
                break;
            case 3:
                remover();
                break;
            case 4:
                listar();
                break;
            case 5:
                pegaElementoPorPosicao();
                break;
            case 9:
                return;
        }
        lerOpcao();
    }

    public void inserir(){
        limpaTela();
        System.out.println("Digite um nome: ");
        String nome = null;
        try {
            nome = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        lista.add(nome);
    }
    public void tamanho(){
        limpaTela();
        System.out.println("Quantidade de elementos: "+lista.size());
        esc();
    }
    public void limpaTela(){
        for (int i = 0; i < 5000; ++i) System.out.println();
    }

    public void remover(){
        limpaTela();
        System.out.println(lista.toString());
        System.out.println("Digite um indice para remover: ");
        int i = scanner.nextInt();
        lista.remove(i);
    }

    public void listar(){
        limpaTela();
        System.out.println(lista.toString());
        esc();
    }

    public void esc(){
        System.out.println("Digite enter para sair: ");
        try {
            bufferedReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void pegaElementoPorPosicao(){
        limpaTela();
        System.out.println("Digite o indice do elemento que gostaria de recuperar: ");
        int i = scanner.nextInt();
        System.out.println(lista.get(i));
        esc();
    }
}