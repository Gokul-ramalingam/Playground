import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    String b = in.nextLine();
    int l = a.length();
    int h = b.length();
    StringBuilder sb = new StringBuilder(a);
    for(int i = 0 ;i < h;i++)
    {
      for(int j = 0;j < l;j++)
      {
        if(b.charAt(i) == a.charAt(j))
        {
         sb.setCharAt(j , '$'); 
        }
      }
    }
    for(int x = 0 ;x < l; x++)
    {
      if(sb.charAt(x) != '$')
      {
        System.out.print(sb.charAt(x));
      }
    }
  }
}