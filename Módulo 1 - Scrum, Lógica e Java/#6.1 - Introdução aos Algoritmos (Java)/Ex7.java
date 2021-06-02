package gen;
import java.util.*;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double A, B, C, D, E, F;
		System.out.println("Entre com o número A: ");
		A = in.nextDouble();
		System.out.println("Entre com o número B: ");
		B = in.nextDouble();
		System.out.println("Entre com o número C: ");
		C = in.nextDouble();
		System.out.println("Entre com o número D: ");
		D = in.nextDouble();
		System.out.println("Entre com o número E: ");
		E = in.nextDouble();
		System.out.println("Entre com o número F: ");
		F = in.nextDouble();
		
		System.out.printf("O valor de x é %.2f", ((C*E)-(B*F))/((A*E)-(B*D)));
		System.out.printf("O valor de y é %.2f", ((A*F)-(C*D))/((A*E)-(B*D)));
		
		in.close();

	}

}
