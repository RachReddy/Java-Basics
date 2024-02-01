import java.util.LinkedList;
import java.util.Queue;


//FIFO : FIRST IN FIRST OUT
public class QueueExample1
{
    public static void main(String[] args)
    {
        // Creating a q
        Queue<Integer> q = new LinkedList<>();

        // Adding elements to the q
        q.add(10);   // [10]
        q.add(20);  // [10, 20]
        q.add(30);                                        // front
        System.out.println("Queue after adding 30: " + q); // [10, 20, 30]
        //																rear 															

        // Removing an element from the q
        int removedElement = q.remove();
        System.out.println("Removed element: " + removedElement); // 10
        System.out.println("Queue after removing: " + q); // [20, 30]

        
        // Retrieving the front element of the q
        int frontElement = q.peek();
        System.out.println("Front element: " + frontElement); // 20
        System.out.println("Queue after peeking: " + q); // [20, 30]

        // Polling an element from the q
        int polledElement = q.poll();
        System.out.println("Polled element: " + polledElement); // 20
        System.out.println("Queue after polling: " + q); // [30]

        // Checking if the q is empty 
         boolean isEmpty = q.isEmpty(); 
         System.out.println("Is the q empty? " + isEmpty);  //false

         // Getting the size of the q 
         int size = q.size();
        System.out.println("Size of the q: " + size);
    }
}
