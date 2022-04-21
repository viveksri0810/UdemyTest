package Map;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MapExample location = new MapExample();
        location.addLocation(0, "You are standing at the end of the road before a small brick building");
        location.addLocation(1, "You are sitting in front of laptop learning java");
        location.addLocation(2, "you are at the top of hill");
        location.addLocation(3, "you are at beach");

//        location.printKey();
        int loc=0;

        while (true){
            location.getDescription(loc);
            Scanner scanner=new Scanner(System.in);
            loc=scanner.nextInt();
            if(loc<=1){
                break;
            }else if(!location.containsKey(loc)){
                break;
            }

        }
    }
}
