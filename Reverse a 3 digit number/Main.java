import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    int firstDigit = number / 100;
    int secondDigit = (number % 100) / 10;
    int lastDigit = (number % 100) % 10;
    System.out.println((lastDigit * 100) + (secondDigit * 10) + (firstDigit * 1));
  }
}