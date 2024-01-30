import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args)
    {
    	
    	// Creating a HashMap with Integer keys and String values
        Map<Integer, String> hm = new HashMap<>();
        
        // Adding key-value pairs
        hm.put(1, "Nike");
        hm.put(2, "Adidas");
        hm.put(3, "Zara");
        hm.put(4, null); // Adding a null value
        
        // Printing the HashMap
        System.out.println("HashMap: " + hm); // Output: HashMap: {1=Nike, 3=Zara, 2=Adidas, 4=null}
        
        
        // Size of the HashMap
        int size = hm.size();
        System.out.println("Size of the HashMap: " + size); // Output: Size of the HashMap: 4
        
        
        // Retrieving the value for a key
        String value = hm.get(1);
        System.out.println("Value for key '1': " + value); // Output: Value for key '1': Nike
        
        
        // Removing a key-value pair
        hm.remove(2);
        
        // Printing the HashMap after removal
        System.out.println("HashMap after removal: " + hm); // Output: HashMap after removal: {1=Nike, 3=Zara, 4=null}
        
        
        // Checking if a key exists
        boolean bk = hm.containsKey(3);
        System.out.println("HashMap contains key '3': " + bk); // Output: HashMap contains key '3': true
        
        // Checking if a value exists
        boolean bv = hm.containsValue("Nike");
        System.out.println("HashMap contains value : " + bv); // Output:  true
        
        
        
        //equals() :checks if 2 hashmaps have same keys and same value
     
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        Map<Integer, String> map3 = new HashMap<>();
        
        // Adding key-value pairs to the first map
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        
        // Adding key-value pairs to the second map
        map2.put(1, "Apple");
        map2.put(2, "Orange");
        
       // Adding key-value pairs to the third map
        map3.put(1, "Apple");
        map3.put(2, "Banana");
        
        boolean m = map1.equals(map3);  
        System.out.println("Map 1 and Map 3 have the same keys: " + m); //true
        
        //find if 2 hashmap have same keys, ignore whatever value it has
        boolean sameKeys = map1.keySet().equals(map2.keySet());
        System.out.println("Map 1 and Map 2 have the same keys: " + sameKeys); //true
   

    } 
}

//NOTE: 
/*
   
 */
