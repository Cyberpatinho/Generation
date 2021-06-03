package gen;
import java.util.*;

public class Ex4 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Entre com o seu número: ");
        n = in.nextInt();
        boolean odd = n%2 == 1;
        System.out.println("O número é " + (odd? "ímpar" : "par") + " e a sua " + (odd? "segunda potencia é " + Math.pow(n*1.0, 2) : "raiz quadrada é " + Math.sqrt(n*1.0)));

    }

}
