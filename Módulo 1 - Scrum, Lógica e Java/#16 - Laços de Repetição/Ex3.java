package gen;
import java.util.*;

public class Ex3 {

    public static void main(String[] args){

        int a = 0, b = 0, c = 25;
        Scanner in = new Scanner(System.in);

        while(c != -99){
            System.out.println("Entre com a idade: ");
            c = in.nextInt();
            if(c < 21 && c != -99) a++;
            if(c > 50) b++;
        }

        System.out.println("Há " + a + " pessoas com menos de 21 anos e " + b + " pessoas com mais de 50 anos.");

    }

}
