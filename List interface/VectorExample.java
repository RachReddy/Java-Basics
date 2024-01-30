import java.util.Vector;

public class VectorExample
{
    public static void main(String[] args)
    {
        // Creating a Vector
        Vector<String> vector = new Vector<>();
        
        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        
        // Printing the Vector
        System.out.println("Vector: " + vector); // Output: [Apple, Banana, Orange]
        
        // Accessing elements
        String firstElement = vector.get(0);
        System.out.println("First element: " + firstElement); // Output: Apple
        
        // Removing elements
        vector.remove("Banana");
        
        // Printing the Vector after removal
        System.out.println("Vector after removal: " + vector); // Output: [Apple, Orange]
        
        // Checking if an element exists
        boolean containsOrange = vector.contains("Orange");
        System.out.println("Vector contains Orange: " + containsOrange); // Output: true
        
        // Size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size); // Output: 2
        
        // Clearing the Vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector); // Output: []
        
        // Checking if the Vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Is Vector empty: " + isEmpty); // Output: true
        
        
    }
}

//NOTE : Vector is similar to ArrayList,but with some differences.
//- Vector is also used as a dynamic array implementation of the List interface that allows automatic resizing of the array.
