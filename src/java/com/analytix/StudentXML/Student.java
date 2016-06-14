
package com.analytix.StudentXML;
import java.util.Date;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.joda.time.*;

@XmlRootElement(name ="Student")
@XmlType( propOrder  = {"studentID","studentName","branch","DOB"}) //Properties Must be in Small letters
public class Student
{

    public Student() 
    {
    }
   
    public Student(int StudentID, String StudentName, String Branch) {
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.Branch = Branch;
        this.DOB = null;
    }
    @XmlElement
    public int getStudentID() {
        return StudentID;
    }
    @XmlAttribute(name = "rowid")
    public String getId() 
    {
        return Integer.toString(StudentID);
    }
    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

   

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
     @XmlElement
    public String getBranch() {
        return Branch;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }
    
    private int StudentID;
   @XmlElement
    public String getStudentName() {
        return StudentName;
    }
    private String StudentName;
    private String Branch;
    private LocalDate DOB; 

    @XmlElement(name = "Date_Of_Birth")
    public LocalDate getDOB() {
        return DOB;
    }
   
    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }
    
}
