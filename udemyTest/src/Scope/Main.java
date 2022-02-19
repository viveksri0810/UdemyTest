package Scope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi");

        X x=new X();
        x.x(new Scanner(System.in));
        x.x();
    }
}
