package gen;
import java.util.*;

public class Ex3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Entre com a idade: ");
        n = in.nextInt();

        int x = 0;
        if(n >= 10 && n < 15) x = 1;
        else if(n >= 15 && n < 18) x = 2;
        else if(n >= 18 && n < 26) x = 3;

        System.out.print("A sua categoria é: ");
        switch(x){
            case 1:
                System.out.println("Infantil.");
                break;
            case 2:
                System.out.println("Juvenil.");
                break;
            case 3:
                System.out.println("Adulto.");
                break;
            default:
                System.out.println("Categoria não encontrada.");
        }


    }

}
