package dataAccessObjects;

import objectMapping.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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
        Transaction tx = null;

        try
        {
            tx = session.beginTransaction();
            Student student = new Student(studentID, firstName, lastName,
                    username, password, email, class1, class2, class3, class4,
                    class5, class6, class7);
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
        Session session = factory.openSession();
        Transaction tx = null;
        boolean exists = false;
        
        try
        {
            tx = session.beginTransaction();
            Criteria criteria = session.createCriteria(Student.class);
            criteria.add(Restrictions.eq("USERNAME", username));
            criteria.setProjection(Projections.rowCount());
            long count = (Long) criteria.uniqueResult();
            session.getTransaction().commit();
            
            if (count != 0)
            {
                exists = true;
            }
            
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
        
        return exists;
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