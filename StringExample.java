public class StringExample 
{
    public static void main(String[] args) 
    {
    	
        // Example 1: Creating Strings
        String str1 = "Hello";
        String str2 = new String("world");

        
        // Example 2: Concatenating Strings
        String result = str1 + " " + str2;
        System.out.println("Concatenated string: " + result);   //Hello world

        
        // Example 3: Length of a String
        int length = str1.length();
        System.out.println("Length of str1: " + length);  //5

        
        // Example 4: Accessing Characters in a String
        char firstChar = str2.charAt(0);
        System.out.println("First character of str2: " + firstChar);  //w

        
        // Example 5: Substring       
        String str= "BaratSagarB";
             //index 012345678910
        
        //substring TYPE1 :substring(int beginIndex)
        //print starting from beginIndex included till end of string
        String substr1 = str.substring(5);               //SagarB
        System.out.println("Substring of result: " + substr1);
        
        //substring TYPE2 :substring(int beginIndex, int endIndex)
        //print starting from beginIndex included till endIndex specified BUT EXCLUDE PRINTING END index 
        String substr2 = str.substring(1, 7);               //aratSa
        System.out.println("Substring of result: " + substr2);

        
       
        // Example 6: String Comparison = .equals()    //NOTE:preferably use .equals() instead of == in case of string comparisions
        //NOTE: USE .equalsIgnoreCase()  when u want to compare only characters ignoring case differences
        String str3 = "hello";
        String str4="Hello";
        String str5="hello";
        System.out.println("Comparison ans " + str3.equals(str4)); //false
        System.out.println("Comparison ans " + str3.equals(str5)); //true
        System.out.println(str3.equalsIgnoreCase(str4));  //true    //NOTE: you can store result of .equals() in boolean variable and use it in if-else conditions or simply print it out.       

        
        // Example 7: String Case Conversion
        String a = "cUtu";
        String b = a.toLowerCase();
        String c = a.toUpperCase();
        System.out.println("Lowercase str1: " + b);  //cutu
        System.out.println("Uppercase str2: " + c); //CUTU

        
        // Example 8: Finding Substring
        String d="rachanareddy";
        boolean e= d.contains("reddy");
        System.out.println("Does result contain 'world'?: " + e); //true
    }
}
