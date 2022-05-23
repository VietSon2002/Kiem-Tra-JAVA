/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiHK;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Read {
    public void ghi(List<Student> student) throws ParseException {
        try{
            
            FileOutputStream fi=new FileOutputStream("thi.txt");
            ObjectOutputStream ob=new ObjectOutputStream(fi);
            ob.writeObject(student);
            ob.close();
            fi.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public List<Student> doc(List<Student> student){
        try{
            FileInputStream fo=new FileInputStream("thi.txt");
            ObjectInputStream o=new ObjectInputStream(fo);
            List<Student> b=(List<Student>) o.readObject();
            o.close();
            fo.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return student;
    }
}
