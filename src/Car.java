// 13.
public class Car {
    // Pola klasy Car
    private String brand;
    private String model;
    private int year;
    private int doors;
    private double engineCapacity;
    private double price;

    // Konstruktor, który przyjmuje wszystkie informacje jako parametry
    public Car(String brand, String model, int year, int doors, double engineCapacity, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doors = doors;
        this.engineCapacity = engineCapacity;
        this.price = price;
    }

    // Metoda wyświetlająca informacje o samochodzie
    public void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of doors: " + doors);
        System.out.println("Engine capacity: " + engineCapacity + "L");
        System.out.println("Price: $" + price);
        System.out.println();
    }
}
class TestCar {
    public static void main(String[] args) {
        // tworzenie obiektów klasy Car
        Car car1 = new Car("Chevrolet", "Orlando", 2013, 5, 2.0, 8000);
        Car car2 = new Car("Chevrolet", "Aveo", 2011, 5, 1.2, 5000);

        // tworzenie tablicy obiektów klasy Car
        Car[] carsArray = {car1, car2};

        // iteracja przez tablicę i wyświetlanie informacji o każdym samochodzie
        for (Car car : carsArray) {
            car.displayCar();
        }
    }
}
