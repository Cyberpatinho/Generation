package gen;

public class AnimalTest {

    public static void main(String[] args){

        Dog a = new Dog("Cachoro", 7, "Vira lata");
        a.printInfo();
        a.sound();
        a.run();

        System.out.println();

        Horse b = new Horse("Cabalo", 10, 50);
        b.printInfo();
        b.sound();
        b.run();

        System.out.println();

        Sloth c = new Sloth("Peguiça", 5, "Marrom");
        c.printInfo();
        c.sound();
        c.run();

    }

}
