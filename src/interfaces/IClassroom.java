package interfaces;

import baseclasses.Classroom;

/*
 * Interface to define classroom types - since Classroom is the only class
 * that implements this interface it can probably be eliminated but we'll 
 * leave it in for completeness.
 */
public interface IClassroom {

    // Setters
    void setTypeOfRoom(Classroom.RoomType roomtype);
    void setRoomNumber(String roomnumber);

    // Getters
    String getRoomNumber();
    Classroom.RoomType getTypeOfRoom();
    
    // Additional methods
    String toString();

}
