package challenger.primes;

//The number, 197, is called a circular prime because all rotations of the digits: 197, 971, and 719, are themselves prime.

//There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.
//How many circular primes are there below one million?

public class PrimeNumberCircular {

    public static void main(String[] args) {

        int totalRotationPrime = 2;

        for(int x = 5; x < 1000000; x = x + 2) {
            if(isRotationsPrime(x)) {
                totalRotationPrime++;
            }
        }
        System.out.println(totalRotationPrime);
    }

    private static boolean isRotationsPrime(int n){
        int[] rotations = getRotations(n);
        for (int x = 0; x < rotations.length; x++){
            if (!isPrime(rotations[x]))
                return false;
        }
        return true;
    }

    private static boolean isPrime(int n){
        int range = (int) Math.sqrt(n);
        for (int x = 2; x <= range; x++) {
            if(n % x == 0)
                return false;
        }
        return true;
    }

    private static int[] getRotations(Integer x){
        String numString = x+"";
        int numOfRotations = numString.length();
        int[] numbersRotation = new int[numOfRotations];
        numbersRotation[0] = x;
        for (int i = 1; i < numOfRotations; i++){

            numbersRotation[i] = rotates(x, i);
        }
        return numbersRotation;
    }

    private static int rotates(int x, int quantityRotates){
        String charNums = x+"";
        for(int i = 0; i < quantityRotates; i++){
            charNums = charNums.substring(1)+charNums.substring(0,1);
        }
        return Integer.parseInt(charNums);
    }

}