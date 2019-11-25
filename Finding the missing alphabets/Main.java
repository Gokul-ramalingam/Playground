import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String n = in.nextLine();
      StringBuilder sb = new StringBuilder(n);
      int l = sb.length();
      int ar[] = new int[26];
      for(int i = 0;i <26 ;i++)
      {
        ar[i] = 0;
      }
      for(int i = 0 ;i < l ;i++)
      {
        char ch = sb.charAt(i);
        if(ch >='a' && ch <= 'z')
        {
        int off = ch - 'a';
        ar[off]++;
        }
        else if(ch >='A' && ch <= 'Z')
        {
        int off = ch - 'A';
        ar[off]++;
        }
      }
       for(int i = 0;i <26 ;i++)
      {
        if(ar[i] == 0)
        {
          char c = (char) ('a' + i);
          System.out.print(c +" ");
        }
      }
    }
}