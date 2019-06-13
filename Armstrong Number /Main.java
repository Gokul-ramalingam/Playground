import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int number1 = in.nextInt();
      int number = number1;
      int finalNumber = number1;
      int power = 0;
      int lastDigit = 0,sum = 0;
      while(number > 0)
      {
        number = number / 10;
        power = power + 1;
      }
      while(number1 > 0)
      {
        lastDigit = number1 % 10;
        int count = 0;
        int calc = 1;
        while(count < power)
        {
          calc = calc * lastDigit;
          count++;
        }
        sum = sum + calc;
        number1 = number1 / 10;
      }
      if(sum == finalNumber)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}