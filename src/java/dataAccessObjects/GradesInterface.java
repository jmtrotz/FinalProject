package dataAccessObjects;

// Import packages
import java.util.ArrayList;

/**
 * Interface for grade listing methods
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public interface GradesInterface 
{
    /**
     * Method to get the user's grades from the database
     * @param username Username entered into the login form
     * @return Returns an ArrayList containing the user's grades
     */
    public ArrayList listGrades(String username);
}