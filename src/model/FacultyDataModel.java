/*
 *  This Class contains a list which will hold faculty objects created in the UI
 */
package model;

import baseclasses.Faculty;
import java.util.ArrayList;

public class FacultyDataModel {

    private ArrayList<Faculty> listOfFaculty = new ArrayList<>();

    /**
     * no-arg constructor
     */
    public FacultyDataModel() {
    }

    public ArrayList<Faculty> getListOfFaculty() {
        return listOfFaculty;
    }

    public void setListOfFaculty(ArrayList<Faculty> listOfFaculty) {
        this.listOfFaculty = listOfFaculty;
    }

    
}