package gen;
import java.util.Scanner;
import java.util.ArrayList;

// - Classe destinada a interações do usuário com a plataforma
public class UserInterface extends Perfil {

    // - Propriedades
    Scanner in = new Scanner(System.in);
    private ArrayList<Filme> favs;
    private ArrayList<Filme> forYou;
    private Filme selected;
    private String lastWatch;


    // - Construtor
    UserInterface(String nome, String email, String plano, String login, String senha) {

        super(nome, email, plano, login, senha);
        setFav(new ArrayList<Filme>());
        setForYou(new ArrayList<Filme>());
        setSelected(new Filme("N/A", "N/A", 0, "N/A", 0, "N/A"));
        setLastWatch(lastWatch = "N/A");

    }


    // - Validador de entrada
    int checker(int a, int b){
        int x = -1;
        while (x < a || x > b) {
            x = in.nextInt();
            if (x >= a && x <= b) break;
            System.out.println("Opção inválida! Digite um número entre " + a + " e " + b);
        }
        return x;
    }


    // - Método para iniciar filme
    public void start (Filme mov) {

        System.out.println("O filme " + mov.getNome() + "já irá iniciar!");
        System.out.println("Selecione o idioma: (1 - PT | 2 - EN | 3 - ES)");

        int aux = checker(1, 3);

        System.out.println("Gostaria de uma legenda? (1 - PT | 2 - EN | 3 - ES | 4 - Sem legenda)" );

        checker(1, 4);

        if (aux == 1) System.out.println("Bom filme! ");
        if (aux == 2) System.out.println("Have a nice movie! ");
        if (aux == 3) System.out.println("Buena película! ");

    }

    // - Método para controlar os filmes (rodar, pausar e parar)
    public void controller(Filme mov) {

        System.out.println("Você está acessando o controle de vídeo. ");
        System.out.println("O que deseja fazer? (1 - Rodar | 2 - Pausar | 3 - Parar)");

        int aux = checker(1, 3);

        //if (aux == 1) mov.rodar();
        if (aux == 2) mov.pausar();
        if (aux == 3) mov.parar();

    }

    // - Método para favoritar um filme
    public void favorite(Filme mov) {
        System.out.println("O filme " + mov.getNome() + " foi adicionado aos seus favoritos. ");
        favs.add(mov);
    }

    // - Método para avaliar um filme
    void rate(Filme mov) {

    }




    // - Getters e Setters
    public ArrayList<Filme> getFav() { return favs; }
    public void setFav(ArrayList<Filme> fav) { this.favs = fav; }
    public ArrayList<Filme> getForYou() { return forYou; }
    public void setForYou(ArrayList<Filme> forYou) { this.forYou = forYou; }
    public Filme getSelected() { return selected; }
    public void setSelected(Filme selected) { this.selected = selected; }
    public String getLastWatch() { return lastWatch; }
    public void setLastWatch(String lastWatch) { this.lastWatch = lastWatch; }

}

