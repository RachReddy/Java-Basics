import java.util.PriorityQueue;
import java.util.Queue;


//FIFO : FIRST IN FIRST OUT
public class QueueExample2
{
    public static void main(String[] args)
    {
    	 Queue<String> pq = new PriorityQueue<>();
    	 
    	 pq.add("hey");
         pq.add("how");
         pq.add("are");
         pq.add("you");
         
         System.out.println("Initial Queue " + pq); //[are, hey, how, you]
  
         pq.remove("how");
  
         System.out.println("After Remove " + pq); // [are, hey, you]
  
         System.out.println("Poll Method " + pq.poll()); // [are]
  
         System.out.println("Final Queue " + pq);  // [hey, you]
         
         System.out.println("Poll Method " + pq.peek()); // [hey]
         
         System.out.println("Final Queue " + pq);  // [hey, you]
         
        // Checking if the q is empty 
         boolean isEmpty = pq.isEmpty(); 
         System.out.println("Is the q empty? " + isEmpty);  //false

         // Getting the size of the q 
         int size = pq.size();
        System.out.println("Size of the q: " + size);  //2
    }
}


//to iterate over PQ
/*
       Iterator i = pq.iterator();
         while (i.hasNext()) {
         System.out.print(i.next() + " ");
        }
 */
