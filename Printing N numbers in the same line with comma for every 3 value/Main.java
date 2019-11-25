import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 1;
    for(int i = 1;i <= n;i++ )
    {
      if(count != 3)
      System.out.print(i);
      else
      {
      System.out.print(i+",");
       count = 0;
      }
     count++;
    }
  }
}