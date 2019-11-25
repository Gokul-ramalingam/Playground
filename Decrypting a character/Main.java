import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int k = in.nextInt();
      if(ch >= 'a' && ch <= 'z')
      {
        int offset = ch - k;
        if(offset >= 'a')
        {
          ch = (char) offset;
          System.out.print(ch);
        }
        else
        {
          ch = (char) (offset+26);
          System.out.print(ch);
        }
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        int offset = ch - k;
        if(offset >= 'A')
        {
          ch = (char) offset;
          System.out.println(ch);
        }
        else
        {
          ch = (char) (offset+26);
          System.out.println(ch);
        }
      }
    }
}