package gen;
import java.util.*;

public class Ex4 {

    static int[][] getM() {
        Scanner in = new Scanner(System.in);
        int[][] m = new int[2][2];
        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) {
                System.out.printf("Entre com o valor da linha %d e coluna %d da matriz: ", i + 1, j + 1);
                m[i][j] = in.nextInt();
            }
        System.out.println();
        return m;
    }

    static void printM(int[][] m){
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++) System.out.printf("%d ", m[i][j]);
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int[][] m1 = getM(), m2 = getM(), m3 = new int [2][2];

        System.out.printf("Entre com a operação desejada: (1 - Soma / 2 - Diferença / 3 - Soma de Const / 4 - Imprimir) ");
        int op = in.nextInt();
        switch(op){
            case 1:
                for(int i = 0; i<2; i++) for(int j = 0; j<2; j++) m3[i][j] = m1[i][j] + m2[i][j];
                System.out.println("\nA soma das matrizes é: ");
                printM(m3);
                break;
            case 2:
                for(int i = 0; i<2; i++) for(int j = 0; j<2; j++) m3[i][j] = m1[i][j] - m2[i][j];
                System.out.println("\nA diferença das matrizes é: ");
                printM(m3);
                break;

            case 3:
                System.out.printf("\nEntre com a constante: ");
                int k = in.nextInt();
                for(int i = 0; i<2; i++) for(int j = 0; j<2; j++) {
                    m1[i][j] += k; m2[i][j] += k;
                }
                System.out.println("As matrizes atualizadas são: ");
                printM(m1); System.out.println(); printM(m2);
                break;

            case 4:
                printM(m1); System.out.println(); printM(m2);
                break;

            default:
                System.out.println("\nOperação Inválida!");
        }

    }

}
