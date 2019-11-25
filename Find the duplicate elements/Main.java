import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> ts = new TreeSet<String>();
      String z = br.readLine();
      String y[] = z.split(",");
      System.out.println("Duplicate Entry is:");
      for(String x : y)
      {
        if(ts.contains(x))
        {
          System.out.println(x);
        }
        else
        {
          ts.add(x);
        }
      }
      System.out.println("TreeSet is : "+ts);
    }
}