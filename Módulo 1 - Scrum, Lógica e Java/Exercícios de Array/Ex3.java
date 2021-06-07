package gen;
import java.util.*;

public class Ex3 {

    public static void main(String[] args){

        int[][] m = new int [3][3];

        Scanner in = new Scanner(System.in);

        int ans = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.printf("\nEntre com o número da linha %d e coluna %d: ", i+1, j+1);
                m[i][j] = in.nextInt(); ans += (m[i][j] > 10? 1: 0);
            }
        }

        System.out.printf("\nA quantidade de valores maiores do que 10 é: %d", ans);

    }

}
