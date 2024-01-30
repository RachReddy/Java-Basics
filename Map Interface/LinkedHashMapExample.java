import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample
{
    public static void main(String[] args)
    {
    	
        // Creating a LinkedHashMap with Integer keys and String values
        Map<Integer, String> hm = new LinkedHashMap<>();
        
        // Adding key-value pairs
        hm.put(1, "Nike");
        hm.put(2, "Adidas");
        hm.put(3, "Zara");
        hm.put(4, null); // Adding a null value
        
        
        // Printing the LinkedHashMap
        System.out.println("LinkedHashMap: " + hm); // Output: LinkedHashMap: {1=Nike, 2=Adidas, 3=Zara, 4=null}
        
        // Size of the LinkedHashMap
        int size = hm.size();
        System.out.println("Size of the LinkedHashMap: " + size); // Output: Size of the LinkedHashMap: 4
        
        // Retrieving the value for a key
        String value = hm.get(1);
        System.out.println("Value for key '1': " + value); // Output: Value for key '1': Nike
        
        // Removing a key-value pair
        hm.remove(2);
        
        // Printing the LinkedHashMap after removal
        System.out.println("LinkedHashMap after removal: " + hm); // Output: LinkedHashMap after removal: {1=Nike, 3=Zara, 4=null}
        
        // Checking if a key exists
        boolean containsKey = hm.containsKey(5);
        System.out.println("LinkedHashMap contains key '3': " + containsKey); // Output: LinkedHashMap contains key '3': false
        
        // Checking if a value exists
        boolean containsValue = hm.containsValue("Nike");
        System.out.println("LinkedHashMap contains value 'Nike': " + containsValue); // Output: LinkedHashMap contains value 'Nike': true
        
        // Equals method
        Map<Integer, String> map1 = new LinkedHashMap<>();
        Map<Integer, String> map2 = new LinkedHashMap<>();
        Map<Integer, String> map3 = new LinkedHashMap<>();
        
        // Adding key-value pairs to the first map
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        
        // Adding key-value pairs to the second map
        map2.put(1, "Apple");
        map2.put(2, "Orange");
        
        // Adding key-value pairs to the third map
        map3.put(1, "Apple");
        map3.put(2, "Banana");
        
        // Checking if map1 and map2 have the same keys and values
        boolean equalMaps1And2 = map1.equals(map2);  
        System.out.println("Map 1 and Map 2 have the same keys and values: " + equalMaps1And2);  // Output: Map 1 and Map 2 have the same keys and values: false
        
        // Checking if map1 and map3 have the same keys and values
        boolean equalMaps1And3 = map1.equals(map3);  
        System.out.println("Map 1 and Map 3 have the same keys and values: " + equalMaps1And3); // Output: Map 1 and Map 3 have the same keys and values: true
        
        // Checking if map1 and map2 have the same keys
        boolean sameKeys = map1.keySet().equals(map2.keySet());
        System.out.println("Map 1 and Map 2 have the same keys: " + sameKeys); // Output: Map 1 and Map 2 have the same keys: true
    } 
}
