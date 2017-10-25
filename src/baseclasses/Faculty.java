package baseclasses;

import utilities.Logger;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
   Use this class to create Faculty members. Each new faculty member should 
   contain the following:
  1) Name
  2) Address
  3) Social Security Number
  4) Date of Birth
  5) Date of Hire
  6) Salary 
  8) Status (part time or full time)  
  9) (Optional) date of termination
 */

public class Faculty extends Person {

    private String name;
    private String address;
    private String socialSecurityNumber;
    private GregorianCalendar dateOfBirth;
    private GregorianCalendar dateOfHire = new GregorianCalendar();
    private GregorianCalendar dateOfTermination = new GregorianCalendar();
    private double salary;
    private String status;
    private ArrayList<FacultyCourse> listOfCourses = new ArrayList<>();
    
    /**
     * Default no-arg constructor
     */
    public Faculty() {
        Logger.logInfo("Faculty created with default values");
    }

    /**
     * Overloaded constructor
     */
    public Faculty(String name, String address, String ssnum, GregorianCalendar dateOfBirth,
                   GregorianCalendar dateOfHire, String status, double salary) {
        this.name = name;
        this.address = address;
        this.socialSecurityNumber = ssnum;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHire = dateOfHire;
        this.salary = salary;
        this.status = status;
        Logger.logInfo(this.toString() + " created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
   
    /**
     * Set date of hire
     */
    public void setDateOfHire(GregorianCalendar existingDate) {
        this.dateOfHire = existingDate;
         Logger.logInfo("Set date of hire: " + this.dateOfHire.getTime());
    }

    /**
     * Set date of termination using integer values
     */
    public void setDateOfTermination(int year, int month, int day) {
        this.dateOfTermination = new GregorianCalendar(year, month, day);
         Logger.logInfo("Set date of termination: " + this.dateOfTermination.getTime());
    }

    /**
     * Set date of termination using an existing date
     */
    public void setDateOfTermination(GregorianCalendar existingDate) {
        this.dateOfTermination = existingDate;
    }

    public void setListOfCourses(ArrayList<FacultyCourse> listOfCourses) {
        this.listOfCourses = listOfCourses;
         Logger.logInfo("Set list of courses: " + this.listOfCourses);
    }
    
    /**
     * Set salary
     */
    public void setSalary(double newsalary) {
        this.salary = newsalary;
        Logger.logInfo("Set salary: " + this.salary);
    }
    
    /**
     * Set status, full time or part time
     * @param status 
     */
    public void setStatus(String status) {
        this.status = status;
         Logger.logInfo("Set status: " + this.status);
    }
   
    public GregorianCalendar getDateOfHire() {
        return this.dateOfHire;
    }

    public GregorianCalendar getDateOfTermination() {
        return this.dateOfTermination;
    }

    public String getStatus() {
        return status;
    }

    /** 
     * Returns unformatted salary value
     */
    public double getSalary() {
        return salary;
    };

    public ArrayList<FacultyCourse> getListOfCourses() {
        return listOfCourses;
    }    
    
    /**
     * Returns a currency formatted string based on location
     */
    public String getFormattedSalary() {
        Locale us = new Locale.Builder().setLanguage("en").setRegion("US").build();
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(us);
        return currencyFormatter.format(this.salary);
    }

    /**
     * toString will format the data as key/value pairs separated by a colon (:)
     * This will allow the data to be easily parsed using the String split method
     * First it calls the parent toString method to get that data (Person)
     */
    @Override    
    public String toString() {
        return super.toString() + ":dateOfHire=" + dateOfHire.getTime() + 
                ":dateOfTermination=" + dateOfTermination.getTime() + ":salary=" + 
                salary + ":status=" + status + ":" + listOfCourses.toString();
    }
    
   
}
