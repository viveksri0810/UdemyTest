package Autoboxing_Unboxing;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {


        //Integer is a class which help is storing int value arraylist because
        // Arraylist does not accept primitive data type similarly Double etc.
        Integer myInt = 5;

        //Integer myInt= new Integer(5); this work is background ....
        System.out.println(myInt);

        ArrayList<Integer> myIntValue = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            myIntValue.add(i);
            //Autoboxing
            //myIntValue.add(Integer.valueOf(i));
            //this code is working in backend when we give myIntValue.add(i);

        }

        for (int i = 1; i <= 10; i++) {
            int a = myIntValue.get(i);

            //Unboxing
            //int a=myIntValue.get(i).intValue();
            //this code work in background when we give int a=myIntValue.get(i);

            System.out.println(a);
        }
    }
}
