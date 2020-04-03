package challenger;

public class UniqueCharInString {

    public static void main(String...args){
        System.out.println(isUniqueChars2("aa"));
    }

    public static boolean isUniqueChars(String str) {
         int checker = 0;
         for (int i = 0; i < str.length(); ++i) {
             int val = str.charAt(i) - 'a';
             if ((checker & (1 << val)) > 0) return false;
             checker = (1 << val);
         }
        return true;
    }

    public static boolean isUniqueChars2(String str) {
        String checker = "";
        for (int i = 0; i < str.length(); ++i) {
            if (checker.equals(str.charAt(i)+"")) return false;
            checker = str.charAt(i)+"";
        }
        return true;
    }

    public static String toBinary(int x){
        String ret = "";
        while(x > 0){
            ret = (x % 2)+ret;
            x = x / 2;
        }
        return ret;
    }
}
