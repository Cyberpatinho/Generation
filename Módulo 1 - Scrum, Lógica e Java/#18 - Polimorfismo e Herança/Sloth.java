package gen;

public class Sloth extends Animal{

    String color;
    public Sloth(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo(){
        System.out.printf("Nome: %s\nIdade: %d\nCor: %s\n", getName(), getAge(), color);
    }

    @Override
    public void sound(){
        System.out.println("Preguiça diz diz: ...!");
    }

    @Override
    public void run(){
        System.out.println("Preguiças não correm, mas sobem em árvores.");
    }

}



