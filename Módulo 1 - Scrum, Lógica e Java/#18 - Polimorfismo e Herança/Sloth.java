package gen;

public class Sloth extends Animal{

    String color;
    public Sloth(String name, int age) {
        super(name, age);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.printf("Nome: %s\nIdade: %d\nCor: %s\n", name, age, color);
    }

}



