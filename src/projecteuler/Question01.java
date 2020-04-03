package projecteuler;

public class Question01 {

    public static void main(String[] args) {

        melhorSolucao(999);

    }

    public static void minhaSolucao(int n){
        int total = 0;
        for (int x = 3; x < n; x = x + 3){
            if(x % 5 == 0)
                continue;
            total += x;
        }
        for (int x = 5; x < 1000; x = x + 5){
            total += x;
        }
        System.out.println(total);
    }

    public static void melhorSolucao(int n){
        double soma = somaDivisivelPor(n, 3) + somaDivisivelPor(n, 5) - somaDivisivelPor(n, 15);
        System.out.println(somaDivisivelPor(n, 3));
    }

    public static double somaDivisivelPor(int total, int n){
        int p = total / n;
        return n * (p * (p + 1)) / 2;
    }
}
