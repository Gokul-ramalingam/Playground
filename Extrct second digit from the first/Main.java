import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    while(number >= 100)
    {
      number = number / 10;
    }
    System.out.println(number % 10);
  }
}