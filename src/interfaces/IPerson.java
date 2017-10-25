/*
 * Interface for the Person class, all classes that extend Person automatically implement this interface
 */

package interfaces;

import java.util.GregorianCalendar;

public interface IPerson {

    
    // Setters
    void setAddress(String address);
    void setDateOfBirth(GregorianCalendar dateOfBirth);
    void setName(String name);
    void setSocialSecurityNumber(String ssn);

    // Getters
    String getAddress();
    GregorianCalendar getDateOfBirth();    
    String getName();
    String getSocialSecurityNumber();
    
    // Additional methods
    String getFormattedDateOfBirth();
    String toString();
    
}
