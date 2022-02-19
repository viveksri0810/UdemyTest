package Composition.Class;

public class Main1 {
    public static void main(String[] args) {
        Class3 class3 = new Class3(1, 2, 3, 4, 5, 6);
        Class2 class2 = new Class2(7, 8, 9, 10, 11, 12);
        Class4 class4 = new Class4(class2, class3);
        System.out.println(class4.getClass2().getClass1().getA());
        System.out.println(class4.getClass3().getClass1().getA());
        System.out.println(class4.getClass2().getClass1().getA());

    }
}
