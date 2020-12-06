package OOP_1mz28_36;
//Ex33
public class SportCar extends Car implements LoudCar{
    //Ex34
    public SportCar (String producer, String model, String colour, Engine engine) {
        super(producer, model, colour, 2, engine);
}

    //Ex35&36
    public SportCar (String producer, String model, String colour, Integer seatNumber, Engine engine) {
        super(producer, model, colour, seatNumber, engine);
    }

    @Override
    public String loudBrumBrum() {
        return "BRUUMMMMMM!!!!";
    }

    @Override
    public String toString() {
        return "SportCar" + super.toString();  //łapie toString od Rodzica
    }
}
