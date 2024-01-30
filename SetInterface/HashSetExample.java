import java.util.HashSet;
import java.util.Set;

public class HashSetExample
{
    public static void main(String[] args)
    {
        // Creating a HashSet
        Set<String> hs = new HashSet<>();
        
        // Adding elements
        hs.add("hyd");
        hs.add("blr");
        hs.add("syd");
        hs.add("hyd"); // Adding duplicate element
        hs.add("mysr");
        
        
        // Printing the HashSet
        System.out.println("HashSet: " + hs); // Output: HashSet: [hyd,blr,syd,mysr]       // order is not guaranteed
        								      // Output: HashSet: [hyd,mysr,syd,blr] 
        
        // Size of the HashSet
        int size = hs.size();
        System.out.println("Size of the HashSet: " + size); // Output: 4
        
        
        // Checking if an element exists
        boolean b = hs.contains("blr");
        System.out.println("HashSet contains 'blr': " + b); // Output: true
        
        
        // Removing elements
        hs.remove("mysr");
        
        // Printing the HashSet after removal
        System.out.println("HashSet after removal: " + hs); // Output: HashSet: [hyd,blr,syd]
        
              
        // Adding null element
        hs.add(null);
        
        // Printing the HashSet with null element
        System.out.println("HashSet with null element: " + hs); // Output: HashSet [null, hyd, blr, syd]
        
        // Checking if the HashSet is empty
        boolean b1= hs.isEmpty();
        System.out.println("Is HashSet empty: " + b1); // Output:false
        hs.clear();
        System.out.println("Is HashSet empty: " + hs.isEmpty()); // Output:true
    }
}


//NOTE: HASHSET
//- It uses a hash table to store unique elements,
//- does not allow duplicate elements; adding duplicate elements has no effect.
//-does not guarantee the order of elements.