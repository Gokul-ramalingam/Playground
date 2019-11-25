import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int armstrongNumber = 0;
      int n = num;
      int count = 0;
      while(n>0)
      {
        count += 1;
        n /= 10;
      }
      n = num;
      while(n > 0)
      {
        armstrongNumber += Math.pow((n%10),count);
        n /= 10;
      }
        if(num == armstrongNumber)
          System.out.println("Armstrong Number");
        else
          System.out.println("Not a Armstrong Number");
	}
}