package dataAccessObjects;

// Import packages
import java.util.ArrayList;
import objectMapping.CS225;
import objectMapping.CS230;
import objectMapping.CS316;
import objectMapping.CT376;
import objectMapping.CT406;
import objectMapping.SE321;
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
     * @param class1
     * @param class2
     * @param class3
     * @param class4
     * @param class5
     * @param class6
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
        ArrayList<String> classList = new ArrayList();
        
        if (!(class1.equalsIgnoreCase("null")));
        {
            classList.add(class1);
        }
        
        if (!(class2.equalsIgnoreCase("null")));
        {
            classList.add(class2);
        }
        
        if (!(class3.equalsIgnoreCase("null")));
        {
            classList.add(class3);
        }
        
        if (!(class4.equalsIgnoreCase("null")));
        {
            classList.add(class4);
        }
        
        if (!(class5.equalsIgnoreCase("null")));
        {
            classList.add(class5);
        }
        
        if (!(class6.equalsIgnoreCase("null")));
        {
            classList.add(class6);
        }
        
        try
        {
            // Add the student to the database
            transaction = session.beginTransaction();
            Student student = new Student(studentID, firstName, lastName, email, 
                    username, password, class1, class2, class3, class4, class5, 
                    class6);
            session.save(student);
            transaction.commit();
            
            // Add the user to the classes they registered for
            for(String registeredClass: classList)
            {
                if(registeredClass.equalsIgnoreCase("CS225"))
                {
                    this.insertIntoCS225(username, firstName, lastName, email);
                }
                
                else if(registeredClass.equalsIgnoreCase("CS230"))
                {
                    this.insertIntoCS230(username, firstName, lastName, email);
                }
                
                else if(registeredClass.equalsIgnoreCase("CS316"))
                {
                    this.insertIntoCS316(username, firstName, lastName, email);
                }
                
                else if(registeredClass.equalsIgnoreCase("CT376"))
                {
                    this.insertIntoCT376(username, firstName, lastName, email);
                }
                
                else if(registeredClass.equalsIgnoreCase("CT406"))
                {
                    this.insertIntoCT406(username, firstName, lastName, email);
                }
                
                else if(registeredClass.equalsIgnoreCase("SE321"))
                {
                    this.insertIntoSE321(username, firstName, lastName, email);
                }
            }
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
    
    /**
     * Method to add the user to the CS225 class (if they're registered for it) 
     * @param username Username chosen by the student 
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param email Student's email address
     */
    public void insertIntoCS225(String username, String firstName, String lastName, String email)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        
        try
        {
            // Add the student to the database
            transaction = session.beginTransaction();
            CS225 cs225 = new CS225(username, firstName, lastName, email);
            session.save(cs225);
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
     * Method to add the user to the CS230 class (if they're registered for it) 
     * @param username Username chosen by the student 
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param email Student's email address
     */
    public void insertIntoCS230(String username, String firstName, String lastName, String email)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        
        try
        {
            // Add the student to the database
            transaction = session.beginTransaction();
            CS230 cs230 = new CS230(username, firstName, lastName, email);
            session.save(cs230);
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
     * Method to add the user to the CS316 class (if they're registered for it) 
     * @param username Username chosen by the student 
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param email Student's email address
     */
    public void insertIntoCS316(String username, String firstName, String lastName, String email)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        
        try
        {
            // Add the student to the database
            transaction = session.beginTransaction();
            CS316 cs316 = new CS316(username, firstName, lastName, email);
            session.save(cs316);
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
     * Method to add the user to the CT376 class (if they're registered for it) 
     * @param username Username chosen by the student 
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param email Student's email address
     */
    public void insertIntoCT376(String username, String firstName, String lastName, String email)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        
        try
        {
            // Add the student to the database
            transaction = session.beginTransaction();
            CT376 ct376 = new CT376(username, firstName, lastName, email);
            session.save(ct376);
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
     * Method to add the user to the CT406 class (if they're registered for it) 
     * @param username Username chosen by the student 
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param email Student's email address
     */
    public void insertIntoCT406(String username, String firstName, String lastName, String email)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        
        try
        {
            // Add the student to the database
            transaction = session.beginTransaction();
            CT406 ct406 = new CT406(username, firstName, lastName, email);
            session.save(ct406);
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
     * Method to add the user to the SE321 class (if they're registered for it) 
     * @param username Username chosen by the student 
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param email Student's email address
     */
    public void insertIntoSE321(String username, String firstName, String lastName, String email)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        
        try
        {
            // Add the student to the database
            transaction = session.beginTransaction();
            SE321 se321 = new SE321(username, firstName, lastName, email);
            session.save(se321);
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
}