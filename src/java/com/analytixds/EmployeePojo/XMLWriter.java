/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analytixds.EmployeePojo;

import com.analytix.StudentXML.StudentObjectToXML;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.servlet.ServletOutputStream;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBContext;
/*
 @author Mallick
 */
@WebServlet(name = "XMLWriter", urlPatterns = {"/XMLWriter"})
public class XMLWriter extends HttpServlet
{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("file/xml");
        response.setHeader( "Content-Disposition", "filename=" + "Employee.txt" );

        try
        {
        ServletOutputStream out = response.getOutputStream();
//        JAXBContext contextObject = JAXBContext.newInstance(Employee.class);        
//        Marshaller marshallerObject = contextObject.createMarshaller();        
//        marshallerObject.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);        
//                Address a1= new Address("Permamnet","Kolkata", "WB", 711303);
//                Address a2= new Address("Temporary","Hyderabad", "Telangana", 54303);        
//                ArrayList <Address> list = new ArrayList<Address>();        
//                            list.add(a1);
//                            list.add(a2);        
//                 Employee e1 =new Employee(1,"Chanky",12500,list);      
//        marshallerObject.marshal(e1, out);       
        //out.w
       String ss="Udit "+System.lineSeparator()+"Shankaru";
            System.out.println("");
            byte [] aaa =  ss.getBytes();
            
         out.write(aaa);
            out.flush();
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      
    }

}
