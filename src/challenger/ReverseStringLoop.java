package challenger;

public class ReverseStringLoop {

    public static void main(String[] args) {

        String s = "New string to get reversed";
        String r = "";

        for (int x = 0; x < s.length(); x++){
            r = s.charAt(x) + r;
        }
        System.out.println(r);
    }

}
