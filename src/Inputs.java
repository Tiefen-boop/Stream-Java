import java.util.Scanner;

public class Inputs {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        // input integers from console
        System.out.println("Insert an integer:");
        int x = reader.nextInt();
        System.out.println("Now 'x' is: " + x);
        System.out.print("\nHow much do you want to add to x? ");
        int addToX = reader.nextInt();
        x = x + addToX; // first compute (x + addToX), then put the result in 'x'
        System.out.println("Now 'x' is: " + x);

        System.out.println("\nLets subtract from 'x' now");
        System.out.print("How much do you want to take from 'x'? ");
        x = x - reader.nextInt(); // instead of saving the input into a new variable, use it immediately

        System.out.println("Now 'x' is: " + x);
         */

        // input Strings from console
        System.out.print("What is your name? ");
        String name = reader.nextLine();
        System.out.println("Hello " + name + "! It's nice meeting you!");
    }
}
