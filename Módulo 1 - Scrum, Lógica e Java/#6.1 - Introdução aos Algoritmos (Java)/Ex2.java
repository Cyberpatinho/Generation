package gen;
import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int y, m, d;
		System.out.println("Entre com a quantidade de dias: ");
		d = in.nextInt();
		
		y = d/365; d %= 365;
		m = d/30; d %= 30;

		System.out.println("A sua idade � de " + y + " ano(s), " + m + " mes(es) e " + d + " dia(s).");
		
		in.close();
		
	}

}
