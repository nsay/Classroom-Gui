package baseclasses;

import java.text.SimpleDateFormat;
import utilities.Logger;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Use this class to create Students. Each new student should contain the
 * following: 1) Name 2) Address 3) Social Security Number 4) Date of Birth 5)
 * Date of Graduation 6) Current GPA 7) List of enrolled courses for this
 * semester
 */
public class Student extends Person {

    private GregorianCalendar dateOfGraduation;
    private float currentGPA;
    private ArrayList<StudentCourse> enrolledCourses = new ArrayList<>();

    // Default no-arg constructor
    public Student() {
        Logger.logInfo("Student created with default values");
    }

    // Overloaded constructor
    public Student(String name, String address, String ssnum, GregorianCalendar dateOfBirth,
            GregorianCalendar dateOfGraduation) {
        super(name, address, ssnum, dateOfBirth);
        this.dateOfGraduation = dateOfGraduation;
        Logger.logInfo(this.toString() + " created");
    }

    /**
     * Set date of graduation
     */
    public void setDateOfGraduation(GregorianCalendar newDate) {
        this.dateOfGraduation = newDate;
        Logger.logInfo("Set date of graduation: " + this.dateOfGraduation);
    }

    /**
     * Set the current list of enrolled courses to a new list
     */
    public void setEnrolledCourses(ArrayList<StudentCourse> newListOfCourses) {
        this.enrolledCourses = newListOfCourses;
        Logger.logInfo("Set enrolled courses: " + this.enrolledCourses);
    }

    public void setCurrentGPA(float newGPA) {
        this.currentGPA = newGPA;
        Logger.logInfo("Set GPA: " + this.currentGPA);
    }

    public float getCurrentGPA() {
        return this.currentGPA;
    }

    public GregorianCalendar getDateOfGraduation() {
        return this.dateOfGraduation;
    }

    /**
     * Get date of graduation as a formatted string
     */
    @Override
    public String getFormattedDateOfBirth() {
        SimpleDateFormat sdf = new SimpleDateFormat("mm-dd-yyyy");
        return sdf.format(this.dateOfGraduation.getTime());
    }

    /**
     * Get the complete list of enrolled courses
     */
    public ArrayList<StudentCourse> getEnrolledCourses() {
        return this.enrolledCourses;
    }

    /**
     * toString will format the data as key/value pairs separated by a colon (:)
     * This will allow the data to be easily parsed using the String split method
     * First it calls the parent toString method to get that data (Person)
     */
    @Override
    public String toString() {
        return super.toString() + ":dateOfGraduation=" + dateOfGraduation + 
                ":currentGPA=" + currentGPA + ":enrolledCourses=" + enrolledCourses;
    }


}
