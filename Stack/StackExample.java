import java.util.Stack;


//LIFO : LAST IN FIRST OUT
public class StackExample
{
    public static void main(String[] args)
    {
        // Creating a s
        Stack<Integer> s = new Stack<>();

        // Pushing elements onto the s :INSERT
        s.push(10);   // [10]
        s.push(20);   // [10, 20]
        s.push(30);
        System.out.println("Stack after pushing 30: " + s); // [10, 20, 30]

        
        // Popping an element from the s :DELETE
        int poppedElement = s.pop();
        System.out.println("Popped element: " + poppedElement); // 30
        System.out.println("Stack after popping: " + s); // [10, 20]

        
        // Peeking at the top element of the s :VIEW   //NOTE: peek() retrieves element value but does not delete it from stack
        int topElement = s.peek();
        System.out.println("Top element: " + topElement); // 20
        System.out.println("Stack after peeking: " + s); // [10, 20]

        
        // Checking if the s is empty
        boolean isEmpty = s.isEmpty();
        System.out.println("Is the s empty? " + isEmpty); // false

        // Getting the size of the s
        int size = s.size();
        System.out.println("Size of the s: " + size); // 2

        boolean b= s.contains(10);
        System.out.println(b) //true
            
        s.clear();
        boolean isEmpty2 = s.isEmpty();
        System.out.println("Is the s empty? " + isEmpty2); // true
        
    }
}
