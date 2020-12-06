package OOP_1mz28_36;

import lombok.Getter;
import lombok.Setter;

//Ex32
public abstract class Car {
    @Getter
    @Setter
    private String producer;
    @Getter
    @Setter
    private String colour;
    @Getter
    @Setter
    private String model;
    @Getter
    @Setter
    private int seatNumber;
    private Engine engineOfCar; //kompozycja

    public void setEngineOfCar(Engine engine1){
        this.engineOfCar = engine1;
    }

    public Engine getEngineOfCar() {
        return this.engineOfCar;

    }

    //adding constructor

    public Car (String producer, String model, String colour, Integer seatNumber, Engine engine){
        this.producer = producer;
        this.model = model;
        this.colour = colour;
        this.seatNumber = seatNumber;
        this.engineOfCar = engine;
    }
}
