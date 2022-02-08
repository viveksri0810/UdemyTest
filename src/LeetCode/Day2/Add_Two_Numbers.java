package LeetCode.Day2;

import java.util.LinkedList;

public class Add_Two_Numbers {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(2);
        linkedList1.add(4);
        linkedList1.add(3);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(5);
        linkedList2.add(6);
        linkedList2.add(4);


        int sum1 = sum(linkedList1);
        int sum2 = sum(linkedList2);
        int sum3 = sum1 + sum2;
        String str = sum3 + "";
        LinkedList<Integer> linkedList = new LinkedList<>();
        int length = str.length() - 1;
        for (int i = length; i >= 0; i--) {
            linkedList.add(Integer.parseInt(str.charAt(i) + ""));
        }

        //return linkedList;


    }


    public static int sum(LinkedList<Integer> linkedList) {

        int sum1 = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            double pow = Math.pow(10, i);
            int value = linkedList.get(i);
            sum1 = sum1 + (int) (value * pow);
        }
        return sum1;
    }


}
