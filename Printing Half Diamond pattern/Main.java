import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      for(int i = 1; i <= n; i++)
      {
        for(int j = 0 ; j < n-i;j++)
        {
          System.out.print(" ");
        }
        for(int k = 0; k < num;k++)
        {
          System.out.print("*");
        }
        System.out.println("");
        num = num + 2;
      }
	}
}