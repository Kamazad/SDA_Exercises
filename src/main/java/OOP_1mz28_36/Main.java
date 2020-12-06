package OOP_1mz28_36;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(2.2D, 532D, 10.0D);
        SportCar sportCar1 = new SportCar("Opel", "Corsa", "color", 2, engine);

        System.out.println(sportCar1.loudBrumBrum());

        SportCar sportCar2 = new SportCar("Daewoo", "Matiz", "Red", engine);
        System.out.println(sportCar2.toString());
    }
}
