import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      ArrayList<String> al = new ArrayList<String>();
      int num = 0;
      do
      {
        System.out.println("Choose any one:");
        System.out.println("1.Insert");
        System.out.println("2.delete");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        int ag = Integer.parseInt(br.readLine());
        num = ag;
        if(ag == 1)
        {
          String st = br.readLine();
          String stt[] = st.split(",");
          for(String b : stt)
          {
          al.add(b);  
          }
        }
        else if(ag == 2)
        {
          int del = Integer.parseInt(br.readLine());
          System.out.println("Enter the index value to be deleted:"+del);
          al.remove(del);
        }
        else if(ag == 3)
        {
          System.out.println(al);
        }
      }while(num != 4);
  
      
    }
}