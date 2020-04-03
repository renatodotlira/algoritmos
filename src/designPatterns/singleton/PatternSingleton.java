package designPatterns.singleton;

public class PatternSingleton {

    private static PatternSingleton patternSingleton = new PatternSingleton();

    private int x = 0;

    private PatternSingleton(){ }

    public static PatternSingleton getInstance(){
        return patternSingleton;
    }

    public int getX(){
        return x++;
    }
}
