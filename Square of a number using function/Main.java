import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sq = square(n);
      System.out.println(sq);
      
	} 
public static int square(int a)
    {
  int r = a * a;
  return r;
    }
}