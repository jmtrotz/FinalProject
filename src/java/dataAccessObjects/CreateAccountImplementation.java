package dataAccessObjects;

// Import packages
import objectMapping.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Class to contain methods used by CreateAccountController.java
 * @Class CT 406
 * @Date 11/29/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class CreateAccountImplementation implements CreateAccountInterface 
{
    private static SessionFactory factory;

    /**
     * Set session factory
     * @param factory Hibernate session factory
     */
    public static void setSessionFactory(SessionFactory factory)
    {
        CreateAccountImplementation.factory = factory;
    }

    /**
     * Method to add a student to the database
     * @param studentID Student's school issued student ID number
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param email Student's email address
     * @param username Username chosen by the student
     * @param password Password chosen by the student
     */
    @Override
    public void createAccount(String studentID, String firstName, String lastName,
            String email, String username, String password, String class1,
            String class2, String class3, String class4, String class5,
            String class6)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;

        try
        {
            // Add the student to the database
            transaction = session.beginTransaction();
            Student student = new Student(studentID, firstName, lastName, email, 
                    username, password, class1, class2, class3, class4, class5, 
                    class6);
            session.save(student);
            transaction.commit();
        } 
        
        catch (HibernateException hibernateException) 
        {
            // Undo the changes if there's an error
            if (transaction != null)
            {
                transaction.rollback();
            }
            
            hibernateException.printStackTrace();
        } 
        
        finally 
        {
            // Close the session to conserve resources
            session.close();
        }
    }

    /**
     * Method to make sure a username isn't already in use
     * @param username Username chosen by the student
     * @return Returns true if the username is taken, false if not
     */
    @Override
    public boolean userExistsInDB(String username)
    {
        // Start a new session
        Session session = factory.openSession();
        boolean usernameTaken = true;
        
        try
        {
            // Check if the username exists in the database
            session.beginTransaction();
            org.hibernate.Query query  = session.createQuery("FROM Student WHERE"
                    + " USERNAME = :username");
            query.setParameter("username", username);
        
            // If the username exists, set usernameExists to true
            if (query.uniqueResult() == null)
            {
                usernameTaken = false;
            }

            session.getTransaction().commit();
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
        return usernameTaken;
    }
}