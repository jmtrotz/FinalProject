package dataAccessObjects;

// Import packages
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Interface for getting information from the database for various JSP pages
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public interface MenuItemsInterface 
{
    /**
     * Method to get the user's grades from the database
     * @param username Username entered into the login form
     * @return Returns an ArrayList containing the user's grades
     */
    public HashMap listGrades(String username);
    
    /**
     * Method to get the user's assignments from the database
     * @param username Username entered into the login form
     * @return Returns an ArrayList containing the user's assignments
     */
    public ArrayList listAssignments(String username);
    
    /**
     * Method to get a list of the user's classmates from the database
     * @return Returns an ArrayList containing the user's classmates
     */
    public HashMap listPeople();
}