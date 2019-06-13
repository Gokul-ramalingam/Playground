import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in = new Scanner(System.in);
      int sz = in.nextInt();
      int arr[] = new int[sz];
      int temp = arr[0];
      for(int i = 0 ; i < sz ; i++)
      {
        arr[i] = in.nextInt();
      }
      for(int i = 0 ; i < sz; i++)
      {
        if(temp < arr[i] )
        {
          temp = arr[i];
        }
      }
      System.out.println(temp);
    }
}