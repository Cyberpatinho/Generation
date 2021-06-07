package gen;

public class Ex1 {
    public static void main(String[] args){

        int[] v = {1, 0, 5, -2, -5, 7};
        int sum = v[0] + v[1] + v[5];
        System.out.println("A soma dos valores V[0], V[1] e V[5] é: " + sum);
        v[3] = 100;
        for(int i = 0; i<6; i++) System.out.println(v[i]);

    }
}
