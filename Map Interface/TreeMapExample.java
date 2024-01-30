import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample
{
    public static void main(String[] args) 
    {
    	
        // Creating a TreeMap with Integer keys and String values
        Map<Integer, String> tm = new TreeMap<>();
        
        // Adding key-value pairs
        tm.put(2, "Nike");
        tm.put(4, "Adidas");
        tm.put(3, "Zara");
        tm.put(1, null); // Adding a null value
        
        // Printing the TreeMap
        System.out.println("TreeMap: " + tm); // Output: TreeMap: {1=null, 2=Nike, 3=Zara, 4=Adidas} //keys are sorted and stored asec order
        
        // Size of the TreeMap
        int size = tm.size();
        System.out.println("Size of the TreeMap: " + size); // Output: Size of the TreeMap: 4
        
        // Retrieving the value for a key
        String value = tm.get(2);
        System.out.println("Value for key '2': " + value); // Output: Value for key '2': Nike
        
        // Removing a key-value pair
        tm.remove(4);
        
        // Printing the TreeMap after removal
        System.out.println("TreeMap after removal: " + tm); // Output: TreeMap after removal: {1=null, 2=Nike, 3=Zara}
        
        // Checking if a key exists
        boolean containsKey = tm.containsKey(3);
        System.out.println("TreeMap contains key '3': " + containsKey); // Output: TreeMap contains key '3': true
        
        // Checking if a value exists
        boolean containsValue = tm.containsValue("Nike");
        System.out.println("TreeMap contains value 'Nike': " + containsValue); // Output: TreeMap contains value 'Nike': true
        
    }
}

//NOTES
// -TreeMap is a sorted map implementation of HashMap
// -It maintains the keys in sorted order, which means the keys will be sorted in their natural order or according to a custom comparator provided during TreeMap construction.
// -Does not allow null keys but allows null values.
