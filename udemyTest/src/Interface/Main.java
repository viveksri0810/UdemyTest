package Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        ListIterator listIterator=readValues().listIterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }

        Player tim=new Player("Tim",10,15);
        System.out.println(tim);
        System.out.println(tim.getName());
        System.out.println(tim.getHotPoints());
        System.out.println(tim.getStrength());
        System.out.println(tim.getWeapon());

        tim.setWeapon("Gun");

        System.out.println(tim.getName());
        System.out.println(tim.getHotPoints());
        System.out.println(tim.getStrength());
        System.out.println(tim.getWeapon());


    }

    public static ArrayList<String> readValues() {

        ArrayList<String> values = new ArrayList<String>();
        boolean quit = false;

        while (!quit) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please select an option\n" + "0. to exit\n" + "1. to enter string");
            System.out.print("Please enter your option: ");
            int option=0;
            try {
                option= scan.nextInt();
            } catch (Exception InputMismatchException){
                System.out.println("Please enter valid input");
                throw InputMismatchException;
            }
            switch (option) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.print("Enter a String: ");
                    String str = scan.next();
                    values.add(str);
                    break;

            }
        }

        return values;
    }
}
