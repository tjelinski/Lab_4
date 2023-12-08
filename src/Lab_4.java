import java.util.*;

//1. sprawdzenie działania konstruktorów
public class Lab_4 {
    // pole
    int value;
    // konstruktor domyślny ustawiający wartość na 0
    public Lab_4() {
        //this.value = 1; //jeśli nic nie zostanie wprowadzone ustawiana domyslna wartosć dla int value = 0
    }
    // konstruktor z parametrem ustawiający wartość zgodnie z podanym argumentem
    public Lab_4(int value) {
        this.value = value;
    }
    // metoda zwracająca wartość
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Lab_4 myLab_4 = new Lab_4(); // utw. obiektu konstruktor domyślny
        Lab_4 mysecondLab_4 = new Lab_4(10); // utw. obiektu klasy i przekazanie ustawionej wartości 10

        // metoda getValue() zwraca wartość
        int retrievedValue = myLab_4.getValue();
        int retrievedValue2 = mysecondLab_4.getValue();

        // wyświetlenie
        System.out.println("Value: " + retrievedValue);
        System.out.println("Value: " + retrievedValue2);
    }
}
