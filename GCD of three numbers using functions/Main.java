import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
       Scanner in = new Scanner(System.in);
     int o = in.nextInt();
     int t = in.nextInt(); 
     int h = in.nextInt();
     int a = great(o , t , h);
      System.out.println(a);
	}
  public static int great(int a , int b , int c){
    int small = 0;
    int smal = 0;
    int temp = 0;
    if(a < b)
    {
      small = a;
    }
    else
    {
      small= b;
    }
    if(small < c)
    {
      small = small;
    }
    else
    {
      small= c;
    }
  if(small >= 1)
   {
     if(a % small == 0 && b % small == 0 && c % small == 0)
     {
       temp = small; 
     }
     small--;
   }
    return temp;
}
}