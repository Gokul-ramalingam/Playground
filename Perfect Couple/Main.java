import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int l[] = new int[n];
      for(int i = 0;i < n ;i++)
      {
        l[i] = in.nextInt();
      }
      int v = in.nextInt();
       func(l ,n,v);
    }
   public static void func(int l[] , int n ,int v)
  {
    int temp = 0;
    for(int i = 0 ;i < n ;i++)
    {   
      for(int j = i ;j < n ;j++)
      { 
      temp = l[i] + l[j];
      if(v == temp)
      {
      System.out.print(l[i] +"," +" " +l[j] );
      System.out.println();
      }
      }
    
    }
   }
}
