/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import baseclasses.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.StudentDataModel;

/**
 * Utility class to read and write Student data
 * 
 * @author Narith
 */
public class StudentIO {
    
    /**
     * Constructor is declared private because the IO classes are utilities
     * which contain static methods
     */
    private StudentIO() {
    }
    
    /**
     * Writes out a text file containing all students in the student data
     * model
     *
     * The format of the text file is:
     *
     * Example: Narith:Street Address:123-45-6789
     */
    public static void writeTextFile(StudentDataModel studentdatamodel) {

        PrintWriter textFile = null;

        try {
            // Create output file
            textFile = new PrintWriter("student.txt");

            // Loop through the array list of students and print delimited text to a file
            for (Student student : studentdatamodel.getListOfStudents()) {
                textFile.println(student.getName()+ ":" + student.getAddress() 
                + ":" + student.getSocialSecurityNumber());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // Flush the output stream and close the file
            textFile.flush();
            textFile.close();
        }
    }
    
    /**
     * Reads a delimited text file of students and returns an array list of
     * students.
     *
     * eof is used to keep track of whether we hit the end of the file, It
     * starts out false and if we hit the end of file (null input), it changes
     * to true and execution stops.
     *
     * The format of the text file is:
     *
     * Example: Narith:Street Address:123-45-6789
     */
    public static ArrayList<Student> readTextFile() {

        ArrayList<Student> listOfStudent = new ArrayList<>();

        try {
            boolean eof = false;
            BufferedReader textFile = new BufferedReader(new FileReader("student.txt"));
            while (!eof) {
                String lineFromFile = textFile.readLine();
                if (lineFromFile == null) {
                    eof = true;
                } else {
                    // Create a student
                    Student student = new Student();

                    // Split the input line into student elements using the delimiter
                    String[] lineElements = lineFromFile.split(":");
                    
                    // The first element is the student name
                    student.setName(lineElements[0]);
                    
                    // The second element is the student address
                    student.setAddress(lineElements[1]);
                    
                    // The second element is the student ssn
                    student.setSocialSecurityNumber(lineElements[2]);

                    // add the students to the arraylist
                    listOfStudent.add(student);
                }
            }
        } catch (Exception exp) {
            Logger.logError(exp.getMessage());
        } finally {
            return listOfStudent;
        }
    }
}
