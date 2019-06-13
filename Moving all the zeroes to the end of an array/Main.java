
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l[] = new int[n];
      for(int i = 0; i < n ; i++)
      {
        l[i] = in.nextInt();
      }
      func(l , n);
    }
  public static void func(int l[] , int n)
  {
    for(int i = 0 ; i < n ;i++)
    {
      if(l[i]>0)
      System.out.print(l[i] +" ");
    
    }
    for(int i = 0 ; i < n ;i++)
    {
      if(l[i]==0)
      System.out.print(l[i] +" ");
    
    }
  }
}