package com.analytix.StudentXML;
import java.util.List;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
/*
 @author Mallick
 */
public class StudentXMLtoObject 
{
    public static void main(String ...s)
    {
        try
        {
        File xmlFile = new File("e://StudentList.xml");
      
        JAXBContext jbctxtObject = JAXBContext.newInstance(StudentList.class);
        Unmarshaller unmrshObject =   jbctxtObject.createUnmarshaller();
        
        StudentList slist = (StudentList)unmrshObject.unmarshal(xmlFile);      
        ArrayList <Student> list = (ArrayList<Student>)slist.getStudent();        
        for(Student s1 : list)
        {
        System.out.println(s1.getStudentName());
        }
        
        }
        catch(JAXBException e)
        {
        e.printStackTrace();
        }  
        
        
    
    }
}
