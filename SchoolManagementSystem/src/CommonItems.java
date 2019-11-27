/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author home
 */
public abstract class CommonItems 
{
  String firstName;
  String lastName;
  String name;
  String fname;
  int age;
  int day;
  int month;
  int year;
  String contactNo;
  int id;
  int cnic;
  String address;

  abstract public void setInfo();
  private void teacherNotification()
  {
    System.out.println("teacher Notification");
  }
  public void parentNotification()
  {
    System.out.println("parent Notification");
    
  }
    
}
