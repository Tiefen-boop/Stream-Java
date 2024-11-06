public class Functions {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 6, 7, 8, 9, 10};
        int[] arr3 = {-1, -2, -3, -4, 2024};

        // the following code is replaced by and invocation of 'printArray' :
        /* System.out.print("arr1 = ");
         * System.out.print("{");
         * for (int i = 0; i < arr1.length; i = i + 1) {
         *     System.out.print(" " + arr1[i] + ",");
         * }
         * System.out.println("}");
         */
        printArray(arr1, "arr1");

        printArray(arr2, "arr2");

        printArray(arr3, "arr3");

        // instead of pasting almost the same code, we can use a for-loop in order to make it more dynamic
        System.out.println("--------------------");
    //       vv - this variable is an array
    //  vvvvv - the type of every element in the array is itself an array, this time of type 'int'
        int[][] arrayOfArrays = {arr1, arr2, arr3};
        for (int i = 0; i < arrayOfArrays.length; i = i + 1) {
            printArray(arrayOfArrays[i], "arr" + (i + 1));
        }
    }

//  vvvvvv - declares this function as 'standalone' (= no context needed)
//         vvvv - the type this function returns, 'void' means nothing is returned
//              vvvvvvvvvv - name of the function, we will use this to invoke the function
//                         vvvvvvvvvvvvvvvvvvvvvvvvv - function parameters, these will hold different information based on how the function was invoked
    // this functions will pretty print the array and its cells' values
    static void printArray(int[] arr, String arrName) {
        System.out.print(arrName + " = ");
        System.out.print("{");
        for (int i = 0; i < arr.length; i = i + 1) {
            System.out.print(" " + arr[i] + ",");
        }
        System.out.println("}");
    }
}
