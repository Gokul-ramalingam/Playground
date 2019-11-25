import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int g = gcd(n1,n2);
      System.out.println(gcd(g,n3));
	}
   public static int gcd(int n1,int n2)
   {
     int l = 0;
     if(n1<n2)
       l = n1;
     else
       l = n2;
     int g = 1;
     for(int i = 1;i <= l;i++)
     {
       if(n1%i==0 && n2%i==0)
         g = i;
     }
     return g;   
   }
}