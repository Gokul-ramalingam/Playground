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
    {
      ar[i] = in.nextInt();
    }
    int count = 0;
    int sum = ar[0]+ar[1]+ar[2];
    boolean flag = false;
    int l = 0;
    for(int i = 3;i < n;i++)
    {
      count++;
      l += ar[i];
      if(count%3==0)
      {
        if(l == sum)
        {
        flag = true;
        l = 0;
        }
        else
        {
          flag = false;
          break;
        }
      }
    }
    if(flag == true)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}