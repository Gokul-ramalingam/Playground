import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.print(sumOfNumbers(n));
	}
    public static int sumOfNumbers(int n)
    {
      int sum = 0;
      for(int i = 1;i <= n;i++)
        sum += i;
      return sum;
    }
}