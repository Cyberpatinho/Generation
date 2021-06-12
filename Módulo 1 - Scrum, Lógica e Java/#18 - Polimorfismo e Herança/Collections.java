package gen;
import java.util.Scanner;
import java.util.ArrayList;

public class Collections {

    public static class Product{
        public String name;
        public int amnt;
        public Product(String name, int amnt) {
            this.name = name;
            this.amnt = amnt;
        }
    }

    public static void main(String[] args){

        ArrayList<Product> stock = new ArrayList<Product>();

        Scanner in = new Scanner(System.in);
        System.out.println("Entre com a quantidade de dias que você quer simular: ");

        int n = in.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Mostrar estoque");
            int x = in.nextInt();
            in.nextLine();

            if(x == 1){
                System.out.print("Entre com o nome do produto: ");
                String s = in.nextLine();
                System.out.print("Entre com a quantidade do produto: ");
                int q = in.nextInt();
                in.nextLine();

                boolean flag = false;
                for(int j = 0; j < stock.size(); j++){
                    if(s.equals(stock.get(j).name)){
                        flag = true;
                        stock.get(j).amnt += q;
                    }

                }
                if(!flag){
                    stock.add(new Product(s, q));
                }

            }
            if(x == 2){
                System.out.print("Entre com o nome do produto que deseja remover: ");
                String s = in.nextLine();
                System.out.print("Entre com a quantidade do produto que deseja remover: ");
                int q = in.nextInt();
                in.nextLine();

                for(int j = 0; j < stock.size(); j++) {
                    if (s.equals(stock.get(j).name)) {
                        stock.get(j).amnt -= q;
                    }
                }

            }

            if(x == 3){
                System.out.println("Estoque: ");
                for(int j = 0; j<stock.size(); j++){
                    System.out.println("Produto: " + stock.get(j).name + " | Quantidade: " + stock.get(j).amnt);
                }

            }

        }

        in.close();

    }

}
