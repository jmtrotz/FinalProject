package dataAccessObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
        HashMap<String, String> gradeMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List grades = session.createQuery("FROM CS225").list();
            
            for (Iterator iterator2 = grades.iterator(); iterator2.hasNext();) 
            {
                CS225 cs225 = (CS225) iterator2.next();
                gradeMap.put(cs225.getAssignment1(), cs225.getGrade1());
                gradeMap.put(cs225.getAssignment2(), cs225.getGrade2());
                gradeMap.put(cs225.getAssignment3(), cs225.getGrade3());
                gradeMap.put(cs225.getAssignment4(), cs225.getGrade4());
                gradeMap.put(cs225.getAssignment5(), cs225.getGrade5());
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
        return gradeMap;
    }
    
    @Override
    public HashMap listPeople() 
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> peopleMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM CS225").list();
            
            for (Iterator iterator = students.iterator(); iterator.hasNext();) 
            {
                CS225 cs225 = (CS225) iterator.next();
                peopleMap.put(cs225.getFirstName(), cs225.getEmail());
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
        return peopleMap;
    }   
}