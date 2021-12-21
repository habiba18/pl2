/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college_examination_management_system;

/**
 *
 * @author 2002x
 */
public abstract class Person {
    protected int id;
    protected String username;
    protected String pass;
    protected String f_name;
    protected String l_name;
    protected int age;
    Department myDept;
    FileManger FManger=new FileManager();
    
    
    public Person(){
    
    
    }
    
    public Person(String user,String pass,int id, String Fname,String lname,int age,Department dept){
    
    
    }
    
    
    
    
}
