package problems;

public class UtopianTreeProblem {

    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int height = 1;
        for(int x = 1; x <= n; x++){
            if(x % 2 == 0){
                height++;
            }else{
                height = height * 2;
            }
        }
        return height;

    }

    public static void main(String[] args) {
        System.out.println(utopianTree(4));
    }

}
