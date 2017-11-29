package dataAccessObjects;

import objectMapping.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreateAccountImplementation implements CreateAccountInterface 
{
    private static SessionFactory factory;

    public static void setSessionFactory(SessionFactory factory)
    {
        CreateAccountImplementation.factory = factory;
    }

    @Override
    public void createAccount(String studentID, String firstName, String lastName,
            String username, String password, String email, String class1,
            String class2, String class3, String class4, String class5,
            String class6, String class7)
    {
        Session session = factory.openSession();
        Transaction transaction = null;

        try
        {
            transaction = session.beginTransaction();
            Student student = new Student(studentID, firstName, lastName,
                    username, password, email, class1, class2, class3, class4,
                    class5, class6, class7);
            session.save(student);
            transaction.commit();
        } 
        
        catch (HibernateException hibernateException) 
        {
            if (transaction != null)
            {
                transaction.rollback();
            }
            
            hibernateException.printStackTrace();
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
        boolean usernameExists = false;
        
        return usernameExists;
    }
}