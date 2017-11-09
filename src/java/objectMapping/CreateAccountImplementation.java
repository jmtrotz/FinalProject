package objectMapping;

import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateAccountImplementation implements CreateAccountInterface
{
    private static SessionFactory factory;

    public static void setSessionFactory(SessionFactory factory)
    {
        CreateAccountImplementation.factory = factory;
    }
    
    @Override
    public void createAccount(String studentID, String firstName, String lastName, String username, String password, String email, Set classes)
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
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