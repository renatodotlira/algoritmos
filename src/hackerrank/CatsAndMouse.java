package hackerrank;

public class CatsAndMouse {

    public static void main(String[] args) {
        System.out.println(catAndMouse(1,3,2));
    }

    static String catAndMouse(int x, int y, int z) {
        int distanceCatA = (z > x) ? (z - x) : (x - z);
        int distanceCatB = (z > y) ? (z - y) : (y - z);
        if(distanceCatA > distanceCatB)
            return "Cat B";
        else if(distanceCatA < distanceCatB)
            return "Cat A";
        else
            return "Mouse C";
    }

}
