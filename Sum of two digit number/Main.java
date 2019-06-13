import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int firstNumber = number/10;
      int lastNumber = number%10;
      System.out.println(firstNumber + lastNumber);
                         
	}
}