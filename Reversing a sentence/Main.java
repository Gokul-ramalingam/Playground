import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int f = 0;
      int l = str.length()-1;
      reverse_string(sb,f,l);
      for(int i = 0;i < sb.length();i++)
      {
        if(sb.charAt(i)==' ')
        {
          reverse_string(sb,f,i-1);
          f= i+1;
        }
      }
     System.out.println(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      while(start_idx<end_idx)
      {
        char t = sb.charAt(start_idx);
        sb.setCharAt(start_idx,sb.charAt(end_idx));
        sb.setCharAt(end_idx,t);
        start_idx++;
        end_idx--;
      }
      
    }
}