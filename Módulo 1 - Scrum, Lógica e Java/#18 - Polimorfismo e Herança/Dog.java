package gen;

public class Dog extends Animal{

    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printInfo(){
        System.out.printf("Nome: %s\nIdade: %d\nRaça: %s\n", getName(), getAge(), breed);
    }

    @Override
    public void sound(){
        System.out.println("Cachorro diz: Au Au!");
    }

    @Override
    public void run(){
        System.out.println("Cachorros conseguem correr.");
    }


}
