/*
 *  This Class contains a list which will hold classroom objects created in the UI
 */
package model;

import baseclasses.Classroom;
import java.util.ArrayList;

public class ClassroomDataModel {

    private ArrayList<Classroom> listOfClassrooms = new ArrayList<>();

    /**
     * no-arg constructor
     */
    public ClassroomDataModel() {
    }

    public ArrayList<Classroom> getListOfClassrooms() {
        return listOfClassrooms;
    }

    public void setListOfClassrooms(ArrayList<Classroom> listOfClassrooms) {
        this.listOfClassrooms = listOfClassrooms;
    }

    
}
