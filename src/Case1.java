public class Case1 {
    //wykorzystanie metody publicMethod w klasie Case 4
    public static void main(String[] args) {
        Lab_4 myLab_4_6 = new Lab_4(5, "Public method ", "from", " Lab_4");
        String publicField6 = myLab_4_6.publicMethod();
        System.out.println(publicField6);
    }
}
