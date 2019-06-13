import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner (System.in);
       int n = in.nextInt();
      int i = 2;
      while(i <= n)
      {
        int a = prime(i);
        i++;
        if( a != 0)
        {
        System.out.println(a);
        }
      }   
    }

  public static int prime(int c)
  {
    int flag = 0;
  for(int i = 2 ; i <= c/2 ; i++)
  {
    if(c % i == 0)
    {
      flag = 1;
    }
  }
 if(flag == 1)
   return 0;
  else
  return c;
}
}
