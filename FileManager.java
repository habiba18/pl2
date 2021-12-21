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
public class FileManager {
    
    public boolean write(String Query,String FilePath,boolean appendtype){
    
    PrintWriter writter =null;
    try{
    
     System.out.println("\nwritting in !"+FilePath);
     writter=new PrintWriter(new FileWriter(new File(FilePath),appendtype));
   writter.println(Query);
      System.out.println("....Done");        
             return true;
    }catch (IOException e){
    System.out.println(e);     
    }finally {
    writter.close();
    }
    return false;
    }
    public ArrayList <Object >read (String FilePath){
    Scanner input =new Scanner (System.in);
    Scanner Reader=null;
    try{
    }
    System.out.println("Reading ! From"+FilePath);    
    Reader= new Scanner(new File (FilePath));
    }
    catch (FileNotFoundException e){
    System.out.println(e);     
    }if(FilePath.equals("student.txt")) {
   ArrayList<Student>Students =new ArrayList<Student>();
    Student x;
    while (Reader.hasNext()){
    
    x= new  Student();
    String Line =Reader.nextLine();
    String[] seprated =Line.split("*");
    
    }
    }
}
