import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int s = sum(n);
      System.out.println(s);
	}
  public static int sum(int a)
    {
    int i=1,sum=0;
    while(i<=a)
    {
      sum = sum + i ;
      i++;
    }
    return sum;
    }
}