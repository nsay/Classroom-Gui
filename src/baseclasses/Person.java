package baseclasses;

import interfaces.IPerson;
import utilities.Logger;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * This class represents a Person. The class is declared abstract because we
 * will never need to create a Person, only Faculty and Students, who
 * extend the Person class. By declaring it abstract, we prevent anyone from 
 * being able to create instances of Person.
 */
public abstract class Person implements IPerson {

    private String name;
    private String address;
    private String socialSecurityNumber;
    private GregorianCalendar dateOfBirth;

    /* Create a date formatter object that can be used to format dates in 
     * in any class that extends this class
     */
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    /**
     * No-arg constructor, access level is protected so that only classes in
     * the same package can call it.
     */
    protected Person() {
    }

    /**
     * Overloaded constructor, access level is protected so that only classes in
     * the same package can call it.
     */
    protected Person(String name, String address, String socialSecurityNumber,
                     GregorianCalendar dateOfBirth) {
        this.name = name;
        this.address = address;
        this.socialSecurityNumber = socialSecurityNumber;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    @Override
    public GregorianCalendar getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * Get date of birth as a formatted string
     */
    @Override
    public String getFormattedDateOfBirth() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        return sdf.format(this.dateOfBirth.getTime());
    }

    // Setters
    @Override
    public void setName(String name) {
        this.name = name;
        Logger.logInfo("Set name: " + this.name);
    }
   
    @Override
    public void setAddress(String address) {
        this.address = address;
        Logger.logInfo("Set address: " + this.address);
    }

    @Override
    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
        Logger.logInfo("Set SSN: " + this.socialSecurityNumber);
    }
    
    @Override
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        Logger.logInfo("Set date of birth: " + this.dateOfBirth.getTime());
    }

    // Additional methods
    
    /**
     * toString will format the data as key/value pairs separated by a colon (:)
     * This will allow the data to be easily parsed using the String split method
     */
    @Override
    public String toString() {
        return "name=" + name + ":address=" + address + ":socialSecurityNumber=" + socialSecurityNumber + 
                ":dateOfBirth=" + dateOfBirth.getTime();
    }

    
}
