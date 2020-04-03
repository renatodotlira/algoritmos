package projecteuler;

public class Question09 {

    public static void main(String[] args) {

        boolean achou = false;
        for(int a = 2; a < 400 && !achou; a++){
            for(int b = a; b < 400 && !achou; b++){
                int somaQuadrados =(a * a + b * b);
                if(ehInteiro(Math.sqrt(somaQuadrados))){
                    if(a + b + Math.sqrt(somaQuadrados) == 1000){
                        int x = (int) Math.sqrt(somaQuadrados);
                        System.out.println(a + " " + b + " " + x + " = 1000");
                        System.out.println(a * b * x);
                        achou = true;
                    }
                }
            }
        }
    }

    static boolean ehInteiro(double number) {
        return !(number - ((long) number) != 0);
    }

}
