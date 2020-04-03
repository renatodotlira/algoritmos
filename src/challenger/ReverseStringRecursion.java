package challenger;

public class ReverseStringRecursion {

    public static void main(String[] args) {
        System.out.println(reverse("teste"));
    }

    private static String reverse(String s){
        if(s.length() == 0) {
            return "";
        }else {
            return reverse(s.substring(1)) + s.charAt(0);
        }
    }
}
