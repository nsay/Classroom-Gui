package baseclasses;

import interfaces.ICourse;
import utilities.Logger;

/**
 * Use this class to create an offered course. 
 */
public class OfferedCourse implements ICourse {

    private String courseId;
    private String courseName;
    private Classroom classroom;  
   
    /**
     * default no-arg constructor
     */
    public OfferedCourse() {
        Logger.logInfo("Offered Course created with default values");
    }

    /**
     * Overloaded constructor
     */
    public OfferedCourse(String id, String name, Classroom room) {
        this.courseId = id;
        this.courseName = name;
        this.classroom = room;
        Logger.logInfo(this.toString() + " created");
    }

    @Override
    public void setCourseId(String idNumber) {
        this.courseId = idNumber;
    }

    public void setCourseName(String title) {
        this.courseName = title;
    }

    public void setClassroom(Classroom room) {
        this.classroom = room;
    }
   
    @Override
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    /**
     * toString will format the data as key/value pairs separated by a colon (:)
     * This will allow the data to be easily parsed using the String split method
     * Notice we also get the classroom data
     */
    @Override
    public String toString() {
        return "Course Id: " + courseId + " Course Name: " + courseName + " Classroom: " + classroom.getRoomNumber();
    }    
}
