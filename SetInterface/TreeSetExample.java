import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample
{
    public static void main(String[] args)
    {
        // Creating a TreeSet
        Set<String> ts = new TreeSet<>();
        
        // Adding elements
        ts.add("hyd");
        ts.add("blr");
        ts.add("syd");
        ts.add("hyd"); // Adding duplicate element
        ts.add("mysr");
        
        
        // Printing the TreeSet
        System.out.println("TreeSet: " + ts); // Output: TreeSet: [blr, hyd, mysr, syd]       // order is not guaranteed
 
        
        // Size of the TreeSet
        int size = ts.size();
        System.out.println("Size of the TreeSet: " + size); // Output: 4
        
        
        // Checking if an element exists
        boolean b = ts.contains("blr");
        System.out.println("TreeSet contains 'blr': " + b); // Output: true
        
        
        // Removing elements
        ts.remove("mysr");
        
        // Printing the TreeSet after removal
        System.out.println("TreeSet after removal: " + ts); // Output: TreeSet: [blr, hyd, syd] 
        
              
        // Adding null element : adding a null element will result in a NullPointerException because TreeSet does not allow null elements. 
      //  ts.add(null);
      //  System.out.println("TreeSet with null element: " + ts); //EXCEPTION
         
        // Checking if the TreeSet is empty
        boolean b1= ts.isEmpty();
        System.out.println("Is TreeSet empty: " + b1); // Output:false
        ts.clear();
        System.out.println("Is TreeSet empty: " + ts.isEmpty()); // Output:true
    }
}


//NOTE: TREESET
//- maintains the elements in sorted order
//- does not allow duplicate elements; adding duplicate elements has no effect.
