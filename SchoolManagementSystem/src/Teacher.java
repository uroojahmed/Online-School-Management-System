
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public class Teacher 
{
  public String[] name=new String[15];
  public String[] fname=new String[15];
  public int[] age=new int[15];
  public int[] id=new int[15];
  public int day,year,month;
  public int[] contactNo=new int[15];
  public String[] cnic=new String[15];
  public String[] eMail=new String[15];
  public int[] passWord=new int [15];
  
  public void Info()
  {
    for(int i=1;i<=15;i++)
    {
      Scanner ss=new Scanner(System.in);
      name[i]=ss.nextLine();
      fname[i]=ss.nextLine();
      age[i]=ss.nextInt();
      day=ss.nextInt();
      month=ss.nextInt();
      year=ss.nextInt();
      id[i]=ss.nextInt();
      contactNo[i]=ss.nextInt();
      cnic[i]=ss.nextLine();
      eMail[i]=ss.nextLine();
      System.out.println("Teacher Name"+ "Father Name"+  "Age " + "Date Of Birth"+ "Id Number"+" Contact Number"+" Cnic Number"+" Email Address");
      System.out.println( name[i]+"    "+"    "+fname[i]+"   "+age[i]+"    "+day+"/"+month+"/"+year+" "+id[i]+"    "+contactNo[i]+"     "+cnic[i]+"   "+"     "+eMail[i]+"     "+passWord[i]);
    }
  }

   public String attendance()
  {
    for(int i=1;i<=30;i++)
    {
    Scanner p=new Scanner(System.in);
    String input=p.nextLine();
     
    if(input.equals("P") || input.equals("p"))
      return "P";
    }
    return "A";
  }
   
   
}
