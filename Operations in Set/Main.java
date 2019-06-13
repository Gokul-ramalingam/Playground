import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      String entry = br.readLine();
      String en[] = entry.split(",");
      for(String d : en)
      {
        lhs.add(d);
      }
      System.out.println(lhs);
       String del = br.readLine();
      System.out.println("Enter the value to be deleted: "+del);
      lhs.remove(del);
      System.out.println(lhs);
      String ins = br.readLine();
      System.out.println("Enter the value to be added: "+ins);
      lhs.add(ins);
      System.out.println(lhs);
    }
}