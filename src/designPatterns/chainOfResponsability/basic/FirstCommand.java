package designPatterns.chainOfResponsability.basic;

import java.util.Map;

public class FirstCommand implements Command<Map<String, Object>> {
    @Override
    public boolean execute(Map<String, Object> context) {
        System.out.println("First command executed!");
        return true;
    }
}
