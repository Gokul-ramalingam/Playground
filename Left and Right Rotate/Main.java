import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ar[] = new int[n];
    for(int i = 0;i < n;i++)
      ar[i] = in.nextInt();
    int rot = in.nextInt();
    
    leftRot(n,ar,rot);
    rightRot(n,ar,rot);
    for(int i = 0;i < n;i++)
      System.out.print(ar[i]+" ");
  	}
    
  public static void leftRot(int n,int ar[],int rot)
    {
      int l = 0;
      if(n%2 == 0)
        l = n-1;
      else
        l = n-2;
      for(int i = 0;i < rot;i++)
      {
        int temp = ar[1];
        for(int j = 1;j < l;j+=2)
        {
          ar[j] = ar[j+2];
        }
        ar[l] = temp;
      }
    }
      public static void rightRot(int n,int ar[],int rot)
    {
      int l = 0;
      if(n%2 == 0)
        l = n-2;
      else
        l = n-1;
      for(int i = 0;i < rot;i++)
      {
        int temp = ar[l];
        for(int j = l;j > 0;j-=2)
        {
          ar[j] = ar[j-2];
        }
        ar[0] = temp;
      }
    }
}



