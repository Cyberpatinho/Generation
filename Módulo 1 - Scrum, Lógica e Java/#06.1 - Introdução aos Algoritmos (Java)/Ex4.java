package gen;
import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double A, B, C;
		System.out.println("Entre com o n�mero A: ");
		A = in.nextInt();
		System.out.println("Entre com o n�mero B: ");
		B = in.nextInt();
		System.out.println("Entre com o n�mero C: ");
		C = in.nextInt();

		System.out.println("O valor de D �: " + (((A+B)*(A+B) + (B+C)*(B+C))/2.0));
		
		in.close();
		
	}

}
