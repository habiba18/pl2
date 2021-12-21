/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college_examination_management_system;

import java.util.Scanner;
/**
 *
 * @author 2002x
 */
public class Student extends Person{
    private int level;
    private double GPA;
    private final String studentFileName="Student.txt";
    
    public static ArrayList<Student>Students =new ArrayList<Student>();
    
    public Student(){


}
    
    public Student(   int id, String user,String pass,String f_name,String l_name,int age,int level,double GPA){
    super(user,pass,id,f_name,l_name,age,dept);
    this.level=level;
    this.GPA=GPA;
    } 
    
    public void setlevel(int level){
     this.level=level;
    }
     public void setlGPA(double GPA){
     this.GPA=GPA;
    }
      public int getlevel(){
    return this.level;
    }
         public double getGPA(){
    return this.GPA;
    }
         public boolean addStudent(){
         
             if(FManger.write(getStudentData(),studentFileName,true))
         return true;
             else 
                 return false;
         }
         private String getStudentData(){
         
         return this.id+"*"+ this.f_name+"*"+this.l_name+"*"+this.age+"*"+this.level+"*"+this.GPA+"*"+myDept.getDeptName()+"*"+this.username+"*"+this.pass+"*";
       
         }
         private void commitToFile(){
         
         FManger.write(Students.get(0).getStudentData(),studentFileName,false);
         for(int i=1;i<Students.size();i++ ){
         FManger.write(Students.get(0).getStudentData(),studentFileName,true);
         
         }
         
         }
         public int getStudentIndex(int id ){
          for(int i=1;i<Students.size();i++ )
              if(Students.get(i).getID()==id)
                  return i;
             
           return -1;
          }
         private void loadFromFile(){
         Students=(ArrayList<Student>)(Object) FManger.read(studentFileName);
         }
         public String displayAllStudents(){
         loadFromFile();
         String S="\nAll Student Data :\n";
         for(Student x :Students){
         S =S + x.toString();
         
         }
          return S;
         }
         
         
         public String searchStudent(int id){
          loadFromFile();
         int index=getStudentIndex(id);
         if(index!=-1)
             return "\n Found ....!"+Students.get(index).toString();
         else
             return "\nNot Found ....!";
         }
         
         
         public void updateStudent(int oldID,Student x){
         loadFromFile();
         int index=getStudentIndex(oldID);
         Students.set(index,x);
         commitToFile();
         }
           public void deleteStudent(int id){
           loadFromFile();
            int index=getStudentIndex(id);
            Students.remove(index);
            commitToFile();
           }
           
         }

