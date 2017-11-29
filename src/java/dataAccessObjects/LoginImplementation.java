package dataAccessObjects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LoginImplementation implements LoginInterface 
{
    private static SessionFactory factory;

    public static void setSessionFactory(SessionFactory factory)
    {
        LoginImplementation.factory = factory;
    }
    
    // Still working on this...
    @Override
    public boolean verifyUsername (String username)
    {
        boolean usernameExists = false;
        Session session = factory.openSession();
        Transaction transaction = null;
        
        try
        {
            org.hibernate.Query query =  session.createQuery("FROM STUDENT WHERE USERNAME = :userName");
            query.setParameter("userName", username);
            System.out.println(query.uniqueResult());
        }
        
        catch (HibernateException hibernateException)
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
            
            hibernateException.printStackTrace();
        }
        
        return usernameExists;
    }
    
    // Still working on this...
    @Override
    public boolean verifyPassword (String username, String password)
    {
        boolean correctPassword = false;
        
        return correctPassword;
    }
}