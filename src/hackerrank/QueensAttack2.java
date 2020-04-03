package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class QueensAttack2 {

        private static int[][] directions = {{ 1,  0}, { 1,  1}, { 1, -1}, {-1, -1}, {-1,  1}, {-1,  0}, { 0, -1}, { 0,  1}};
        private static long numOfMoves = 0;

        public static void main(String[] args) {
            int[][] obstacles = {{1, 1}, {21, 21}, {31, 31}, {1, 201}, {201, 1}};
            queensAttack(100000, 0, 1 , 1, obstacles);
            System.out.println(numOfMoves);
        }

        // Complete the queensAttack function below.
        static long queensAttack(int n, int k, int r_q, int c_q, int[][] os) {
            Map<String, Boolean> obs = new HashMap<>();
            for (int[] v : os)
                obs.put(v[0] +","+ v[1], true);

            for (int[] direction : directions)
                walk(direction, r_q, c_q, n, obs);

            return numOfMoves;
        }

        static void walk(int[] d, int r, int c, int l, Map<String, Boolean> o){
            boolean hadCollision = false;
            while(!hadCollision){
                r += d[0];
                c += d[1];
                if(isColision(r, c, o, l))
                    hadCollision = true;
                else {
                    numOfMoves++;
                }
            }
        }

        static boolean isColision(int r, int c, Map<String, Boolean> os, int l){
            return isColisionLimit(r, c, l) || isColisionObstacle(r, c, os);
        }

        static boolean isColisionLimit(int r, int c, int l){
            return r <= 0 || r > l || c <= 0 || c > l;
        }

        static boolean isColisionObstacle(int r, int c, Map<String, Boolean> os){
            return os.containsKey(r + "," + c);
        }


}
