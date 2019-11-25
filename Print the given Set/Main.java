import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      String h = br.readLine();
      String brr[] = h.split(",");
      for(String g : brr )
      {
         lhs.add(g); 
      }
      System.out.print(lhs);
    }
}