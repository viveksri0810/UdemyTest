package Basic;

import java.util.Scanner;

public class NonStatic {
    private String generateBeetrtProgramId(String program){
        return switch (program) {
            case "symcor" -> Static.Program_Id_Symcor;
            case "lockbox" -> Static.Program_Id_Lockbox;
            case "acorn" -> Static.Program_id_Acorn;
            case "" -> "please provide input";
            default -> "Invalid program id is passed";
        };
    }

    public static void main(String[] args) {
        NonStatic abc = new NonStatic();
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter Program Name : ");
        String programName=scan.nextLine();
        System.out.println(abc.generateBeetrtProgramId(programName.toLowerCase()));

    }
}
