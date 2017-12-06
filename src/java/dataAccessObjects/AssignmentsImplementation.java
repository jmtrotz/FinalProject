package dataAccessObjects;

// Import packages
import java.util.ArrayList;
import objectMapping.CS225;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Class to contain methods used by AssignmentsController.java
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class AssignmentsImplementation 
{
    private static SessionFactory factory;
    
    /**
     * Set session factory
     * @param factory Hibernate session factory
     */
    public static void setSessionFactory(SessionFactory factory)
    {
        AssignmentsImplementation.factory = factory;
    }
    
    /**
     * Method to list assignments for the user stored in the database
     * @param username Username entered into the login form
     * @return Returns an ArrayList containing the user's assignments
     */
    public ArrayList listAssignments(String username) 
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> assignmentsList = new ArrayList<>();
        
        try 
        {
            // Get the user's assignments from the database
            session.beginTransaction();
            org.hibernate.Query query = session.createQuery("FROM CS225 "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);

            CS225 cs225 = (CS225) query.uniqueResult();
            assignmentsList.add(cs225.getAssignment1());
            assignmentsList.add(cs225.getAssignment2());
            assignmentsList.add(cs225.getAssignment3());
            assignmentsList.add(cs225.getAssignment4());
            assignmentsList.add(cs225.getAssignment5());
            
        } 
        
        catch (HibernateException hibernateException) 
        {
            // Print a stack trace if there's an error
            hibernateException.printStackTrace();
        } 
        
        finally 
        {
            // Close the session to conserve resources
            session.close();
        }
        
        // Return the results
        return assignmentsList;
    }
}