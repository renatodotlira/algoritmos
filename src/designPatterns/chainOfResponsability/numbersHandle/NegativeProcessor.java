package designPatterns.chainOfResponsability.numbersHandle;

public class NegativeProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber() < 0)
            System.out.println("NegativeProcessor: "+request.getNumber());
        else
            this.nextInChain.process(request);
    }
}
