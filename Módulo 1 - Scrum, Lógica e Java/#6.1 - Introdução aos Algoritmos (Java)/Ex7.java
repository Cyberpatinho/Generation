package gen;
import java.util.*;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double A, B, C, D, E, F;
		System.out.println("Entre com o n�mero A: ");
		A = in.nextDouble();
		System.out.println("Entre com o n�mero B: ");
		B = in.nextDouble();
		System.out.println("Entre com o n�mero C: ");
		C = in.nextDouble();
		System.out.println("Entre com o n�mero D: ");
		D = in.nextDouble();
		System.out.println("Entre com o n�mero E: ");
		E = in.nextDouble();
		System.out.println("Entre com o n�mero F: ");
		F = in.nextDouble();
		
		System.out.printf("O valor de x � %.2f", ((C*E)-(B*F))/((A*E)-(B*D)));
		System.out.printf("O valor de y � %.2f", ((A*F)-(C*D))/((A*E)-(B*D)));
		
		in.close();

	}

}
