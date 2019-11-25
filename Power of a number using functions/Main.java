import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exp = in.nextInt();
    System.out.print(pow(base,exp));
  }
  public static int pow(int base,int exp)
  {
    int t=1;
    for(int i = 0;i < exp;i++)
    {
      t *= base;
    }
    return t;
  }
}