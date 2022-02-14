package Array;

import java.util.Scanner;

public class Array {

    static int a;

    public static void main(String[] args) {

        int[] array={12,7,52,66,13,3}; //getInteger();
        printArray(array);
        System.out.println(array.length);
        array=sortArray(array);
        printArray(array);
        System.out.println(a);

        if (2>>3 == 1){

        }



    }

    public static int[] getInteger(int size){
//        System.out.print("enter the size of array : ");
        Scanner scan =new Scanner(System.in);
//        int size=scan.nextInt();
        int[] intArray=new int[size];
        for(int i=0;i<intArray.length;i++){
//            System.out.print("enter "+(i+1)+" element : ");
            intArray[i]=scan.nextInt();
        }
        return intArray;
    }

    public static void printArray(int[] array){
        for(int i=0;i< array.length;i++){
            System.out.println("Element "+i+" contents "+ array[i]);
        }
    }

    public static int[] sortArray(int [] array){
        int temp;
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        return array;

    }
}
