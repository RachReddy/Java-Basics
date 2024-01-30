import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample
{
    public static void main(String[] args)
    {
        // Creating a HashSet
        Set<String> lhs = new LinkedHashSet<>();
        
        // Adding elements
        lhs.add("hyd");
        lhs.add("blr");
        lhs.add("syd");
        lhs.add("hyd"); // Adding duplicate element
        lhs.add("mysr");
        
        
        // Printing the HashSet
        System.out.println("linkedHashSet: " + lhs); // Output: LinkedHashSet: [hyd,blr,syd,mysr]       //stored order is in insertion order
                                              
        
        // Size of the HashSet
        int size = lhs.size();
        System.out.println("Size of the linkedHashSet: " + size); // Output: 4
        
        
        // Checking if an element exists
        boolean b = lhs.contains("blr");
        System.out.println("linkedHashSet contains 'blr': " + b); // Output: true
        
        
        // Removing elements
        lhs.remove("mysr");
        
        // Printing the HashSet after removal
        System.out.println("linkedHashSet after removal: " + lhs); // Output: LinkedHashSet: [hyd,blr,syd]
        
              
        // Adding null element
        lhs.add(null);
        
        // Printing the LinkedHashSet with null element				    // NOTE:
        System.out.println("linkedHashSet with null element: " + lhs); // Output: HashSet [hyd, blr, syd, null]
        
        // Checking if the LinkedHashSet is empty
        boolean b1= lhs.isEmpty();
        System.out.println("Is linkedHashSet empty: " + b1); // Output:false
        lhs.clear();
        System.out.println("Is linkedHashSet empty: " + lhs.isEmpty()); // Output:true
    }
}


//NOTE: LINKEDHASHSET
//- It maintains the insertion order of elements, which means when elements are added to the set, they are stored in the order in which they were inserted.
//-does not guarantee the order of elements.