package dataAccessObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import objectMapping.CS225;
import objectMapping.CS230;
import objectMapping.CS316;
import objectMapping.CT376;
import objectMapping.CT406;
import objectMapping.SE321;
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
    public HashMap listGrades(String username, String classViewed)
    {
        HashMap<String, String> gradeMap = new HashMap<>();
        
        if (classViewed.equals("CS225"))
        {
            gradeMap = this.listGradesFromCS225(username);
        }
        
        else if (classViewed.equals("CS230"))
        {
            gradeMap = this.listGradesFromCS230(username);
        }
        
        else if (classViewed.equals("CS316"))
        {
            gradeMap = this.listGradesFromCS316(username);
        }
        
        else if (classViewed.equals("CT376"))
        {
            gradeMap = this.listGradesFromCT376(username);
        }
        
        else if (classViewed.equals("CT406"))
        {
            gradeMap = this.listGradesFromCT406(username);
        }
        
        else if (classViewed.equals("SE321"))
        {
            gradeMap = this.listGradesFromSE321(username);
        }
        
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
    
    public HashMap listGradesFromCS225(String username)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> cs225GradeMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            org.hibernate.Query cs225Query = session.createQuery("FROM CS225 "
                    + "WHERE USERNAME = :username").setParameter("username", username);
            
            CS225 cs225 = (CS225) cs225Query.uniqueResult();
            cs225GradeMap.put(cs225.getAssignment1(), cs225.getGrade1());
            cs225GradeMap.put(cs225.getAssignment2(), cs225.getGrade2());
            cs225GradeMap.put(cs225.getAssignment3(), cs225.getGrade3());
            cs225GradeMap.put(cs225.getAssignment4(), cs225.getGrade4());
            cs225GradeMap.put(cs225.getAssignment5(), cs225.getGrade5());
            
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
        return cs225GradeMap;
    }
    
    public HashMap listGradesFromCS230(String username)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> cs230GradeMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            org.hibernate.Query cs230Query = session.createQuery("FROM CS230 "
                    + "WHERE USERNAME = :username").setParameter("username", username);
            
            CS230 cs230 = (CS230) cs230Query.uniqueResult();
            cs230GradeMap.put(cs230.getAssignment1(), cs230.getGrade1());
            cs230GradeMap.put(cs230.getAssignment2(), cs230.getGrade2());
            cs230GradeMap.put(cs230.getAssignment3(), cs230.getGrade3());
            cs230GradeMap.put(cs230.getAssignment4(), cs230.getGrade4());
            cs230GradeMap.put(cs230.getAssignment5(), cs230.getGrade5());
            
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
        return cs230GradeMap;
    }
    
    public HashMap listGradesFromCS316(String username)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> cs316GradeMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            org.hibernate.Query cs316Query = session.createQuery("FROM CS316 "
                    + "WHERE USERNAME = :username").setParameter("username", username);
            
            CS316 cs316 = (CS316) cs316Query.uniqueResult();
            cs316GradeMap.put(cs316.getAssignment1(), cs316.getGrade1());
            cs316GradeMap.put(cs316.getAssignment2(), cs316.getGrade2());
            cs316GradeMap.put(cs316.getAssignment3(), cs316.getGrade3());
            cs316GradeMap.put(cs316.getAssignment4(), cs316.getGrade4());
            cs316GradeMap.put(cs316.getAssignment5(), cs316.getGrade5());
            
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
        return cs316GradeMap;
    }
    
    public HashMap listGradesFromCT376(String username)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> ct376GradeMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            org.hibernate.Query ct376Query = session.createQuery("FROM CT376 "
                    + "WHERE USERNAME = :username").setParameter("username", username);
            
            CT376 ct376 = (CT376) ct376Query.uniqueResult();
            ct376GradeMap.put(ct376.getAssignment1(), ct376.getGrade1());
            ct376GradeMap.put(ct376.getAssignment2(), ct376.getGrade2());
            ct376GradeMap.put(ct376.getAssignment3(), ct376.getGrade3());
            ct376GradeMap.put(ct376.getAssignment4(), ct376.getGrade4());
            ct376GradeMap.put(ct376.getAssignment5(), ct376.getGrade5());
            
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
        return ct376GradeMap;
    }
    
    public HashMap listGradesFromCT406(String username)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> ct406GradeMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            org.hibernate.Query ct406Query = session.createQuery("FROM CT406 "
                    + "WHERE USERNAME = :username").setParameter("username", username);
            
            CT406 ct406 = (CT406) ct406Query.uniqueResult();
            ct406GradeMap.put(ct406.getAssignment1(), ct406.getGrade1());
            ct406GradeMap.put(ct406.getAssignment2(), ct406.getGrade2());
            ct406GradeMap.put(ct406.getAssignment3(), ct406.getGrade3());
            ct406GradeMap.put(ct406.getAssignment4(), ct406.getGrade4());
            ct406GradeMap.put(ct406.getAssignment5(), ct406.getGrade5());
            
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
        return ct406GradeMap;
    }
    
    public HashMap listGradesFromSE321(String username)
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> se321GradeMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            org.hibernate.Query se321Query = session.createQuery("FROM SE321 "
                    + "WHERE USERNAME = :username").setParameter("username", username);
            
            SE321 se321 = (SE321) se321Query.uniqueResult();
            se321GradeMap.put(se321.getAssignment1(), se321.getGrade1());
            se321GradeMap.put(se321.getAssignment2(), se321.getGrade2());
            se321GradeMap.put(se321.getAssignment3(), se321.getGrade3());
            se321GradeMap.put(se321.getAssignment4(), se321.getGrade4());
            se321GradeMap.put(se321.getAssignment5(), se321.getGrade5());
            
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
        return se321GradeMap;
    }
}