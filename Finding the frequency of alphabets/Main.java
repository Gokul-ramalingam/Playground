import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
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
        if(sb.charAt(i)>='A' && sb.charAt(i)<= 'Z')
        {
        int off = sb.charAt(i)- 'A';
        char cc = (char) ('a' + off);
        sb.setCharAt(i ,cc);
        }
       if(sb.charAt(i) >='a' && sb.charAt(i) <= 'z')
        {
        ar[sb.charAt(i) - 'a']++;
        }
      }

   for(int i = 0;i <l ;i++)
      {
        
        if(ar[sb.charAt(i) - 'a'] != 0)
        {  
         System.out.print(sb.charAt(i)+""+ar[ sb.charAt(i) - 'a' ]+" ");  
         ar[sb.charAt(i) - 'a'] = 0;
        }
   }    
    }
}

