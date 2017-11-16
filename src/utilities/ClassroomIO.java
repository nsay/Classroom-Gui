/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import baseclasses.Classroom;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.ClassroomDataModel;

/**
 * Utility class to read and write Classroom data
 * 
 * @author Narith
 */
public class ClassroomIO {
    
    /**
     * Constructor is declared private because the IO classes are utilities
     * which contain static methods
     */
    private ClassroomIO() {
    }
    
    /**
     * Writes out a text file containing all classrooms in the classroom data
     * model
     *
     * The format of the text file is:
     *
     * Example: FA301:CLASSROOM
     */
    public static void writeTextFile(ClassroomDataModel classroomdatamodel) {

        PrintWriter textFile = null;

        try {
            // Create output file
            textFile = new PrintWriter("classroom.txt");

            // Loop through the array list of classrooms and print delimited text to a file
            for (Classroom classroom : classroomdatamodel.getListOfClassrooms()) {
                textFile.println(classroom.getRoomNumber() + ":" + classroom.getTypeOfRoom());
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
     * Reads a delimited text file of classrooms and returns an array list of
     * classrooms.
     *
     * eof is used to keep track of whether we hit the end of the file, It
     * starts out false and if we hit the end of file (null input), it changes
     * to true and execution stops.
     *
     * The format of the text file is:
     *
     * Example: FA301:CLASSROOM
     */
    public static ArrayList<Classroom> readTextFile() {

        ArrayList<Classroom> listOfClassrooms = new ArrayList<>();

        try {
            boolean eof = false;
            BufferedReader textFile = new BufferedReader(new FileReader("classroom.txt"));
            while (!eof) {
                String lineFromFile = textFile.readLine();
                if (lineFromFile == null) {
                    eof = true;
                } else {
                    // Create a classroom
                    Classroom classroom = new Classroom();

                    // Split the input line into classroom elements using the delimiter
                    String[] lineElements = lineFromFile.split(":");

                    // The first element is the classroom number
                    classroom.setRoomNumber(lineElements[0]);

                    // Write the logic to convert the element, which is text,
                    // to the enumerated classroom type
                    if (lineElements[1].equals("LAB")) {
                        classroom.setTypeOfRoom(Classroom.RoomType.LAB);
                    } else if (lineElements[1].equals("CLASSROOM")) {
                        classroom.setTypeOfRoom(Classroom.RoomType.CLASSROOM);
                    } else if (lineElements[1].equals("LECTURE_HALL")) {
                        classroom.setTypeOfRoom(Classroom.RoomType.LECTURE_HALL);
                    }

                    // add the classroom to the arraylist
                    listOfClassrooms.add(classroom);
                }
            }
        } catch (Exception exp) {
            Logger.logError(exp.getMessage());
        } finally {
            return listOfClassrooms;
        }
    }
    
}
