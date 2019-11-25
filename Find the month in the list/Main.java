import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String ag = br.readLine();
      String search = br.readLine();
      String arr[] = ag.split(",");
      LinkedList<String> al = new LinkedList<>();
      for(String b : arr)
      {
        al.add(b);
      }
      System.out.println(al);
      System.out.println("Size of the linked list: "+al.size());
      System.out.println("Is LinkedList empty? "+al.isEmpty()); 
      System.out.println("Does LinkedList contains "+search+"?");
      System.out.println(al.contains(search));
    }
}