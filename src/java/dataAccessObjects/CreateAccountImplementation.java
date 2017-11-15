package dataAccessObjects;

import java.util.Set;
import objectMapping.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateAccountImplementation implements CreateAccountInterface 
{
    private static SessionFactory factory;

    public static void setFactory(SessionFactory factory) 
    {
        CreateAccountImplementation.factory = factory;
    }

    @Override
    public void createAccount(String studentID, String firstName, String lastName, String username, String password, String email, Set classes) 
    {
        Session session = factory.openSession();
        Transaction tx = null;

        try 
        {
            tx = session.beginTransaction();
            Student student = new Student(studentID, firstName, lastName, username, password, email, classes);
            session.save(student);
            tx.commit();
        } 
        
        catch (HibernateException e)
        {
            if (tx != null) 
            {
                tx.rollback();
            }
        } 
        
        finally 
        {
            session.close();
        }
    }

    // Still working on this...
    @Override
    public boolean verifyUsername(String username) 
    {
        if (false) 
        {
            return true;
        } 
        
        else 
        {
            return false;
        }
    }

    @Override
    public boolean verifyPassword(String password, String confirmPassword) 
    {
        if (password.equals(confirmPassword))
        {
            return true;
        } 
        
        else 
        {
            return false;
        }
    }
}