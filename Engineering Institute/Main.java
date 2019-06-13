//import required packages
import java.util.Scanner;

class Faculty
{
  int baseSalary;
  public void salary(int baseSalary)
  {
    //write your Faculty class statements  
    System.out.println("Base Salary: "+baseSalary);  
  }
}
class CSE 
{
  public void salary(int baseSalary)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(baseSalary+3000));
  }
}
class IT 
{
  public void salary(int baseSalary)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(baseSalary + 5000));
  }
}
class ECE 
{
  public void salary(int baseSalary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(baseSalary + 4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Faculty obj = new Faculty();
    Scanner in = new Scanner(System.in);
    obj.baseSalary = in.nextInt();
    //implement your required concept here
    if(obj.baseSalary > 0)
    {
    ECE obj3 = new ECE();
    CSE obj1 = new CSE();
    IT obj2 = new IT();
    obj.salary(obj.baseSalary);
    obj1.salary(obj.baseSalary);
    obj2.salary(obj.baseSalary);
    obj3.salary(obj.baseSalary);
    }
    else
      System.out.println("null");
  }
}