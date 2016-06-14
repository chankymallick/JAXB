/*
steps to convert java object into XML document.

Create POJO or bind the schema and generate the classes
Create the JAXBContext object
Create the Marshaller objects
Create the content tree by using set methods
Call the marshal method
*/


package com.analytixds.EmployeePojo;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Employee
{
    public Employee() {}
  
    private int EmployeeId;
    private String EmployeeName;
    private int EmployeeSalary;
    private List<Address> address;
   
    

    public Employee(int EmployeeId, String EmployeeName, int EmployeeSalary,List <Address>addresslist) 
    {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.EmployeeSalary = EmployeeSalary;
        this.address = addresslist;
    }
             
                @XmlAttribute // For assigning id into every Employee Node               
                public int getEmployeeId()
                {
                    return EmployeeId;
                }


                @XmlElement // Node Element
                public String getEmployeeName() 
                {
                    return EmployeeName;
                }


               @XmlElement
                public int getEmployeeSalary()
                {
                    return EmployeeSalary;
                }
                @XmlElement
                public List<Address> getAddress()
                {
                     return address;
                }
   
        
}

/*
@XmlRootElement specifies the root element for the xml document.
@XmlAttribute specifies the attribute for the root element.
@XmlElement specifies the sub element for the root element.
*/