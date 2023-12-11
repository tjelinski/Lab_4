import java.util.*;

/*1. 2. 3. 4. 5. 8. 9. 10. 11.*/
public class Lab_4 {
    // pola
    int value;
    static  int i,j;
    private  String fieldOne;
    public  String fieldTwo;
    protected  String fieldThree;

    // konstruktor domyślny ustawiający wartość na 0
    public Lab_4() {
        //this.value = 1; //jeśli nic nie zostanie wprowadzone ustawiana domyslna wartosć dla int value = 0
    }
    // konstruktor z parametrem ustawiający wartość zgodnie z podanym argumentem
    public Lab_4(int value, String fieldOne, String fieldTwo, String fieldThree) {
        this.value = value;
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
        this.fieldThree = fieldThree;
    }
    public static void main(String[] args) {
        Lab_4 myLab_4 = new Lab_4(); // utw. obiektu konstruktor domyślny
        Lab_4 myLab_4_1 = new Lab_4(10, "It's", "with",  "parametr"); // utw. obiektu klasy i przekazanie ustawionej wartości 10
        Lab_4 myLab_4_2 = new Lab_4(2, "This ", "is", " private");
        Lab_4 myLab_4_3 = new Lab_4(3, "This ", "is", " public");
        Lab_4 myLab_4_4 = new Lab_4(4, "This ", "is", " protected");
        Lab_4.LegacyLab_4 legacyLab_4 = myLab_4.new LegacyLab_4();

        // metody zwracaja wartość
        int retrievedValue = myLab_4.getValue();
        int retrievedValue2 = myLab_4_1.getValue();
        String privateField2 = myLab_4_2.privateMethod();
        String publicField2 = myLab_4_3.publicMethod();
        String protectedField2 = myLab_4_4.protectedMethod();
        String protectedField5 = myLab_4_4.protectedMethod();

        System.gc(); //sugestia wywołania garbage collector'a jednak decyduje o tym JVM (Java Virtual Machine) w sytuacjach gdy jest to konieczne

        // wyświetlenie
        System.out.println("Value: " + retrievedValue);
        System.out.println("Value: " + retrievedValue2);
        System.out.println("Private: " + privateField2);
        System.out.println("Public: " + publicField2);
        System.out.println("Protected: " + protectedField2);
        System.out.println();

        //5. tablica dwuwymiarowa z liczbami losowymi, sort, histogram
        int [][] tab = new int [10] [10];
        Random random = new Random();

        for (int i = 0; i<tab.length; i++){
            for ( int j =0; j<tab[i].length;j++) {
                tab[i][j] =random.nextInt(26) + 20;
            }
        }
        //
        // https://stackoverflow.com/questions/15452429/java-arrays-sort-2d-array#:~:text=Decreasing/increasing%20order%20for%20an%20integer%20array%20of%202%20dimension%20you%20can%20use%3A

        Arrays.sort(tab, ( i, j) -> Integer.compare(i[0],j[0]));
        for (int i = 0; i < tab.length; i++) {
            System.out.println(Arrays.toString(tab[i]));
            System.out.println();
        }

        // Zlicz ilość wystąpień poszczególnych liczb
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int[] row : tab) {
            for (int value : row) {
                histogram.put(value, histogram.getOrDefault(value, 0) + 1);
            }
        }

        // Wyświetl histogram
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Tablica typów prostych i odwołanie się do jej elementów
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Element at index 2 in intArray: " + intArray[2]);

        // Tablicę obiektów i odwołanie się do jej elementów
        Lab_4[] labArray = {myLab_4, myLab_4_1, myLab_4_2, myLab_4_3, myLab_4_4};
        System.out.println("FieldTwo value in labArray: " + labArray[3].fieldTwo);

        // Wyszukaj dowolny element z tablicy obiektów
        String searchedField = "is";
        for (Lab_4 lab : labArray) {
            if (lab.fieldTwo.contains(searchedField)) {
                System.out.println("Found element in labArray: " + lab.fieldTwo);
                break;
            }
        }

        // Sortowanie elementów w tablicy obiektów
        Arrays.sort(labArray, Comparator.comparing(lab -> lab.fieldTwo));
        System.out.println("Sorted labArray by fieldTwo:");
        for (Lab_4 lab : labArray) {
            System.out.println(lab.fieldTwo);
        }
    }

    // metoda zwracająca wartość
    public int getValue() {
        return value ;
    }

    // metoda prywatna dostępna tylko w obrębie tej klasy
    private String privateMethod() {
        return fieldOne + fieldTwo + fieldThree;
    }

    // metoda publiczna dostępna z dowolnego miejsca
    public String publicMethod() {
        return fieldOne + fieldTwo + fieldThree;
    }

    // metoda chroniona dostępna w tej klasie i klasach pochodnych
    protected String protectedMethod() {
        return fieldOne + fieldTwo + fieldThree;
    }

    //klasa dziedzicząca po Lab_4 wykorzystanie metody protected
    public class LegacyLab_4 extends Lab_4{
        public LegacyLab_4() {
            super(); // wywołanie konstruktora klsy bazowej
            Lab_4 myLab_4_5 = new Lab_4(5, "Protected method ", "from class", " Lab_4");
            String fieldFour = myLab_4_5.protectedMethod();
            System.out.println(fieldFour);
            System.out.println();
        }
    }
}