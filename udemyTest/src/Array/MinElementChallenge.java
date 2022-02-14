package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    public static void main(String[] args) {

        int[] array= readElements(readInteger());
        System.out.println(Arrays.toString(array));
        System.out.println(findMin(array));

    }
    private static int readInteger(){
        Scanner scan=new Scanner(System.in);
        int integer=scan.nextInt();
        scan.close();
        return integer;
    }

    private static int[] readElements(int num){
        int[] array=new int[num];
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<num;i++){
            array[i]=scan.nextInt();
        }
        scan.close();
        return array;
    }

    private static int findMin(int[] array){
        int temp;
        for (int i=1;i< array.length;i++){
            if(array[0]>array[i]){
                temp=array[0];
                array[0]=array[i];
                array[i]=temp;
            }
        }
        return array[0];
    }
}
