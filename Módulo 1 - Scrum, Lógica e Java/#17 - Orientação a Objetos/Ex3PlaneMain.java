package gen;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex3Plane {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double money;
        System.out.printf("Entre com a quantidade de dinheiro que você tem para gastar: ");
        money = in.nextDouble();

        System.out.println("Olá, Sr(a) Cliente Rico(a). Seja muito bem vindo(a) ao nosso catálogo de aviões." +
                "Aqui você encontrará apenas os modelos mais modernos e luxuosos");

        char op = 'Y';
        do{
            int model = ThreadLocalRandom.current().nextInt(100, 999);
            int speed = ThreadLocalRandom.current().nextInt(850, 1020);
            int price = ThreadLocalRandom.current().nextInt(800000, 5500000);
            double fuelConsumption = (1.0*ThreadLocalRandom.current().nextInt(200, 900))/100;

            Ex3PlaneClass p = new Ex3PlaneClass(model, speed, price, fuelConsumption);

            p.info();

            System.out.println("Gostaria de comprar este belissímo modelo? (Y/N)");
            System.out.println("O seu saldo é de R$" + money + ",00");
            op = in.next().charAt(0);

            if(op == 'Y'){
                if(money > p.getPrice()){
                    System.out.println("Uma ótima escolha. Entregaremos dentro de uma semana!");
                    money -= p.getPrice();
                }
                else{
                    System.out.println("Que pena, você não tem o dinheiro necessário.");
                }
            }else{
                System.out.println("Tudo bem, temos muitos outros modelos.");
            }

            System.out.println("Gostaria de continuar no nosso catálogo? (Y/N)");
            op = in.next().charAt(0);
        }while(op != 'N' && op != 'n');

        System.out.println("Obrigado por nos visitar. Volte sempre!");

    }

}
