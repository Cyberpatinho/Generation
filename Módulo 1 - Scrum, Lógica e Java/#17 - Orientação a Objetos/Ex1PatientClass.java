package gen;
import java.util.concurrent.ThreadLocalRandom;

public class Ex1PatientClass {

    private String name;
    private double health, severity;
    private int id;

    Ex1PatientClass(String name, double health, int id, double severity){
        this.name = name;
        this.id = id;
        this.severity = severity;
        this.health = health - severity;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getHealth(){
        return this.health;
    }

    public void setHealth(double health){
        this.health = health;
    }


    public void status(){
        if(health >= 100.0){
            System.out.println(this.name + " diz: Não estou mais doente!!!");
        }
        else if(health >= 80.0){
            System.out.println(this.name + " diz: Estou me sentindo bem!");
        }
        else if(health >= 50.0){
            System.out.println(this.name + " diz: Estou me sentindo okay *cough* *cough*");
        }
        else if(health >= 30.0){
            System.out.println(this.name + " diz: *cough* E-eu não e-estou me sentindo *cough* b-bem *cough* *cough*");
        }
        else if(health > 0.0){
            System.out.println(this.name + " diz: ...");
        }
        else{
            System.out.println("Oh não! " + this.name + " faleceu!");
        }

    }

    double[] mult1 = new double [] {0.0, 0.3, 0.3, 0.3, 0.5, 0.7};
    double[] mult2 = new double []  {0.0, 0.1, 0.2, 0.3, 0.5, 1.0};

    public void getTreatment(){
        System.out.print(this.name + " está em tratamento...");
        int rnd = ThreadLocalRandom.current().nextInt(0, 6);
        this.health += 100.0*mult1[rnd];
        System.out.println();
    }

    public void getDamaged(){
        System.out.print("A condição de " + this.name + " está progredindo...");
        int rnd = ThreadLocalRandom.current().nextInt(0, 6);
        this.health -= 100.0*mult2[rnd];
        System.out.println();
    }

}
