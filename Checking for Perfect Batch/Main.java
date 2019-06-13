import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int li[] = new int[n];
    for(int i = 0;i < n;i++)
    {
     li[i] = in.nextInt();
    }
    int b = n/3;
    int num = 0;
    int v = 0;
    for(int i = 0 ; i < b;i++)
    {
     int m = func(li , n , num); 
     num = num + 3;
     if(i == 0)
     {
       v = v+m;
     }
     else 
     {
      if(v != m ) 
      {
          System.out.println("Not a Perfect Batch");
          break;
      }
      else if(v == m && i == b-1)
      {
        System.out.print("Perfect Batch");
      }
      }
    
    } 
    
  }
  public static int func(int li[] , int n ,int num)
  {
    int a = 0;
    for(int i = num ; i< num+3;i++)
    {
      a = a+li[i];
    }
    return a;
  }
}