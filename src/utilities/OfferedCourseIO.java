/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import baseclasses.OfferedCourse;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.OfferedCourseDataModel;

/**
 * Utility class to read and write Offered Course data
 * 
 * @author Narith
 */
public class OfferedCourseIO {
    
    /**
     * Constructor is declared private because the IO classes are utilities
     * which contain static methods
     */
    private OfferedCourseIO() {
    }
    
    /**
     * Writes out a text file containing all offered courses in the offered
     * course data model
     *
     * The format of the text file is:
     *
     * Example: INFO3010:JAVA Programming
     */
    public static void writeTextFile(OfferedCourseDataModel offeredcoursedatamodel) {

        PrintWriter textFile = null;

        try {
            // Create output file
            textFile = new PrintWriter("offeredcourse.txt");

            // Loop through the array list of offered courses and print delimited text to a file
            for (OfferedCourse offeredclassroom : offeredcoursedatamodel.getListOfOfferedCourse()) {
                textFile.println(offeredclassroom.getCourseId()+ ":" + offeredclassroom.getCourseName());
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
     * Reads a delimited text file of offered courses and returns an array list of
     * offered courses.
     *
     * eof is used to keep track of whether we hit the end of the file, It
     * starts out false and if we hit the end of file (null input), it changes
     * to true and execution stops.
     *
     * The format of the text file is:
     *
     * Example: INFO3010:JAVA Programming
     */
    public static ArrayList<OfferedCourse> readTextFile() {

        ArrayList<OfferedCourse> listOfOfferedCourse = new ArrayList<>();

        try {
            boolean eof = false;
            BufferedReader textFile = new BufferedReader(new FileReader("offeredcourse.txt"));
            while (!eof) {
                String lineFromFile = textFile.readLine();
                if (lineFromFile == null) {
                    eof = true;
                } else {
                    // Create a offeredcourse
                    OfferedCourse offeredcourse = new OfferedCourse();

                    // Split the input line into offeredcourse elements using the delimiter
                    String[] lineElements = lineFromFile.split(":");
                    
                    // The first element is the offeredcourse id
                    offeredcourse.setCourseId(lineElements[0]);
                    
                    // The second element is the offeredcourse name
                    offeredcourse.setCourseName(lineElements[1]);

                    // add the offeredcourse to the arraylist
                    listOfOfferedCourse.add(offeredcourse);
                }
            }
        } catch (Exception exp) {
            Logger.logError(exp.getMessage());
        } finally {
            return listOfOfferedCourse;
        }
    }
    
}
