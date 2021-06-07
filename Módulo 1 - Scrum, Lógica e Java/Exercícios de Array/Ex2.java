package gen;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int x, amntO = 0, sumE = 0, pi = 0, pj = 0;
        int [] vE = {-1, -1, -1, -1, -1, -1}, vO = {0, 0, 0, 0, 0, 0};

        for(int i = 0; i<6; i++){
            System.out.printf("Entre com o seu número: ");
            x = in.nextInt();
            if(x%2 == 0){
                sumE+=x; vE[pi++] = x;
            }
            else{
                amntO++; vO[pj++] = x;
            }
        }

        System.out.printf("Os números pares digitados são: ");
        for(int i = 0; vE[i]%2 == 0; i++) System.out.printf("%d ", vE[i]);
        System.out.printf("\nA soma dos elementos pares é: %d\n", sumE);
        System.out.printf("Os números ímpares são: ");
        for(int i = 0; vO[i]%2 == 1; i++) System.out.printf("%d ", vO[i]);
        System.out.printf("\nA quantidade de números ímpares digitados é: %d", amntO);


    }

}
