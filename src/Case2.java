import java.util.Objects;
/* 6. 7. */
public class Case2 implements Cloneable {
    private int id;         // pole przechowujące identyfikator
    private String name;    // pole przechowujące nazwę

    // konstruktor klasy Case2, inicjalizuje pola obiektu
    public Case2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // metoda toString() zwracająca tekstową reprezentację obiektu
    @Override
    public String toString() {
        return "Case2 [" + "id=" + id + ", name='" + name + '\'' + ']';
    }

    // metoda equals() do porównywania obiektów
    @Override
    public boolean equals(Object obj) {
        // sprawdzenie, czy referencje wskazują na ten sam obiekt
        if (this == obj) return true;
        // sprawdzenie, czy obiekt nie jest nullem i czy należy do tej samej klasy
        if (obj == null || getClass() != obj.getClass()) return false;
        // rzutowanie obiektu na typ klasy Case2
        Case2 case2 = (Case2) obj;
        // porównanie identyfikatorów i nazw, używając metody equals z klasy Objects
        return id == case2.id && Objects.equals(name, case2.name);
    }

    // metoda hashCode() powinna być zaimplementowana w parze z equals()
    @Override
    public int hashCode() {
        // wygenerowanie hasha na podstawie identyfikatora i nazwy, używając metody hash z klasy Objects
        return Objects.hash(id, name);
    }

    // metoda clone() do klonowania obiektu
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // wywołanie metody clone z klasy Object (super.clone()) - klonowanie
        return super.clone();
    }

    // metoda main, rozpoczyna wykonanie programu
    public static void main(String[] args) {
        // tworzenie obiektu one klasy Case2
        Case2 one = new Case2(1, "First 1");
        // tworzenie obiektu two klasy Case2
        //Case2 two = new Case2(2, "Two 2");
        Case2 two = new Case2(1, "First 1");

        // clone() klonowanie
        try {
            // klonowanie obiektu one i two
            Case2 cloneObject = (Case2) one.clone();
            Case2 cloneObject2 = (Case2) two.clone();
            // Wydrukowanie sklonowanego obiektu
            System.out.println("Clone: " + cloneObject);
            System.out.println("Clone: " + cloneObject2);
        } catch (CloneNotSupportedException e) {
            // Obsługa wyjątku CloneNotSupportedException
            e.printStackTrace();
        }

        // equals() porównywanie
        // drukowanie wyniku porównania obiektów one i two przy użyciu metody equals
        System.out.println("Objects are equal: " + one.equals(two));

        // finalize() sugestia wywołania wywołanie garbage collector
        // referencja na null w celu sugerowania Garbage Collectorowi, że obiekty nie są już używane
        one = null;
        two = null;
        // sugestia garbage collector'a
        System.gc();

        // toString() tekst
        // drukowanie tekstowej reprezentacji obiektów one i two przy użyciu metody toString
        System.out.println(one + " object");
        System.out.println(two + " object");
    }
}
