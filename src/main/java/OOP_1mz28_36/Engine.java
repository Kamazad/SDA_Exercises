package OOP_1mz28_36;
//Ex 28

import lombok.Getter;
import lombok.Setter;

public class Engine {
    private Double capacity;
    @Getter
    @Setter
    private Double horsePower;
    @Getter
    @Setter
    private Double fuelConsumption;

    //Ex 29
    public Engine(Double capacity, Double horsePower, Double fuelConsumption) {
        this.capacity = capacity;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
    }

    //Ex 30 & 31
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public Double getCapacity() {
        return this.capacity;
    }
}
