import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      int comparision = number;
      int digit = 0;
      int strongNumber = 0;
      while(number > 0)
      {
        digit = number % 10;
        int fact = 1;
        for(int i = 1;i <= digit;i++)
        {
          fact = fact * i;
        }
        strongNumber = strongNumber + fact;
        number = number / 10;
      }
      if(strongNumber == comparision)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}