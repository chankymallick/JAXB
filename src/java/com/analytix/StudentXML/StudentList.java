package com.analytix.StudentXML;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
/*
@author Mallick
 */
@XmlRootElement(name ="Students")
public class StudentList
{

    public StudentList()
    {
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }
    
     private List <Student> student;    

    public StudentList(List<Student> student) {
        this.student = student;
        
    }
        
     @XmlElement
    public List<Student> getStudent() 
    {
        return student;
    }

  
     
     
     
}
