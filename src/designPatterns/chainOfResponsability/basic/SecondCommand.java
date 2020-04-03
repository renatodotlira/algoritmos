package designPatterns.chainOfResponsability.basic;

import java.util.Map;

public class SecondCommand implements Command<Map<String, Object>> {
    @Override
    public boolean execute(Map<String, Object> context) {
        System.out.println("Second command executed!");
        return true;
    }
}
