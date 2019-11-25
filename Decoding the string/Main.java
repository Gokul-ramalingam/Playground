import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    int l = a.length();
    int key = in.nextInt();
    StringBuilder sb  = new StringBuilder("");
    for(int i = 0; i < l;i++)
    {
      char ch = a.charAt(i);
      if(ch != ' ')
      {
      if(ch >= 'a' && ch <= 'z')
      {
       char off = (char) (ch - key);
        if(off < 'a')
        {
          char chr = (char) (off + 26);
          sb.append(chr);
        }
        else
        {
          sb.append(off);
        }
      }
      else if(ch >= 'A' && ch <= 'Z')
      {
       char off = (char) (ch - key);
        if(off < 'A')
        {
          char chr = (char) (off + 26);
          sb.append(chr);
        }
        else
        {
          sb.append(off);
        }     
      }
      }
      else
      {
        sb.append(' ');
      }
    }
    System.out.print(sb);
  }
}


