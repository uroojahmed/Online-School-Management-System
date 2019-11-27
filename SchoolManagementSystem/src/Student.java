
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public class Student 
{
    
  public int[] subMarks=new int[5];
  public String[] subjects={"English","Math","Chemistry","Science","History"};
  public String[] weekDays={"Monday","Tuesday","Wednesday","Thursday","Friday"};
  public char grade;
  public float per;;

  public int total=0; 
  public int day,month,year;
  
    /**
     *
     */
          
          
  public void timeTable()
  { 
    System.out.println("Subjects   "+"    Week Days");
    for(String t1:subjects)
      for(String t:weekDays)
        System.out.println(t1+"    "+ t);
  }
  public void setInfo(String StudentName,String fatherName,String address,int Age,int Day,int Month,int Year,int contactNo,int 
          IDNum)
  {
      StudentName=StudentName;
      fatherName=fatherName;
      address=address;
      Age=Age;
      Day=Day;
      Month=Month;
      Year=Year;
      contactNo=contactNo;
      IDNum=IDNum;
      
      
      
  }
  
  public char report()
  {
    for(int i=0;i<=9; i++)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            for(int j=0; j<subMarks.length; j++)
            {
                subMarks[j] = scanner.nextInt();
                total = total + subMarks[j];
            }
        }
        per =(total/6)*100;
        
        if(per>=80)
        {
            grade='A';
            return grade;
        }
        else if(per>=60 && per<80)
        {
            grade='B';
            return grade;
        } 
        else if(per>=40 && per<60)
        {   
            grade='C';
            return grade;
        }
    }
    grade='D';
    return grade;
    
  }
  
  public void display()
  {
    for(int i=1;i<=10;i++)
    System.out.println(total+" "+" "+per+" "+" "+grade);
  }  
  public void feesUpdates()
  {
      Scanner stuFees=new Scanner(System.in);
      
      System.out.println(stuFees.nextLine());
      
      
      System.out.println(stuFees.nextLine());
      
     
      int firstPay=stuFees.nextInt();
      
      int secondPay=stuFees.nextInt();
     
      int thirdPay=stuFees.nextInt();
      
      int fourthPay=stuFees.nextInt();
                
      int totalFee=52000;
      int totalPay=firstPay+secondPay+thirdPay+fourthPay;
      int dueBalance=totalFee-totalPay;
      

      
  }

    void setName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setFatherName(String fathername) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAge(int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Month(int month) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Year(int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void IDNum(int IdNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void ContactNo(int contactNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Cnic(int cnic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Day(int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] getFatherName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] getYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    Object[] getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] getIDNum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] getContactNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    Object[] getDay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] getMonth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object[] getCnic() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    void setDay(int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMonth(int month) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setYear(int year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setContactNo(int contactNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCnic(int cnic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setIDNum(int IdNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}

