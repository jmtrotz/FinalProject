package dataAccessObjects;

// Import packages
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Class to contain methods used by PeopleController.java
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class PeopleImplementation 
{
    private static SessionFactory factory;

    /**
     * Set session factory
     * @param factory Hibernate session factory
     */
    public static void setSessionFactory(SessionFactory factory)
    {
        PeopleImplementation.factory = factory;
    }
    
    public ArrayList listPeople() 
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> peopleList = new ArrayList<>();
        
        try 
        {
            session.beginTransaction();
            org.hibernate.Query query = session.createQuery("");
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
        return peopleList;
    }
}