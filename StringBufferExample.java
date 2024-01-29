public class StringBufferExample
{
    public static void main(String[] args)
    {
        // Example 1: Creating a StringBuffer
        StringBuffer sb = new StringBuffer();   
        //USE .toString() to print or return values in the string buffer
        
        // Example 2: Appending strings
        sb.append("hi");
        sb.append(" ");
        sb.append("bharat");
        sb.append("baby");
        System.out.println(sb.toString());  //hi bharatbaby
        
        // Example 3: Inserting strings
        sb.insert(9, ", ");
        System.out.println(sb.toString()); //hi bharat, baby
        
        // Example 4: Reversing the buffer
        StringBuffer sb1 = new StringBuffer();  //you can create as many as buffer objects as u want
        sb1.append("hello");
        sb1.reverse();
        System.out.println(sb1.toString()); //olleh
        
        //sb.reverse();  => output: ybab ,tarahb ih
        
        
        // Example 5: Deleting characters
        sb.delete(3, 5);
        //hi bharat, baby
        //01234567891011  --index
        System.out.println(sb.toString()); //hi rat, baby
        
        
        //sb = hi rat, baby
        // Example 6: Replacing characters
        //replace(int start, int end, String str) => Replaces the characters from start index to end-1 index with the characters in the specified character sequence seq.
        sb.replace(8, 12, "Barla");
        System.out.println("Buffer after replacing: " + sb.toString()); //hi rat, Barlay
        
        // Example 7: Capacity and Length
        System.out.println("Capacity of buffer: " + sb.capacity()); //16
        System.out.println("Length of buffer: " + sb.length());
    }
}
