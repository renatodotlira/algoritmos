package projecteuler;

public class Question05 {

    public static void main(String[] args) {
        int n = 3;
        int current = 1;
        boolean divisivelPorTodos = false;
        while (!divisivelPorTodos){
            divisivelPorTodos = true;
            for (int x = 1; x <= n; x++) {
                if(!(current % x == 0)) {
                    divisivelPorTodos = false;
                    break;
                }
            }
            if (!divisivelPorTodos)
                current++;
        }
        System.out.println(current);
    }




}
