package gen;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ex2EmployeeClass {

    private String name;
    private int id;
    private double hourlyWage, wage = 0;

    public String getName(){ return name; }
    public void setName(String name) {this.name = name; }

    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }

    public double getHourlyWage() { return hourlyWage; }
    public void setHourlyWage(double hourlyWage) { this.hourlyWage = hourlyWage; }

    public double getWage() { return wage; }
    public void setWage(double wage) { this.wage = wage; }

    Ex2EmployeeClass(String name, int id, double hourlyWage){
        setName(name);
        setId(id);
        setHourlyWage(hourlyWage);
    }

    public int work(){ return ThreadLocalRandom.current().nextInt(0, 12); }

    public double bonus(){ return (Math.round(this.wage/this.hourlyWage) > 154? 1.1 : 1.0); }

    public void fire(){ System.out.println(this.name + " não atingiu o mínimo de 110 horas mensais de trabalho e foi demitido(a)"); }

    public void info(){
        System.out.println(" --- Relatório Mensal de Funcionário --- ");
        System.out.println("Nome: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Horas trabalhadas: " + Math.round(this.wage/this.hourlyWage));
        System.out.printf("Salário: R$%.2f\n", (this.wage)*(this.bonus()));
        if(Math.round(this.wage/this.hourlyWage) < 110) this.fire();
    }


}
