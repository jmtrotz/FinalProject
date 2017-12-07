package dataAccessObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import objectMapping.CS225;
import objectMapping.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MenuItemsImplementation implements MenuItemsInterface
{
    private static SessionFactory factory;

    /**
     * Set session factory
     * @param factory Hibernate session factory
     */
    public static void setSessionFactory(SessionFactory factory)
    {
        MenuItemsImplementation.factory = factory;
    }
    
    @Override
    public HashMap listGrades(String username) 
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> gradeList = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM Student").list();
            for (Iterator iterator1 = students.iterator(); iterator1.hasNext();) 
            {
                Student student = (Student) iterator1.next();
                student.getUsername();
                Set grades = customer.getCars();
                
                for (Iterator iterator2 = cars.iterator(); iterator2.hasNext();)
                {
                    Cars carName = (Cars) iterator2.next();
                }
            }
            
            transaction.commit();
        } 
        
        catch (HibernateException hibernateException) 
        {
            // Print a stack trace if there's an error
            hibernateException.printStackTrace();
            transaction.rollback();
        } 
        
        finally 
        {
            // Close the session to conserve resources
            session.close();
        }

        // Return the results
        return gradeList;
    }

    @Override
    public ArrayList listAssignments(String username) 
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> assignmentList = new ArrayList<>();
        
        try 
        {
            // Get the user's assignments from the database
            org.hibernate.Query query = session.createQuery("FROM Student "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);
            Student student = (Student) query.uniqueResult();
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
        return assignmentList;
    }

    @Override
    public HashMap listPeople() 
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> peopleList = new HashMap<>();
        
        try 
        {
            session.beginTransaction();
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM CS225").list();
            
            for (Iterator iterator1 = students.iterator(); iterator1.hasNext();) 
            {
                CS225 cs225 = (CS225) iterator1.next();                
                peopleList.put(cs225.getFirstName(), cs225.getEmail());
            }
            
            transaction.commit();            
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