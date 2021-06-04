package gen;
import java.util.*;
public class Ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = 5, age, sex, temp, ans[] = new int[6];
        while(x-- > 0){
            System.out.println("Entre com a idade: ");
            age = in.nextInt();
            System.out.println("Entre com o sexo (1 - Feminino / 2 - Masculino / 3 - Outro)");
            sex = in.nextInt();
            System.out.println("Entre com o temperamento (1 - Calmo / 2 - Nervoso / 3 - Agressivo)");
            temp = in.nextInt();
            ans[0] += (temp == 1? 1 : 0);
            ans[1] += (sex == 1 && temp == 2? 1 : 0);
            ans[2] += (sex == 2 && temp == 3? 1 : 0);
            ans[3] += (sex == 3 && temp == 1? 1 : 0);
            ans[4] += (age > 40 && temp == 2? 1 : 0);
            ans[5] += (age < 18 && temp == 1? 1 : 0);
        }
        System.out.printf("O número de pessoas calmas é %d\nO número de mulheres nervosas é: %d\nO número de homens agressivos é: %d\nO número de outros calmos é: %d\n" +
                "O número de pessoas nervosas com mais de 40 anos é: %d\nO número de pessoas calmas com menos de 18 anos é: %d", ans[0], ans[1], ans[2], ans[3], ans[4], ans[5]);
    }
}
