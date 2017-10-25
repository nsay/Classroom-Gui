package baseclasses;

import interfaces.ICourse;
import utilities.Logger;
import java.util.ArrayList;

/**
 * Use this class to create a course enrollment for a student. This class will 
 * link to an existing offered course via the courseId field in OfferedCourse.
 */
public class StudentCourse implements ICourse {

    private ArrayList<Float> courseGrades = new ArrayList<>();
    private String courseId;

    /**
     * Default no-arg constructor
     */
    public StudentCourse() {
        Logger.logInfo("Student course created with default values");
    }

    /**
     * Overloaded constructor
     */
    public StudentCourse(String courseId) {
        this.courseId = courseId;        
        Logger.logInfo(this.toString() + " created");
    }

    public ArrayList<Float> getCourseGrades() {
        return this.courseGrades;
    }

    @Override
    public String getCourseId() {
        return courseId;
    }

    @Override
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    
    /**
     * Replaces the current list of courseGrades with a new list.
     */
    public void setCourseGrades(ArrayList<Float> courseGrades) {
        this.courseGrades = courseGrades;
    }
   
    /**
     * Add a list of grades to the existing list
     */
    public void addGrades(ArrayList<Float> grades) {
        this.courseGrades.addAll(grades);
    }

    /**
     * toString will format the data as key/value pairs separated by a colon (:)
     * This will allow the data to be easily parsed using the String split method
     */
    @Override
    public String toString() {
        return "courseId=" + courseId;
    }

}
