package gen;
import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double A, B, C;
		System.out.println("Entre com a primeira nota: ");
		A = in.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		B = in.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		C = in.nextDouble();
		
		System.out.printf("A m?dia ponderada das notas foi %.2f", (2*A+ 3*B + 5*C)/10.0);
		
		in.close();

	}

}
