package com.analytixds.EmployeePojo;
/**
 @author Mallick
 */
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBContext;

public class ObjectToXml
{
    public static void main(String ...s)
    {
        try
        {
        JAXBContext contextObject = JAXBContext.newInstance(Employee.class);
        
        Marshaller marshallerObject = contextObject.createMarshaller();
        
        marshallerObject.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        Address a1= new Address("Permamnet","Kolkata", "WB", 711303);
        Address a2= new Address("Temporary","Hyderabad", "Telangana", 54303);        
        ArrayList <Address> list = new ArrayList<Address>();
        
        list.add(a1);
        list.add(a2);
        Employee e1 =new Employee(1,"Chanky",12500,list);
        marshallerObject.marshal(e1, new FileOutputStream("emp.xml"));
        marshallerObject.marshal(e1, System.out);
        
        
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }
    
}
