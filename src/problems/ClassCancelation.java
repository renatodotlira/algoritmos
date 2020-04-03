package problems;

public class ClassCancelation {

    // Complete the angryProfessor function below.
    static String cancelaAula(int k, int[] a) {
        int l = a.length;
        int arrivals = 0;
        for (int x = 0; x < l; x++){
            arrivals = (a[x] <= 0) ? arrivals + 1: arrivals;
        }
        if (arrivals < k) {
            return "YES";
        }else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        int[] v = {-1,1,1,1,1,1};
        System.out.println(cancelaAula(2, v));
    }

}
