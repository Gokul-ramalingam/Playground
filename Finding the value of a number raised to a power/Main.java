import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int expo = exponent - 1;
      int power = base;
      while(expo > 0)
      {
      base = base * power; 
        expo--;
      }
      System.out.println(base);
    }
}