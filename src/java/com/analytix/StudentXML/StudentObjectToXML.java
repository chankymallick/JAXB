package com.analytix.StudentXML;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBContext;
import java.util.Date;
/*
@author Mallick
 */
public class StudentObjectToXML 
{
    public static void main(String ...s)
    {
        try
        {
        JAXBContext jaxbcntxtobject = JAXBContext.newInstance(StudentList.class);
        Marshaller marshallerObject = jaxbcntxtobject.createMarshaller();
        marshallerObject.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        Scanner sc = new Scanner(System.in);
        ArrayList <Student> slist = new ArrayList<Student>();
        /*
                int NoOfStudent =  sc.nextInt();
                System.out.println("Enter Details [SID,SNAME,SBRANCH]  "+NoOfStudent+" Times :");
                for(int i = 1;i<=NoOfStudent;i++)
                {
                    System.out.println("Student No : "+i+" :");    
                    slist.add(new Student(sc.nextInt(),sc.next(),sc.next()));
                }
        */
        DateFormat df = new SimpleDateFormat("dd/MM/yy");
        Date d1 = new Date();
        df.format(d1);
        Student s1 = new Student(1, "Chanky Mallick","MCA");
        Student s2 = new Student(2,"Bijay Kumar","MCA");
        Student s3 = new Student(3,"Roshan Kumar","B.E");   
        Student s4 = new Student(3,"Sumit Kumar","B.Tech");   
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
        
        StudentList allstudents = new StudentList(slist);
        marshallerObject.marshal(allstudents, new FileOutputStream("e://StudentList.xml"));
        marshallerObject.marshal(allstudents, System.out);
        }
        catch(Exception e)
        {
        e.printStackTrace();
        } 
    
    }    
}
