import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
     TreeMap<String , Integer> tm = new TreeMap<String ,Integer>();
     int g = Integer.parseInt(br.readLine());
     System.out.println("Enter the number of values to be inserted in map:"+g);
     for(int i=0;i<g;i++)
     {
       String idx = br.readLine();
       Integer val = Integer.parseInt(br.readLine());
       tm.put(idx , val);
     }
      System.out.println(tm);
     String f = br.readLine();
     System.out.println("Enter the index to be removed:"+f); 
     tm.remove(f);
     System.out.println(tm);
     System.out.println("Size of map is : "+tm.size());
    }
}