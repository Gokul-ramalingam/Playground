import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count = 1;
      for(int i = 1;i <= n;i++)
      {
        for(int k = 1;k < n-i+1;k++)
        {
          System.out.print(" ");
        }
        for(int d = 1;d <= i;d++)
        {
          System.out.print(count+" ");
          count++;
        }
        System.out.println();
      }
    }    
}