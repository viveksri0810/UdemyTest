package ArrayList;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add(0);
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//
//        for(int i=0;i<4;i++){
//            arrayList.remove(2);
//        }

        String a="abc@e(s#)]\\[\\]";
        String b="abc";
        String c="efg";

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a==c);

        Pattern str= Pattern.compile(a);
        System.out.println(str);
        System.out.println(str.matcher(a));


    }
}
