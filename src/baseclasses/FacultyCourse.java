package baseclasses;

import interfaces.ICourse;
import utilities.Logger;

/**
 * Use this class to create a course for a Faculty. This class will 
 * link to an existing offered course via the courseId field in OfferedCourse.
 */
public class FacultyCourse implements ICourse {

    private String courseId;

    /** Default, no-arg constructor */
    public FacultyCourse() {
        Logger.logInfo("FacultyCourse created with default values");
    }

    /** Overloaded constructor */
    public FacultyCourse(String courseId) {
        this.courseId = courseId;
        Logger.logInfo(this.toString() + " created");
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
     * toString will format the data as key/value pairs separated by a colon (:)
     * This will allow the data to be easily parsed using the String split method
     */
    @Override
    public String toString() {
        return "courseId=" + courseId;
    }

   
}
