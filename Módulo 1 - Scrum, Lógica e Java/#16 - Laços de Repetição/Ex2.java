package gen;
import java.util.*;

public class Ex2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n, even = 0, odd = 0;
        for(int i = 0; i<10; i++){
            System.out.println("Entre com o seu número: ");
            n = in.nextInt();
            if(n%2 == 0) even++;
            else odd++;
        }

        System.out.println("A quantidade de números pares é " + even + " e de números ímpares é " + odd + ".");


    }


}
