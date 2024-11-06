public class Arrays {
    public static void main(String[] args) {
        // in order to hold many different values we can create many different variables
        int x = 5;
        int y = 3;
        int z = 2;
        // this is cumbersome, every variable needs to be declared, and we have to track many different names

        // instead, we can create a bulk of variables of the same type, under a single name using arrays

        //    vv - the '[]' means this is an array
        // vvv - this is the type of every element of the array
        //               vvv 'new' - allocate memory for the array
        //                   vvv - again the type of the elements
        //                       v - how many elements the array will have
           int[] array = new int[4];
        // we imagine the array as a sequence of cells, each cell acts as a variable of its own
        // indexes of the cells are non-negative integers starting at 0
        // array : | 0 | 0 | 0 | 0 |
        // index :   0   1   2   3

        array[0] = 5;
        // array : | 5 | 0 | 0 | 0 |
        // index :   0   1   2   3
        array[2] = 7;
        // array : | 5 | 0 | 7 | 0 |
        // index :   0   1   2   3
        array[3] = 100;
        // array : | 5 | 0 | 7 |100|
        // index :   0   1   2   3
        System.out.println("array[0] = " + array[0]);
        System.out.println("array[1] = " + array[1]);
        System.out.println("array[2] = " + array[2]);
        System.out.println("array[3] = " + array[3]);
        // using almost the same line in order to print the array is very uncool
        System.out.println("---------------------------");
        // let's use a 'for' loop:
    //  vvv - declare the start of a 'for' loop
        //   vvvvvvvvv - a command that runs once, before entering the loop's body
        //             vvvvvvvvvvvvvvvvvv - a condition that is checked every time before entering loop's body, if holds - loop's body is executed
        //                                 vvvvvvvvv - another command that is run every time loop's body's execution ends
        System.out.println("entering the loop\n");
        for (int i = 0; i < array.length /* = 4 */ ; i = i + 1) { // loops body is all the commands inside these curly braces
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println("\nexited the loop");
    }
}
