import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int base = in.nextInt();
      int expo = in.nextInt();
      int b = power(base , expo);
      System.out.println(b);
	}
  public static int power(int c , int d)
  {
    int i = 1;
    int ex = c;
	while(i < d)
    {
      c = c * ex;
      i++;
    }
    return c;
  }
}