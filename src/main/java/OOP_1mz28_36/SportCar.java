package OOP_1mz28_36;
//Ex33
public class SportCar extends Car implements LoudCar{

    public SportCar (String producer, String model, String colour, Integer seatNumber, Engine engine) {
        super(producer, model, colour, seatNumber, engine);
    }

    @Override
    public String loudBrumBrum() {
        return "BRUUMMMMMM!!!!";
    }
}
