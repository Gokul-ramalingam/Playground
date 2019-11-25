import java.io.*;
import java.lang.*;
import java.util.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> ts = new TreeSet<String>();
      String entry = br.readLine();
      String g[] = entry.split(",");
      int count = 0;
      for(String str : g)
      {
        ts.add(str);
      }
      int siz = ts.size();
      for(int i = 0; i < siz ;i++)
      { 
        System.out.println(ts);
        ts.remove(ts.last());
      }
      System.out.println(ts);
      }
}