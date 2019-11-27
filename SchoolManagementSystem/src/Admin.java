
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
public class Admin {
    String[] mon={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
    String[] days={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    public void calender()
  {
    
    
    Scanner cal=new Scanner(System.in);
    int month=cal.nextInt();
    int years=cal.nextInt();
    switch(month)
    {
      case 1:
      { 
        System.out.println("         January  "+" "+years);
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 "+" 31");
        break;
      }
      case 2:
      {
        System.out.println("         February  "+" "+years);
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        break;
        
      }
      case 3:
      {
        System.out.println("        March  "+" "+years);
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 "+" 31");
        break;
      }
      case 4:
      {
        System.out.println("        April  "+" "+years);
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 ");
        break;
      }
      case 5:
      {
        System.out.println("       May  "+" "+years); 
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 "+" 31");
        break;
      }
      case 6:
      {
        System.out.println("        June  "+" "+years); 
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 ");
        break;
      }
      case 7:
      {
        System.out.println("        July  "+" "+years); 
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 "+" 31");
        break;
      }
      
      case 8:
      {
        System.out.println("        August  "+" "+years); 
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 "+" 31");
        break;
      }
      case 9:
      {
        System.out.println("        September  "+" "+years); 
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 ");
        break;
      }
      case 10:
      {
        System.out.println("        October  "+" "+years); 
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 "+" 31");
        break;
      }
      case 11:
      {
        System.out.println("        November  "+" "+years); 
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 ");
        break;
      }
      case 12:
      {
        System.out.println("        December  "+" "+years); 
        System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+" "+days[4]+" "+days[5]+" "+days[6]);
        System.out.println("         "+"         "+"       "+""+""+""+"1"); 
        System.out.println(" 2 "+"  3  "+" 4 "+"  5"+"   6"+"   7"+"   8"); 
        System.out.println(" 9 "+"  10  "+"11 "+"12"+"  13"+"  14"+"  15");
        System.out.println(" 16 "+" 17 "+" 18 "+" 19"+" 20"+"  21"+"  22");
        System.out.println(" 23 "+" 24 "+" 25 "+" 26"+" 27"+"  28"+"  29");
        System.out.println(" 30 "+" 31");
        break;
      }
    }
  }

    /**
     *
     */
    public void teacherNotification()
  {
      Scanner admin=new Scanner(System.in);
      String noti=admin.nextLine();
  }
  public void parentNotification()
  {
  }

    
}
