package danielConlin.basics;

import java.util.Scanner;

public class Input {

    public static void testInput(){
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.printf("Hello " + input + ".");
    }


}
