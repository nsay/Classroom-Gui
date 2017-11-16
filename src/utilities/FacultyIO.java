/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import baseclasses.Faculty;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.FacultyDataModel;

/**
 * Utility class to read and write Faculty data
 * 
 * @author Narith
 */
public class FacultyIO {
    
    /**
     * Constructor is declared private because the IO classes are utilities
     * which contain static methods
     */
    private FacultyIO() {
    }
    
    /**
     * Writes out a text file containing all faculty in the faculty data
     * model
     *
     * The format of the text file is:
     *
     * Example: Narith:Street Address:123-45-6789:FULL TIME:10000
     */
    public static void writeTextFile(FacultyDataModel facultydatamodel) {

        PrintWriter textFile = null;

        try {
            // Create output file
            textFile = new PrintWriter("faculty.txt");

            // Loop through the array list of faculities and print delimited text to a file
            for (Faculty faculty : facultydatamodel.getListOfFaculty()) {
                textFile.println(faculty.getName() + ":" + faculty.getAddress() + ":" + faculty.getSocialSecurityNumber() 
                        + ":" + faculty.getStatus() + ":" + faculty.getSalary());
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
     * Reads a delimited text file of faculties and returns an array list of
     * faculties.
     *
     * eof is used to keep track of whether we hit the end of the file, It
     * starts out false and if we hit the end of file (null input), it changes
     * to true and execution stops.
     *
     * The format of the text file is:
     *
     * Example: Narith:Street Address:123-45-6789:FULL TIME:10000
     */
    public static ArrayList<Faculty> readTextFile() {

        ArrayList<Faculty> listOfFaculty = new ArrayList<>();

        try {
            boolean eof = false;
            BufferedReader textFile = new BufferedReader(new FileReader("faculty.txt"));
            while (!eof) {
                String lineFromFile = textFile.readLine();
                if (lineFromFile == null) {
                    eof = true;
                } else {
                    // Create a faculty
                    Faculty faculty = new Faculty();

                    // Split the input line into faculty elements using the delimiter
                    String[] lineElements = lineFromFile.split(":");
                    
                    // The first element is the faculty name
                    faculty.setName(lineElements[0]);
                    
                    // The second element is the faculty address
                    faculty.setAddress(lineElements[1]);
                    
                    // The third element is the faculty SSN
                    faculty.setSocialSecurityNumber(lineElements[2]);
                    
                    // The fourth element is the faculty status
                    faculty.setStatus(lineElements[3]);
                    
                    // The fifth element is the faculty salary
                    double fifthElement = Double.parseDouble(lineElements[4]);
                    faculty.setSalary(fifthElement);

                    // add the faculty to the arraylist
                    listOfFaculty.add(faculty);
                }
            }
        } catch (Exception exp) {
            Logger.logError(exp.getMessage());
        } finally {
            return listOfFaculty;
        }
    }
}
