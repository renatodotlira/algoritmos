package hackerrank;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class MagicSquare {

    public static void main(String[] args) {

        int[][] s = new int[3][3];
        s[0][0] = 5;
        s[0][1] = 3;
        s[0][2] = 4;
        s[1][0] = 1;
        s[1][1] = 5;
        s[1][2] = 8;
        s[2][0] = 6;
        s[2][1] = 4;
        s[2][2] = 2;

        rotacionarMatriz(s);

        //System.out.println(formingMagicSquare(s));
    }

    static void rotacionarMatriz(int[][] m){
        int[][] rotated = new int[m.length][m.length];
        int z = m.length - 1;
        int t = m.length - 1;
        for(int r = 0; r < t; r++){
            for(int c = 0; c < t; c++){
                rotated[c][z] = m[r][c];
            }
            t--;
        }
        System.out.println("teste");
    }

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        Map<String, Integer> somas = new HashMap<>();
        boolean[][] mOk = new boolean[3][3];
        somas.put("r0", 0);
        somas.put("r1", 0);
        somas.put("r2", 0);
        somas.put("c0", 0);
        somas.put("c1", 0);
        somas.put("c2", 0);
        somas.put("dp", 0);
        somas.put("ds", 0);
        int colDP = 2;
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                int totalRow = somas.get("r"+r);
                totalRow += s[r][c];
                somas.put("r" + r, totalRow);

                int totalColumn = somas.get("c"+c);
                totalColumn += s[r][c];
                somas.put("c" + c, totalColumn);

                if(r == c){
                    int totalDiagonalS = somas.get("ds");
                    totalDiagonalS += s[r][c];
                    somas.put("ds", totalDiagonalS);
                }
            }
            int totalDiagonalP = somas.get("dp");
            totalDiagonalP += s[r][colDP--];
            somas.put("dp", totalDiagonalP);

        }
        for (String rc : somas.keySet()) {
            if(somas.get(rc) == 15){
                if(rc.contains("r")){
                    int row = Integer.parseInt(rc.substring(1));
                    mOk[row][0] = true;
                    mOk[row][1] = true;
                    mOk[row][2] = true;
                }else if(rc.contains("c")){
                    int col = Integer.parseInt(rc.substring(1));
                    mOk[0][col] = true;
                    mOk[1][col] = true;
                    mOk[2][col] = true;
                }else if(rc.equals("dp")){
                    mOk[0][2] = true;
                    mOk[1][1] = true;
                    mOk[2][0] = true;
                }else if(rc.equals("ds")){
                    mOk[0][0] = true;
                    mOk[1][1] = true;
                    mOk[2][2] = true;
                }
            }
        }

        boolean checagens[][] = {{false, true, true}, {true, false, true}, {true, true, false}};
        //analisar linhas
        for (int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                if(somas.get("r"+r) != 15){
                    if(mOk[r][0] == checagens[c][0] && mOk[r][1] == checagens[c][1] && mOk[r][2] == checagens[c][2]){
                        int totalSegmento = somas.get("r"+r);
                        int diferenca = 15 - totalSegmento;
                        s[r][c] = s[r][c] + diferenca;
                        mOk[r][c] = true;
                        int totalColuna = somas.get("c"+c);
                        totalColuna += diferenca;
                        somas.put("c" + c, totalColuna);
                        somas.put("r" + r, 15);
                        c = 3;
                    }
                }
            }
        }
        System.out.println("teste");
        //analisar colunas
        for(int c = 0; c < 3; c++) {
            for (int r = 0; r < 3; r++) {
                if(somas.get("c"+c) != 15){
                    if(mOk[0][c] == checagens[r][0] && mOk[1][c] == checagens[r][1] && mOk[2][c] == checagens[r][2]){
                        int totalSegmento = somas.get("c"+c);
                        int diferenta = 15 - totalSegmento;
                        s[r][c] = s[r][c] + diferenta;
                        mOk[r][c] = true;
                        somas.put("c" + c, 15);
                        r = 3;
                    }
                }
            }
        }
        System.out.println("teste");

        return 0;
    }

}
