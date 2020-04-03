package designPatterns.singleton;

public class TestSingleton {

    public static void main(String[] args) {

        PatternSingleton singleton = PatternSingleton.getInstance();
        System.out.println(singleton.getX());

        PatternSingleton singleton2 = PatternSingleton.getInstance();
        System.out.println(singleton2.getX());

        PatternSingleton singleton3 = PatternSingleton.getInstance();
        System.out.println(singleton3.getX());

        PatternSingleton singleton4 = PatternSingleton.getInstance();
        System.out.println(singleton4.getX());

    }

}
