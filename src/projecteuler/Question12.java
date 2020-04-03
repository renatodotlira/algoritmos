package projecteuler;

public class Question12 {
    //todo debugar os métodos para rastrear a refatoração e saber porque um é mais rápido que o outro
    public static void main(String[] args) {
        int numDivisors = 1;
        int currentNumber = 1;
        int currentSum = 1;

        //System.out.println(fat(36) + " " + tau(36));

        while (tau(currentSum) <= 500) {
            currentNumber++;
            currentSum = currentSum + currentNumber;
            System.out.println(currentSum + " " + fat(currentSum));
        }

    }

    static int tau(int num) {

        int numeroRestante = num;
        int atual = 2;
        int p = 1;

        if (num == 1) return 1;

        while (atual * atual <= numeroRestante) {
            int contadorExpoentes = 1;
            while (numeroRestante % atual == 0) {
                numeroRestante = numeroRestante / atual;
                contadorExpoentes++;
            }
            atual++;
            p = p * contadorExpoentes;
        }

        if (numeroRestante == num || numeroRestante > 1)
            p*= 1 + 1;

        return p;
    }

    static int fat(double valor) {

        int prime = 2;
        int produtoExpoentes = 1;
        while (valor > 1) {
            int numeroDeExpoentes = 1;
            while(valor % prime == 0){
                valor = valor / prime;
                numeroDeExpoentes++;
            }
            prime = nextPrime(prime);
            produtoExpoentes = produtoExpoentes * numeroDeExpoentes;
        }
        return produtoExpoentes;
    }

    static int nextPrime(int p){
        if(p == 2)
            return 3;
        else
            do {
                p += 2;
            }while (!isPrime(p));
        return p;
    }

    static boolean isPrime(int p){
        if(p > 2 && p % 2 == 0 || p % 3 == 0)
            return false;
        for(int x = 5; (x * x) <= p; x += 2){
            if(p % x == 0)
                return false;
        }
        return true;
    }

}
