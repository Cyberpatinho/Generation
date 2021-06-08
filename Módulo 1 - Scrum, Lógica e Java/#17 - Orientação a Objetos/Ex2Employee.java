package gen;
import java.util.*;

public class Ex2Employee {

    public static void main(String[] args){

        /*
           Explicação: Simula um mês de trabalho. Caso o funcionário atinja mais de 154 horas mensais trabalhadas (7 horas diárias menos finais de semana),
           ele ganha um bônus de 10% no salário. Caso não atinja o mínimo de 110 horas (5 horas diárias menos finais de semana), é demitido.
         */

        Scanner in = new Scanner(System.in);

        String name;
        int id;
        double hourlyWage;
        System.out.print("Entre com o nome do(a) funcionário(a): ");
        name = in.nextLine();
        System.out.print("Entre com o id do(a) funcionário(a): ");
        id = in.nextInt();
        System.out.print("Entre com o salário-hora do(a) funcionário(a): ");
        hourlyWage = in.nextDouble();

        Ex2EmployeeClass e = new Ex2EmployeeClass(name, id, hourlyWage);

        for(int i = 1; i<=30; i++){
            System.out.println("Dia " + i);
            int aux = e.work();
            System.out.println("Horas trabalhadas: " + aux);
            System.out.println();
            e.setWage(e.getWage() + aux*e.getHourlyWage());
        }

        e.info();


    }


}
