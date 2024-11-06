public class HelloWorld {
    public static void main(String[] args) {
        //  / - slash
        //  \ - backslash
        System.out.println("This is the first Stream of Roi! \nI welcome all the viewers.");

        // vvv - int is short for integer (whole numbers)
        //     v - 'x' is the name of the variable
        //         v - a value that is stored into 'x'
        //       v - '=' take what's positioned right of the '=' (the number 1) and store it into 'x'
           int x = 1;
        System.out.println("the value that is stored into 'x' is: " + x);

        x = 5;
        System.out.println("after the change 'x' is: " + x);

        // more integer types: long, int, short, byte


        System.out.println("\n **char section:**\n");
        // new type 'char' - short for 'character', is used to hold numbers/characters by ASCII table
        // ASCII table: https://www.asciitable.com/
        char c = 65;
        System.out.println("c holds the character: '" + c + "'");
        c = 'C';
        System.out.println("after the change, c holds the character: '" + c + "'");

        x = 'F';
        System.out.println("after putting 'F' in X, 'x' is: " + x);


        System.out.println("\n **String section:**\n");
        // 'String' - a type for strings of characters
        String s = "This is a string. ";
        System.out.println(s);
        String s2 = "A beautiful string. ";
        System.out.println(s + s2);

        System.out.println("The first character of 's2' is: '" + s2.charAt(0) + "'");
        System.out.println("The 2nd character of 's2' is: '" + s2.charAt(1) + "'");
        System.out.println("The first character of 's' is: '" + s.charAt(0) + "'");
    }
}