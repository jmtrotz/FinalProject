package dataAccessObjects;

// Import packages
import java.util.ArrayList;
import objectMapping.CS225;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Class to contain methods used by GradesController.java
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class GradesImplementation 
{
    private static SessionFactory factory;

    /**
     * Set session factory
     * @param factory Hibernate session factory
     */
    public static void setSessionFactory(SessionFactory factory)
    {
        GradesImplementation.factory = factory;
    }
    
    /**
     * Method to list grades for the user stored in the database
     * @param username Username entered into the login form
     * @return Returns an ArrayList containing the user's grades
     */
    public ArrayList listGrades(String username)
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> gradesList = new ArrayList<>();
        
        try 
        {
            // Get the user's grades from the database
            session.beginTransaction();
            org.hibernate.Query query = session.createQuery("FROM CS225 "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);

            CS225 cs225 = (CS225) query.uniqueResult();
            gradesList.add(cs225.getGrade1());
            gradesList.add(cs225.getGrade2());
            gradesList.add(cs225.getGrade3());
            gradesList.add(cs225.getGrade4());
            gradesList.add(cs225.getGrade5());
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
        return gradesList;
    }
}