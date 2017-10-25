/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import baseclasses.OfferedCourse;
import java.util.ArrayList;

/**
 *
 * @author Narith
 */
public class OfferedCourseDataModel {
    
    private ArrayList<OfferedCourse> listOfOfferedCourse = new ArrayList<>();

    /**
     * no-arg constructor
     */
    public OfferedCourseDataModel() {
    }

    public ArrayList<OfferedCourse> getListOfOfferedCourse() {
        return listOfOfferedCourse;
    }

    public void setListOfOfferedCourse(ArrayList<OfferedCourse> listOfOfferedCourse) {
        this.listOfOfferedCourse = listOfOfferedCourse;
    }
}
