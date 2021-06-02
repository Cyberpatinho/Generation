package gen;
import java.util.*;

public class Ex8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double c1;
		System.out.println("Entre com o custo inicial: ");
		c1 = in.nextDouble();
		
		System.out.printf("O custo ao consumidor é R$: %.2f", c1 + 0.73*c1);
		
		in.close();
		
	}

}
