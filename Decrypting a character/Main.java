import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if(ch >= 'a' && ch <= 'z')
      {
        int off = ch - key ;
        if(off < 'a')
        {
          off = off + 26;          
        }
        ch = (char) (off);
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
        int off = ch - key ;
        if(off < 'A')
        {
          off = off + 26;          
        }
        ch = (char) (off);
      }
      System.out.print(ch);
    }
}