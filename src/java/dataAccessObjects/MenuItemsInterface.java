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
     * @param classViewed Class the student wants their grades for
     * @return Returns an ArrayList containing the user's grades
     */
    public HashMap listGrades(String username, String classViewed);
    
    /**
     * Method to get a list of the user's classmates from the database
     * @param classViewed Class the student wants a list of their classmates for
     * @return Returns an ArrayList containing the user's classmates
     */
    public HashMap listPeople(String classViewed);
    
    /**
     * Method to get a list of classes the student is enrolled in
     * @param username Username entered into the login form
     * @return Returns a list of classes the student is enrolled in
     */
    public ArrayList listClasses(String username);
}