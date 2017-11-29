package dataAccessObjects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LoginImplementation implements LoginInterface 
{
    private static SessionFactory factory;

    public static void setSessionFactory(SessionFactory factory)
    {
        LoginImplementation.factory = factory;
    }
    
    // Still working on this...
    @Override
    public boolean userExistsInDB (String username)
    {
        boolean usernameExists = false;
        Session session = factory.openSession();
        
        try
        {
            session.beginTransaction();
            org.hibernate.Query query  = session.createQuery("FROM Student WHERE USERNAME = :username");
            query.setParameter("username", username);
        
            if (query.uniqueResult() == null)
            {
                usernameExists = true;
            }

            session.getTransaction().commit();
        } 
        
        catch (HibernateException hibernateException) 
        {
            hibernateException.printStackTrace();
        } 
        
        finally 
        {
            session.close();
        }
        
        return usernameExists;
    }
    
    // Still working on this...
    @Override
    public boolean passwordMatchesUsername (String username, String password)
    {
        boolean incorrectPassword = false;        
        Session session = factory.openSession();
        
        try
        {
            session.beginTransaction();
            org.hibernate.Query query  = session.createQuery("FROM Student WHERE PASSWORD = :password");
            query.setParameter("password", password);
        
            if ((this.userExistsInDB(username) == false) && query.uniqueResult() == null)
            {
                incorrectPassword = true;
            }

            session.getTransaction().commit();
        } 
        
        catch (HibernateException hibernateException) 
        {
            hibernateException.printStackTrace();
        } 
        
        finally 
        {
            session.close();
        }
        
        return incorrectPassword;
    }
}