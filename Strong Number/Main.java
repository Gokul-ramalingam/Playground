import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int n = num;
      int count = 0;
      while(n > 0)
      {
        int rem = 1;
        for(int i = 1;i <= n%10;i++)
        {
          rem *= i;
        }
        count += rem;
        n /= 10;
      }
      if(count == num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}