import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int x = func(n);
      System.out.print(x);
    }
  public static int func(int n)
  {
    if(n == 1)
    {
      return 1;
    }
    return n + func(n-1);
  }
}