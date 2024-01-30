import java.util.ArrayList;
import java.util.List;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        // Creating an ArrayList
        List<String> al = new ArrayList<>();  //prefer this
        //Or ArrayList<String> al= new ArrayList<>();
        
        // Adding elements
        al.add("bharath");
        al.add("kittu");
        al.add("abhinav");
        al.add("sunny");
        
        
        // Printing the ArrayList                index=>       0       1       3      3
        System.out.println("ArrayList: " + al); // Output: [bharath, kittu, abhinav, sunny]
        
        
        // Accessing elements
        String secondelem = al.get(1);
        System.out.println("First element: " + secondelem); // Output: kittu
        
        
        // Removing elements
        al.remove("kittu");
        
        // Printing the ArrayList after removal
        System.out.println("ArrayList after removal: " +al); // Output: [bharath, abhinav, sunny]
        
        
        // Checking if an element exists
        boolean val = al.contains("sunny");
        System.out.println("ArrayList contains Orange: " + val); // Output: true
        
        
        // Size of the ArrayList
        int sizeval = al.size();
        System.out.println("Size of the ArrayList: " + sizeval); // Output: 3
              
        
        // Clearing the ArrayList
        al.clear();     
        System.out.println("ArrayList after clearing: " + al); // Output: []
        System.out.println("Size of the ArrayList: " + al.size() ); // Output: 0
        
        
        // Checking if the ArrayList is empty
        boolean b = al.isEmpty();
        System.out.println("Is ArrayList empty: " + b); // Output: true
        
        
        //indexOf() => return the index of first occcurance of the specified elem in arraylist, if not present return -1
        List<String> al2 = new ArrayList<>();
        al2.add("Apple");
        al2.add("Banana");
        al2.add("Apple");
        al2.add("Orange");
        al2.add("Apple");

        int index = al2.indexOf("Apple");
        System.out.println("Index of 'Apple': " + index); // Output: 0  //1st occurance of apple is at index 0
        
        
        //lastIndexOf => return the index of last occcurance of the specified elem in arraylist, if not present return -1
        int indx = al2.lastIndexOf("Apple");
        System.out.println("Last index of 'Apple': " + indx); // Output: 4
        int indx2 = al2.lastIndexOf("strawberry");
        System.out.println("Last index of 'Apple': " + indx2); // Output: -1
        
        
        
        //removeAll(Collection c) => removes all occurences of the elements from the ArrayList
        //NOTE: you cant pass ele value as parameter eg: al2.removeAll("Apple") =>syntax error
        //it expects a collection (such as another ArrayList) as an argument, not a single element.
        List<String> li=new ArrayList<>();
        li.add("Apple");
        al2.removeAll(li);
        System.out.println("after removing list: "+ al2); //OUTPUT= [Banana, Orange]
        
   
    }
}

