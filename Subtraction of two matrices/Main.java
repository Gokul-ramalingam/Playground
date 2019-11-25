import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int mat[][] = new int[r][c];
    int mtx[][] = new int[r][c];
    for(int i = 0; i < r;i++)
    {
      for(int j = 0; j < c;j++)
      {
        mat[i][j] = in.nextInt();
      }
    }
    for(int i = 0; i < r;i++)
    {
      for(int j = 0; j < c;j++)
      {
        mtx[i][j] = in.nextInt();
      }
    }
    for(int i = 0; i < r;i++)
    {
      for(int j = 0; j < c;j++)
      {
        System.out.print((mat[i][j] - mtx[i][j]) +" ");
      }
      System.out.println();
    }
  }
}