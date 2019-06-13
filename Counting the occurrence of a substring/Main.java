import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
     String a = in.nextLine();
     String b = in.nextLine();
    int k = 1;
    StringBuilder sb = new StringBuilder(a);
    StringBuilder sbb = new StringBuilder(b);
     int l =a.length();
     int l1=b.length();
    for(int i = 0; i < (l-l1) ; i++)
    {
      boolean m = true;
    for(int j = 0 ;j < l1;j++)
    {
      if(sb.charAt(i + j) != sbb.charAt(j))  
      {
       m = false; 
      }
    }
      if(m == true)
      {
        k = k+1;
      }
    }
    System.out.print(k);
  } 
}