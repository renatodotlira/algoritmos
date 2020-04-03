package designPatterns.chainOfResponsability.basic;

public interface Command<T> {
    boolean execute(T context);
}
