package dataAccessObjects;

// Import packages
import java.util.ArrayList;

/**
 * Interface for people listing methods
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public interface PeopleInterface 
{
    /**
     * Method to get a list of the user's classmates from the database
     * @return Returns an ArrayList containing the user's classmates
     */
    public ArrayList listPeople();
}