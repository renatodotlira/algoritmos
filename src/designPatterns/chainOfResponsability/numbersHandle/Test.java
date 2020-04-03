package designPatterns.chainOfResponsability.numbersHandle;

public class Test {

    public static void main(String[] args) {

        Chain c1 = new NegativeProcessor();


        c1.process(new Number(90));


    }

}
