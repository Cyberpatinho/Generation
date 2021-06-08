package gen;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ex3PlaneClass {

    int model, airspeed, price;
    double fuelConsumption;

    void setModel(int model){ this.model = model; }
    int getModel() { return this.model; }

    void setAirspeed(int airspeed){ this.airspeed = airspeed; }
    int getAirspeed() { return this.airspeed; }

    void setPrice(int price){ this.price = price; }
    int getPrice(){ return this.price; }

    void setFuelConsumption(double fuelConsumption){ this.fuelConsumption = fuelConsumption; }
    double getFuelConsumption(){ return this.fuelConsumption; }

    Ex3PlaneClass(int model, int airspeed, int price, double fuelConsumption){
        setModel(model);
        setAirspeed(airspeed);
        setPrice(price);
        setFuelConsumption(fuelConsumption);
    }

    void info(){
        System.out.println("Modelo: " + this.model + "-" + ThreadLocalRandom.current().nextInt(100, 999));
        System.out.println("Velocidade: " + this.airspeed + "km/h");
        System.out.println("Preço: R$" + this.price + ",00");
        System.out.println("Consumo de Combustível: " + this.fuelConsumption + "L/100km");
    }

}
