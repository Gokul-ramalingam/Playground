import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] = new int[n];
      for(int i =0;i < n;i++)
        ar[i] = in.nextInt();
      int e1 = in.nextInt();
      int e2 = in.nextInt();
      System.out.println(find(e1,ar,n));
      System.out.println(find(e2,ar,n));
    }
  public static int find(int s,int ar[],int n)
  {
    for(int i = 0;i < n;i++)
    {
      if(ar[i] == s)
        return i;
    }
    return -1;
  }
}