package dataAccessObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import objectMapping.CS225;
import objectMapping.CS230;
import objectMapping.CS316;
import objectMapping.CT376;
import objectMapping.CT406;
import objectMapping.SE321;
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
    
    /**
     * Method to get a list of a student's grades for their class
     * @param username Student's username
     * @param classViewed Class the student wants their grades for
     * @return Returns a hash map containing assignments and their grade on it
     */
    @Override
    public HashMap listGrades(String username, String classViewed)
    {
        // Hashmap to return to the controller
        HashMap<String, String> gradeMap = new HashMap<>();
        
        /* Call a listing method depending on which class the student viewed. 
         * I REALLY didn't want to create a huge if statement and 6 list methods,
         * but I couldn't figre out how to create one universal method...
         */
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
    
    /**
     * Method to list all students in a class
     * @param classViewed Class the student wants a list of classmates for
     * @return Returns a hash map containing their classmate's first name and 
     * their email address
     */
    @Override
    public HashMap listPeople(String classViewed) 
    {
        // Hash map to store their classmate's name and email address
        HashMap<String, String> peopleMap = new HashMap<>();
        
        /* Call a listing method depending on which class the student viewed. 
         * I REALLY didn't want to create a huge if statement and 6 list methods,
         * but I couldn't figre out how to create one universal method...
         */
        if (classViewed.equals("CS225"))
        {
            peopleMap = this.listPeopleFromCS225();
        }
        
        else if (classViewed.equals("CS230"))
        {
            peopleMap = this.listPeopleFromCS230();
        }
        
        else if (classViewed.equals("CS316"))
        {
            peopleMap = this.listPeopleFromCS316();
        }
        
        else if (classViewed.equals("CT376"))
        {
            peopleMap = this.listPeopleFromCT376();
        }
        
        else if (classViewed.equals("CT406"))
        {
            peopleMap = this.listPeopleFromCT406();
        }
        
        else if (classViewed.equals("SE321"))
        {
            peopleMap = this.listPeopleFromSE321();
        }
        
        // Return the results
        return peopleMap;
    }   
    
    /**
     * Method to get a list of classes the student is enrolled in
     * @param username Username entered into the login form
     * @return Returns a list of classes the student is enrolled in
     */
    @Override
    public ArrayList listClasses(String username) 
    {
        // Start a new session
        Session session = factory.openSession();
        ArrayList<String> classList = new ArrayList<>();
        
        try
        {
            // Check if the username exists in the database
            session.beginTransaction();
            org.hibernate.Query query  = session.createQuery("FROM Student "
                    + "WHERE USERNAME = :username").setParameter("username", username);
            
            // If the username exists, all data is stored in a student object
            Student student = (Student) query.uniqueResult();
            
            // Add the classes the student is in to the list
            classList.add(student.getClass1());
            classList.add(student.getClass2());
            classList.add(student.getClass3());
            classList.add(student.getClass4());
            classList.add(student.getClass5());
            classList.add(student.getClass6());
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
        
        return classList;
    }
    
    /**
     * Method to list a student's grades for CS225
     * @param username Student's username
     * @return Returns a hash map containing assignments and their grade on it
     */
    private HashMap listGradesFromCS225(String username)
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
    
    /**
     * Method to list a student's grades for CS230
     * @param username Student's username
     * @return Returns a hash map containing assignments and their grade on it
     */
    private HashMap listGradesFromCS230(String username)
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
    
    /**
     * Method to list a student's grades for CS316
     * @param username Student's username
     * @return Returns a hash map containing assignments and their grade on it
     */
    private HashMap listGradesFromCS316(String username)
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
    
    /**
     * Method to list a student's grades for CT376
     * @param username Student's username
     * @return Returns a hash map containing assignments and their grade on it
     */
    private HashMap listGradesFromCT376(String username)
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
    
    /**
     * Method to list a student's grades for CT406
     * @param username Student's username
     * @return Returns a hash map containing assignments and their grade on it
     */
    private HashMap listGradesFromCT406(String username)
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
    
    /**
     * Method to list a student's grades for SE321
     * @param username Student's username
     * @return Returns a hash map containing assignments and their grade on it
     */
    private HashMap listGradesFromSE321(String username)
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
    
    /**
     * Method to list a student's classmates for CS225
     * @return Returns a hash map containing their classmate's first name and
     * email address
     */
    private HashMap listPeopleFromCS225()
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> cs225PeopleMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM CS225").list();
            
            for (Iterator iterator = students.iterator(); iterator.hasNext();) 
            {
                CS225 cs225 = (CS225) iterator.next();
                cs225PeopleMap.put(cs225.getFirstName() + " " + cs225.getLastName(), cs225.getEmail());
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
        return cs225PeopleMap;
    }
    
    /**
     * Method to list a student's classmates for CS230
     * @return Returns a hash map containing their classmate's first name and
     * email address
     */
    private HashMap listPeopleFromCS230()
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> cs230PeopleMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM CS230").list();
            
            for (Iterator iterator = students.iterator(); iterator.hasNext();) 
            {
                CS230 cs230 = (CS230) iterator.next();
                cs230PeopleMap.put(cs230.getFirstName() + " " + cs230.getLastName(), cs230.getEmail());
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
        return cs230PeopleMap;
    }
    
    /**
     * Method to list a student's classmates for CS316
     * @return Returns a hash map containing their classmate's first name and
     * email address
     */
    private HashMap listPeopleFromCS316()
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> cs316PeopleMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM CS316").list();
            
            for (Iterator iterator = students.iterator(); iterator.hasNext();) 
            {
                CS316 cs316 = (CS316) iterator.next();
                cs316PeopleMap.put(cs316.getFirstName() + " " + cs316.getLastName(), cs316.getEmail());
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
        return cs316PeopleMap;
    }
    
    /**
     * Method to list a student's classmates for CT376
     * @return Returns a hash map containing their classmate's first name and
     * email address
     */
    private HashMap listPeopleFromCT376()
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> ct376PeopleMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM CT376").list();
            
            for (Iterator iterator = students.iterator(); iterator.hasNext();) 
            {
                CT376 ct376 = (CT376) iterator.next();
                ct376PeopleMap.put(ct376.getFirstName() + " " + ct376.getLastName(), ct376.getEmail());
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
        return ct376PeopleMap;
    }
    
    /**
     * Method to list a student's classmates for CT406
     * @return Returns a hash map containing their classmate's first name and
     * email address
     */
    private HashMap listPeopleFromCT406()
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> ct406PeopleMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM CT406").list();
            
            for (Iterator iterator = students.iterator(); iterator.hasNext();) 
            {
                CT406 ct406 = (CT406) iterator.next();
                ct406PeopleMap.put(ct406.getFirstName() + " " + ct406.getLastName(), ct406.getEmail());
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
        return ct406PeopleMap;
    }
    
    /**
     * Method to list a student's classmates for SE321
     * @return Returns a hash map containing their classmate's first name and
     * email address
     */
    private HashMap listPeopleFromSE321()
    {
        // Start a new session
        Session session = factory.openSession();
        Transaction transaction = null;
        HashMap<String, String> se321PeopleMap = new HashMap<>();
        
        try 
        {
            transaction = session.beginTransaction();
            List students = session.createQuery("FROM SE321").list();
            
            for (Iterator iterator = students.iterator(); iterator.hasNext();) 
            {
                SE321 se321 = (SE321) iterator.next();
                se321PeopleMap.put(se321.getFirstName() + " " + se321.getLastName(), se321.getEmail());
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
        return se321PeopleMap;
    }
}