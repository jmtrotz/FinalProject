package dataAccessObjects;

import java.util.ArrayList;
import objectMapping.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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
    public ArrayList listGrades(String username) 
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> gradesList = new ArrayList<>();
        
        try 
        {
            // Get the user's grades from the database
            session.beginTransaction();
            org.hibernate.Query query = session.createQuery("FROM Student "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);
            Student student = (Student) query.uniqueResult();
            gradesList.add(student.getClass1());
            gradesList.add(student.getClass2());
            gradesList.add(student.getClass3());
            gradesList.add(student.getClass4());
            gradesList.add(student.getClass5());
            gradesList.add(student.getClass6());
            gradesList.add(student.getClass7());
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
        return gradesList;
    }

    @Override
    public ArrayList listAssignments(String username) 
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> assignmentsList = new ArrayList<>();
        
        try 
        {
            // Get the user's assignments from the database
            org.hibernate.Query query = session.createQuery("FROM Student "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);
            Student student = (Student) query.uniqueResult();
            assignmentsList.add(student.getClass1());
            assignmentsList.add(student.getClass2());
            assignmentsList.add(student.getClass3());
            assignmentsList.add(student.getClass4());
            assignmentsList.add(student.getClass5());
            assignmentsList.add(student.getClass6());
            assignmentsList.add(student.getClass7());
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
        return assignmentsList;
    }

    @Override
    public ArrayList listPeople() 
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> peopleList = new ArrayList<>();
        
        try 
        {
            session.beginTransaction();
            org.hibernate.Query query = session.createQuery("");
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