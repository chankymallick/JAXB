
package com.analytixds.EmployeePojo;

/**
 *
 * @author Mallick
 */
public class Address 
{
 public Address(){}
    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public int getZipCode() {
        return ZipCode;
    }

    public Address(String AddressType, String City, String State, int ZipCode) {
        this.AddressType = AddressType;
        this.City = City;
        this.State = State;
        this.ZipCode = ZipCode;
    }

    public String getAddressType() {
        return AddressType;
    }

    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public void setState(String State) {
        this.State = State;
    }

    public void setZipCode(int ZipCode) {
        this.ZipCode = ZipCode;
    }
    private String AddressType;
    private String City;
    private String State;
    private int ZipCode;

    
    
}
