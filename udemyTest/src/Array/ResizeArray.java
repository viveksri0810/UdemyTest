package Array;

import java.util.Arrays;

public class ResizeArray {

    public static int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    //    array=new int[11];
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
//        resizeArray();
        array = new int[12];
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ResizeArray.array));
        array = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ResizeArray.array));
    }


//    public static void resizeArray(){
////        int [] array1=array;
//        array=new int[12];
// //       for (int i=0;i<10;i++){
////            array[i]=array1[i];
//        }

//    }
}
