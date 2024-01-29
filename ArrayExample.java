public class ArrayExample 
{
    public static void main(String[] args) 
    {
    	
    	
        // Example 1: Declaring and Initializing an Array
        int[] numbers = new int[5];

        // Example 2: Accessing Array Elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Example 3: Iterating Through an Array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Example 4: Array Initialization with Values
        int[] fibonacci = {0, 1, 1, 2, 3, 5, 8, 13};

        // Example 5: Finding the Length of an Array
        int length = fibonacci.length;
        System.out.println("Length of the array fibonacci: " + length);

        // Example 6: Multi-dimensional Arrays
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Element at row 1, column 2 of matrix: " + matrix[1][2]);
        
    }
}
