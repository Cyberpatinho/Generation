package gen;
import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com a quantidade de segundos: ");
		int s = in.nextInt();
		
		int h = s/3600; s %= 3600;
		int m = s/60; s %= 60;
		
		System.out.println("A dura??o foi de " + h + " hora(s) " + m + " minuto(s) " + s + " segundo(s)");
		
		in.close();
		
	}

}
