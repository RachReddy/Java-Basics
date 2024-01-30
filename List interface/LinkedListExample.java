import java.util.LinkedList;
import java.util.List;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        // Creating a LinkedList
        List<String> li = new LinkedList<>();
        
        // Adding elements
        li.add("bharath");
        li.add("kittu");
        li.add("abhinav");
        li.add("ram");
        
        
        // Printing the ArrayList                index=>       0       1       3      3
        System.out.println("ArrayList: " + li); // Output: [bharath, kittu, abhinav, ram]
        
        
        // Accessing elements
        String secondelem = li.get(2);
        System.out.println("First element: " + secondelem); // Output: abhinav
        
        
        // Removing elements
        li.remove("ram");
        
        // Printing the ArrayList after removal
        System.out.println("ArrayList after removal: " +li); // Output: [bharath, kittu, abhinav]
        
        
        // Checking if an element exists
        boolean val = li.contains("ram");
        System.out.println("ArrayList contains Orange: " + val); // Output: false
        
        //peek()
        String s= ((LinkedList<String>) li).peek();   //li.peek() syntax error: typecast required
        System.out.println("head or 1st elem of list is:" + s);  //bharath
        		
        		
        // Size of the ArrayList
        int sizeval = li.size();
        System.out.println("Size of the ArrayList: " + sizeval); // Output: 3
              
        
        // Clearing the ArrayList
        li.clear();     
        System.out.println("ArrayList after clearing: " + li); // Output: []
        System.out.println("Size of the ArrayList: " + li.size() ); // Output: 0
        
        
        // Checking if the ArrayList is empty
        boolean b = li.isEmpty();
        System.out.println("Is ArrayList empty: " + b); // Output: true
        
        
        
        //NOTE: List of some unique methods in linkedlist:
        //peek() --This method retrieves but does not remove, the head (first element) of this list.
        //addFirst(E e)
        //addLast(E e)
        //getFirst()
        //getLast()
        //so on....
    }
}
