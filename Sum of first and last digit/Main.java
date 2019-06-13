import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int last_number = number % 10;
      while(number > 9)
      {
        number = number / 10;
      }
      System.out.println(number + last_number);
	}
}