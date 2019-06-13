import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
     Scanner in = new Scanner(System.in);
     String a = in.nextLine();
     StringBuilder sb = new StringBuilder(a);
     int l =a.length();
     reverse_string(sb ,0 , l );
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
       StringBuilder s = new StringBuilder("");
        for(int i = end_idx-1 ; i>=0;i--)
        {
         if(sb.charAt(i) != ' ')
         {
          s.append(sb.charAt(i)); 
         }
        else if(sb.charAt(i) == ' ')
         {
          System.out.print(s.reverse() +" ");
          s.setLength(0);
         }
          
        }
     System.out.print("I");
    }
}



