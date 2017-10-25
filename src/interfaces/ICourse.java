/*
 * Interface for defining a course. Implemented by StudentCourse and 
 * FacultyCourse
 */
package interfaces;

public interface ICourse {

    // Getters
    String getCourseId();
    
    // Setters
    void setCourseId(String courseId);    
    
    // Additional methods
    String toString();
    
}
