package gen;
import java.util.*;

public class Ex2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int a, b, c, d;
        System.out.println("Entre com o primeiro número: ");
        a = in.nextInt();
        System.out.println("Entre com o segundo número: ");
        b = in.nextInt();
        System.out.println("Entre com o terceiro número: ");
        c = in.nextInt();

        if(c < a){
            d = a; a = c; c = d;
        }
        if(b < a){
            d = a; a = b; b = d;
        }
        if(c < b){
            d = b; b = c; c = d;
        }

        System.out.println(a + " " + b + " " + c + "\n");

    }

}
