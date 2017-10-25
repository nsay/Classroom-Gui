/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import baseclasses.Student;
import java.util.ArrayList;

/**
 *
 * @author Narith
 */
public class StudentDataModel {
    
    private ArrayList<Student> listOfStudents = new ArrayList<>();

    /**
     * no-arg constructor
     */
    public StudentDataModel() {
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
}
