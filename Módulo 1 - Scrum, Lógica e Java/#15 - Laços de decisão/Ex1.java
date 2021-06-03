package gen;
import java.util.*;

public class Ex1 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n, m;
        System.out.println("Digite o primeiro número: ");
        n = in.nextInt();
        System.out.println("Digite o segundo número: ");
        m = in.nextInt();
        if(m > n) n = m;
        System.out.println("Digite o terceiro número: ");
        m = in.nextInt();
        if(m > n) n = m;

        System.out.println("O maior número é: " + n);

        in.close();

    }

}
