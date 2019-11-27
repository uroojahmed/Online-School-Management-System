import java.awt.HeadlessException;
import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public class Admission {
    String name,fatherName,address,contactNo,iD,day,month,year,cnic;
    
    Connection conn;
    Statement st;
    ResultSet rs;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
    
    
   public void admissionForm()
  {
      try
      {
            conn = new Connect().ConnectDB();
            
            String sql = "insert into Student_Info (Name,FatherName,Id,Address,ContactNo,Day,Month,Year,Cnic) VALUES "
                    + "('"+this.getName()+"','"+this.getFatherName()+"','"+this.getiD()+"','"+this.getAddress()+
                    "','" + this.getContactNo()+"','" + this.getDay()+"','"+this.getMonth()+"','"+this.getYear()+"','"+"','"+this.getCnic()+"');";
                    
             System.out.println(sql);
             st=conn.createStatement();
             st.execute(sql);
             
             JOptionPane.showMessageDialog(null,"New Student add Succefully");
        }
        catch(HeadlessException | SQLException e)
        {
            System.out.println(e);
        }
      
      
      
      
    }
}



