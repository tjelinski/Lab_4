import java.util.*;

/*1. sprawdzenie działania konstruktorów
  2/3. garbage collector
  4. modyfikatory dostepności*/
public class Lab_4 {
    // pola
    int value;
    private  String privateField;
    public  String publicField;
    protected  String protectedField;

    // konstruktor domyślny ustawiający wartość na 0
    public Lab_4() {
        this.value = 1; //jeśli nic nie zostanie wprowadzone ustawiana domyslna wartosć dla int value = 0
    }
    // konstruktor z parametrem ustawiający wartość zgodnie z podanym argumentem
    public Lab_4(int value, String privateField, String publicField, String protectedField) {
        this.value = value;
        this.privateField = privateField;
        this.publicField = publicField;
        this.protectedField = protectedField;
    }

    // metoda zwracająca wartość
    public int getValue() {
        return value ;
    }

    // metoda prywatna dostępna tylko w obrębie tej klasy
    private String privateMethod() {
        return privateField + publicField + protectedField;
    }

    // metoda publiczna dostępna z dowolnego miejsca
    public String publicMethod() {
        return privateField + publicField + protectedField;
    }

    // metoda chroniona dostępna w tej klasie i klasach pochodnych
    protected String protectedMethod() {
        return privateField + publicField + protectedField;
    }

    public static void main(String[] args) {
        Lab_4 myLab_4 = new Lab_4(); // utw. obiektu konstruktor domyślny
        Lab_4 myLab_4_1 = new Lab_4(10, "It's", "with",  "parametr"); // utw. obiektu klasy i przekazanie ustawionej wartości 10
        Lab_4 myLab_4_2 = new Lab_4(1, "This ", "is", " private");
        Lab_4 myLab_4_3 = new Lab_4(2, "This ", "is", " public");
        Lab_4 myLab_4_4 = new Lab_4(3, "This ", "is", " protected");



        // metody zwracaja wartość
        int retrievedValue = myLab_4.getValue();
        int retrievedValue2 = myLab_4_1.getValue();
        String privateField2 = myLab_4_2.privateMethod();
        String publicField2 = myLab_4_3.publicMethod();
        String protectedField2 = myLab_4_4.protectedMethod();

        System.gc(); //sugestia wywołania garbage collector'a jednak decyduje o tym JVM (Java Virtual Machine) w sytuacjach gdy jest to konieczne
        // wyświetlenie
        System.out.println("Value: " + retrievedValue);
        System.out.println("Value: " + retrievedValue2);
        System.out.println("Private: " + privateField2);
        System.out.println("Public: " + publicField2);
        System.out.println("Protected: " + protectedField2);
    }
}

//5.