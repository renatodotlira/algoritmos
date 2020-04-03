package training;

public class TreinoSubstring {

    public static void main(String[] args) {
        String teste = "rato";

        for (int i = 0; i < teste.length(); i++){
            String rem = teste.substring(0, i);
            String rem2 = teste.substring(i + 1);
            System.out.println(rem+ " "+rem2);
        }

    }

}
