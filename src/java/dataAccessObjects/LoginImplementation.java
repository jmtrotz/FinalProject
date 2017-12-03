package dataAccessObjects;

// Import packages
import java.util.ArrayList;
import objectMapping.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Class to contain methods used by LoginController.java
 * @Class CT 406
 * @Date 11/29/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class LoginImplementation implements LoginInterface 
{
    private static SessionFactory factory;

    /**
     * Set session factory
     * @param factory Hibernate session factory
     */
    public static void setSessionFactory(SessionFactory factory)
    {
        LoginImplementation.factory = factory;
    }
    
    /**
     * Method to make sure a username actually exists in the database
     * @param username Username entered into the login form
     * @return Returns true if the username is taken, false if not
     */
    @Override
    public boolean userExistsInDB (String username)
    {
        // Start a new session
        Session session = factory.openSession();
        boolean usernameExists = false;
        
        try
        {
            // Check if the username exists in the database
            session.beginTransaction();
            org.hibernate.Query query  = session.createQuery("FROM Student "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);
        
            // If the username exists, set usernameExists to true
            if (query.uniqueResult() == null)
            {
                usernameExists = true;
            }
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
        return usernameExists;
    }
    
    /**
     * Method to make sure the username matches the password
     * @param username Username entered into the login form
     * @param password Password entered into the login form
     * @return Returns true if the password is incorrect, false if it isn't
     */
    @Override
    public boolean passwordMatchesUsername (String username, String password)
    {
        // Start a new session
        Session session = factory.openSession();
        boolean passwordMatches = false;
        
        try
        {
            // Check if the username exists in the database
            session.beginTransaction();
            org.hibernate.Query query  = session.createQuery("FROM Student "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);
            
            // If the username exists, all data is stored in a student object
            Student student = (Student) query.uniqueResult();
            
            // Compare data from the student object with what was entered into the form
            if ((student.getUsername().equals(username)) && (student.getPassword().equals(password)))
            {
                passwordMatches = true;
            }
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
        return passwordMatches;
    }
    
    /**
     * Method to get a list of classes the student is enrolled in
     * @param username Username entered into the login form
     * @return Returns a list of classes the student is enrolled in
     */
    @Override
    public ArrayList listClasses(String username) 
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> classList = new ArrayList<>();
        
        try
        {
            // Check if the username exists in the database
            session.beginTransaction();
            org.hibernate.Query query  = session.createQuery("FROM Student "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);
            
            // If the username exists, all data is stored in a student object
            Student student = (Student) query.uniqueResult();
            
            // Add the classes the student is in to the list
            classList.add(student.getClass1());
            classList.add(student.getClass2());
            classList.add(student.getClass3());
            classList.add(student.getClass4());
            classList.add(student.getClass5());
            classList.add(student.getClass6());
            classList.add(student.getClass7());
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
        
        System.out.println(classList);
        return classList;
    }
}