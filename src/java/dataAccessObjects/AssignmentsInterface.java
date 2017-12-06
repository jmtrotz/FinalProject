package dataAccessObjects;

// Import packages
import java.util.ArrayList;

/**
 * Interface for assignment listing methods
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public interface AssignmentsInterface 
{
    /**
     * Method to get the user's assignments from the database
     * @param username Username entered into the login form
     * @return Returns an ArrayList containing the user's assignments
     */
    public ArrayList listAssignments(String username);
}