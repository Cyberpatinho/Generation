package gen;
import java.util.*;

public class Ex1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int y, m, d;
		
		System.out.println("Entre a quantidade de anos: ");
		y = in.nextInt();
		System.out.println("Entre a quantidade de meses: ");
		m = in.nextInt();
		System.out.println("Entre a quantidade de dias: ");
		d = in.nextInt();
			
		System.out.println("A sua idade em dias é: " + (365*y + 30*m + d));
		
		in.close();
		
	}

}
