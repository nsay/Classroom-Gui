/**
 *
 * @author Narith
 */
package testclasses;

import baseclasses.Classroom;
import static baseclasses.Classroom.RoomType.LECTURE_HALL;
import baseclasses.Faculty;
import baseclasses.FacultyCourse;
import baseclasses.OfferedCourse;
import baseclasses.Student;
import baseclasses.StudentCourse;
import java.util.GregorianCalendar;

public class TestClassCreation {
    
    public static void main(String[] args) {

        // Create a date which will be used in all test methods
        GregorianCalendar testDate = new GregorianCalendar(1975, GregorianCalendar.JULY, 3);
        
        // Create a classroom 
        Classroom classroom = new Classroom("PA100", LECTURE_HALL);
        System.out.println(classroom.toString());

        // Create a Faculty member
        // Uses the date created above
        Faculty faculty = new Faculty();
        faculty.setDateOfBirth(testDate);
        faculty.setName("Elizabeth Kramer");
        faculty.setAddress("1 University Ave");
        faculty.setSocialSecurityNumber("123456789");
        faculty.setStatus("PARTTIME");
        faculty.setDateOfHire(testDate);
        faculty.setDateOfTermination(testDate);
        faculty.setSalary(10000000);
        
        // Create an Offered Course 
        // Uses the classroom created above
        OfferedCourse newCourseOffering = new OfferedCourse("INFO301", "Java Programming", classroom);
        System.out.println(newCourseOffering.toString());

        // Create a FacultyCourse (link to course id of newCourseOffereing created above)
        FacultyCourse facultyCourse = new FacultyCourse(newCourseOffering.getCourseId());

        // Add to list of courses for the faculty
        faculty.getListOfCourses().add(facultyCourse);
        System.out.println(faculty.toString());

        // Create a Student 
        Student newStudent = new Student();
        newStudent.setDateOfBirth(testDate);
        newStudent.setName("Kathy Smith");
        newStudent.setAddress("1 Beech Ave");
        newStudent.setSocialSecurityNumber("567876567");
        newStudent.setDateOfGraduation(testDate);
        newStudent.setCurrentGPA(0.0f);

        // Create a Student Course (link to course id of newCourseOffereing created above)
        StudentCourse studentCourse = new StudentCourse(newCourseOffering.getCourseId());

        // Add course to student's list of courses
        newStudent.getEnrolledCourses().add(studentCourse);

        // Add grades to Student's Course 
        studentCourse.getCourseGrades().add(90.5f);
        studentCourse.getCourseGrades().add(100.0f);
        studentCourse.getCourseGrades().add(70.5f);
        studentCourse.getCourseGrades().add(65.0f);
        System.out.println(newStudent.toString());

    }
}
