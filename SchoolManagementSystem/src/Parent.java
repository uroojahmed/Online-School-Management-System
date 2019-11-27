
import java.util.Scanner;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public class Parent extends CommonItems
{
  public int total,index,i=0;
  public int day,month,year;

  public String ans,reply;
  public String[] questions={"how was the quality of education "," how was the quality of teaching",
                             "Your child is learning what he/she needs  to known ","how was the staff in behaviour ",
                             "Your child finds school work challenging ",
                             "Your child is motivated by the teachers ",
                             "Your child is safe in school ",
                             "Field trips conducted","Quality of cafeteria and dining area ",
                             "how was the Transport facilities"};
  public String[] options={"Q1 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q2 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q3 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q4 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q5 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q6 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q7 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q8 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q9 Options are:"+"dissatisfied"+", satisfied"+", neutral",
                           "Q10 Options are:"+"dissatisfied"+", satisfied"+", neutral" 
                          };

    /**
     *
     */
  @Override
  public void setInfo()
  {
      name=name;
      lastName=lastName;
      age=age;
      day=day;
      month=month;
      year=year;
      id=id;
      System.out.println("First Name"+ "Last Name"+  "Age " + "Date Of Birth"+ "Id Number");
      System.out.println( name+"    "+"    "+lastName+"   "+age+"    "+day+"/"+month+"/"+year+" "+id);
    
  }
  public void feedBack()
  {
    for(String q:questions)
    {
      Scanner parents=new Scanner(System.in);
      System.out.println(q);
      System.out.println(options[index]);
      ans=parents.nextLine();
      index+=1;
      if(ans.equals("dissatisfied") || ans.equals("satisfied") || ans.equals("neutral"))
      {
        reply=ans;
      }
    }
  }
  public void parentNotification()
  {
      
  }

    void setFirstName(String firstName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setlastName(String lastName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setAge(int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setIDNum(int IdNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDay(int Day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMonth(int Month) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setYear(JTextField year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setYear(int Year) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
