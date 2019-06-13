import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int l[] = new int[n];
    for(int i = 0 ; i < n ;i++)
    {
     l[i] = in.nextInt(); 
    }
    int x = in.nextInt();

     right(l , n ,x);
     left(l , n ,x);
   
    for(int i = 0;i < n;i++)
    {
      System.out.print(l[i] +" ");
    }
  	}
  public static void left( int l[],int n ,int x)
    {
       int f = 1;
       int la;
       if(n % 2 == 0)
       {
           la = n - 1;
       }
       else
       {
           la = n - 2;
       }
       for(int rot = 1; rot <= x; rot++)
       {
           int temp = l[f];
           for(int index = 3; index < n; index = index + 2)
           {
               l[index - 2] = l[index];
           }
           l[la] = temp;
       }
    }
    public static void right(int l[],int n ,int x)
    {
       int f = 0;
       int la;
       if(n % 2 == 1)
       {
          la = n - 1;
       }
       else
       {
          la = n - 2;
       }
       for(int rot = 1; rot <=x; rot++)
       {
           int temp = l[la];
           for(int index = (la - 2); index >= 0; index = index - 2)
            {
               l[index + 2] =l[index];
           }
           l[f] = temp;
       }
    }
}
