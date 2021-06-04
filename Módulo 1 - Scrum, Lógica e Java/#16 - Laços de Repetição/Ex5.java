package gen;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, sum = 0;
        do {
            System.out.println("Entre com o seu número: ");
            x = in.nextInt();
            sum += x;
        } while (x != 0);
        System.out.println(sum);
    }
}