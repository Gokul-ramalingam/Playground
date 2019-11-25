import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 2;i<=n;i++)
      {
        prime(i);
      }
	}
  public static void prime(int n)
  {
    boolean flag = true;
    for(int i=2;i <= n/2;i++)
    {
      if(n%i==0)
      {
        flag=false;
        break;
      }
    }
    if(flag == true)
      System.out.println(n);
  }
}