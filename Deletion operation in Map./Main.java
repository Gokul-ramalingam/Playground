import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     TreeMap<String , String> tm = new TreeMap<String ,String>();
     int g = Integer.parseInt(br.readLine());
     System.out.println("Enter the number of values to be inserted in map:"+g);
     for(int i=0;i<g;i++)
     {
       String idx = br.readLine();
       String val = br.readLine();
       tm.put(idx , val);
     }
      System.out.println(tm);
     String f = br.readLine();
     System.out.println("Enter the index to be removed:"+f); 
     tm.remove(f);
     System.out.println(tm);
     String idxx = br.readLine();
      System.out.println("Enter the index to insert:"+idxx);
      String vall = br.readLine();
     System.out.println("Enter the value to be inserted:"+vall); 
      tm.put(idxx,vall);
      System.out.println(tm);
    }
}