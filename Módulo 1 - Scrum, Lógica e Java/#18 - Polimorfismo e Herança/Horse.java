package gen;

public class Horse extends Animal{

    int speed;
    public Horse(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printInfo(){
        System.out.printf("Nome: %s\nIdade: %d\nVelocidade: %dkm/h\n", getName(), getAge(), speed);
    }

    @Override
    public void sound(){
        System.out.println("Cavalo diz diz: Iiiiiiiiiir!");
    }

    @Override
    public void run(){
        System.out.println("Cachorros conseguem correr.");
    }

}

