import java.util.*;
public class Case4 {
    //wykorzystanie metody publicMethod w klasie Case 4
    public static void main(String[] args) {
        Lab_4 myLab_4_5 = new Lab_4(3, "Public method ", "from", " Lab_4");
        String publicField5 = myLab_4_5.publicMethod();
        System.out.println(publicField5);
    }
}
