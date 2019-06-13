import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int number1 = in.nextInt();
      int number2 = in.nextInt();
      int number3 = in.nextInt();
      int result = 0;
      if(number1 > number2)
      {
        if(number1 > number3)
        {
         result = number1;
        }
        else
        {
            result = number3;
        }
      }
      else
      {
        if(number2 > number3)
        result = number2;
        else
        result = number3;
      }
      System.out.println(result);
    }
}