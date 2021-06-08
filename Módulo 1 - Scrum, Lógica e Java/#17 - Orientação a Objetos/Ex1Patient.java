package gen;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public class Ex1Patient {

    public static void main(String[] args){

        /*
          Explicação: Após a entrada dos dados, o programa cria uma simulação do tratamento e avanço da doença
          para ver se o paciente sobreviverá ou não.
        */


        int id;
        String name;
        double health, severity;

        Scanner in = new Scanner(System.in);

        System.out.print("Entre com o nome do(a) paciente: ");
        name = in.nextLine();
        System.out.print("Entre com o ID do(a) paciente: ");
        id = in.nextInt();
        System.out.print("Entre com estado inicial de saúde do(a) paciente: ");
        health = in.nextDouble();
        System.out.print("Entre com a severidade da condição do(a) paciente: ");
        severity = in.nextDouble();

        Ex1PatientClass p = new Ex1PatientClass(name, health, id, severity);

        System.out.println();
        double aux = p.getHealth();
        while(aux > 0.0 &&  aux < 100.0){
            p.getTreatment();
            aux = p.getHealth();
            p.status();
            System.out.println();

            if(aux >= 100.0) break;
            p.getDamaged();
            aux = p.getHealth();
            p.status();
            System.out.println();

        }

        System.out.println(" --- Notificação do Hospital --- ");
        System.out.println("Paciente: " + p.getName());
        System.out.println("Identificação: " + p.getId());
        System.out.println("Situação: " + (aux >= 100.0? "Alta" : "Morto(a)"));

    }

}
