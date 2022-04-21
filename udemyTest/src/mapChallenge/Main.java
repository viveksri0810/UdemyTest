package mapChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<Integer,Location> location=new HashMap<>();
        location.put(0,new Location(0,"You are sitting in front of computer learning java"));
        location.put(1,new Location(1,"Standing at the end of the road in the front of small brick building"));
        location.put(2,new Location(2,"You are at the top of a hill"));
        location.put(3,new Location(3,"You are inside a building"));
        location.put(4,new Location(4,"You are in the Valley"));
        location.put(5,new Location(5,"You are in the Forest"));

        location.get(1).addExits("E", 3);
        location.get(1).addExits("W", 2);
        location.get(1).addExits("N", 5);
        location.get(1).addExits("S", 4);

        location.get(2).addExits("N", 5);

        location.get(3).addExits("W", 1);

        location.get(4).addExits("N", 1);
        location.get(4).addExits("W", 2);

        location.get(5).addExits("S", 1);
        location.get(5).addExits("W", 2);


        int loc=1;
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.println(location.get(loc).getDescription());
            if(loc==0){
                break;
            }
            System.out.print("Available Exits are : ");
            Map<String,Integer> exits=location.get(loc).getExits();

            for (String s:exits.keySet() ){
                System.out.print(s + " " );
            }
            System.out.print("\n"+"Input : ");

            Map<String,String> dict=new HashMap<>();
            dict.put("E","E");
            dict.put("W","W");
            dict.put("N","N");
            dict.put("S","S");
            dict.put("Q","Q");
            dict.put("EAST","E");
            dict.put("WEST","W");
            dict.put("NORTH","N");
            dict.put("SOUTH","S");
            dict.put("QUIT","Q");


            String[] str=scanner.nextLine().toUpperCase().split(" ");
            boolean notFound=false;
            for(String str1:str){
                if(dict.containsKey(str1) && exits.containsKey(dict.get(str1)) ){
                        loc=exits.get(dict.get(str1));
                        notFound=false;
                        break;
                }else {
                    notFound=true;
                }
            }

            if(notFound){
                System.out.println("You cannot go in that direction");
            }


//            if(str.equals("Q")){
//                System.out.println("Quitting .....");
//                break;
//            }else if(exits.containsKey(str)){
//                loc=exits.get(str);
//                System.out.println(loc);
//            }else {
//                System.out.println("You cannot go to that direction");
//            }
        }
    }
}
