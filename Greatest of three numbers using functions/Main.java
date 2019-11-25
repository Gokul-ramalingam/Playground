import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int l = grt(n1,n2);
      if(n3 > l)
        System.out.print(n3);
      else
        System.out.print(l);
	}
  public static int grt(int n1,int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
  }
}