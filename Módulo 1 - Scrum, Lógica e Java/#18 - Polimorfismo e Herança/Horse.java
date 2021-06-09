package gen;

public class Horse extends Animal{

    int speed;
    public Horse(String name, int age) {
        super(name, age);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printInfo(){
        System.out.printf("Nome: %s\nIdade: %d\nVelocidade: %dkm/h\n", name, age, speed);
    }
    }

}

