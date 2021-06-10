package gen;
import java.util.*;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		double x1, y1, x2, y2;
		System.out.println("Entre com x1: ");
		x1 = in.nextDouble();
		System.out.println("Entre com y1: ");
		y1 = in.nextDouble();
		System.out.println("Entre com x2: ");
		x2 = in.nextDouble();
		System.out.println("Entre com y2: ");
		y2 = in.nextDouble();
		
		System.out.println("A distância entre os pontos é: " + Math.sqrt(Math.pow(x1-x2, 2)*Math.pow(y1-y2, 2)));
		
		in.close();

	}

}
