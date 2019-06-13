import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int l[] = new int[n];
      int temp[] = new int[n];
      int a = 100;
      for(int i = 0 ;i < n ; i++)
      {
       l[i] = in.nextInt(); 
      }
    
      for(int i = 1 ;i <= k ;i++)
      {
       int count = 0;
        for(int j = 0 ;j < n ;j++)
        {
          if(i == l[j])
          {
            count = count + 1;
          }
        }
       System.out.print(i +" " +count);
       System.out.println();
     }
    }
}