import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    for(int i = 1;i <= number;i++)
    {
      if(i % 3 == 0)
       System.out.print(i+",");
      else
        System.out.print(i);
    }
  }
}