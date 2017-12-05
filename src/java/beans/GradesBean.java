package beans;

import java.util.ArrayList;
import objectMapping.CS225;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

public class GradesBean 
{
    private static SessionFactory factory;
    HttpServletRequest request = new HttpServletRequest();
    HttpSession session = request.getSession();
    String username = session.getAttribute("username").toString();
    
    public ArrayList listAssignments(String username) 
    {
        Session session = factory.openSession();
        ArrayList<String> assignmentsList = new ArrayList<>();
        
        try 
        {
            session.beginTransaction();
            org.hibernate.Query query = session.createQuery("FROM CS225 "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);

            CS225 cs225 = (CS225) query.uniqueResult();
            assignmentsList.add(cs225.getAssignment1());
            assignmentsList.add(cs225.getAssignment2());
            assignmentsList.add(cs225.getAssignment3());
            assignmentsList.add(cs225.getAssignment4());
            assignmentsList.add(cs225.getAssignment5());
            
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

        return assignmentsList;
    }
    
    public ArrayList listGrades(String username) 
    {
        Session session = factory.openSession();
        ArrayList<String> gradesList = new ArrayList<>();
        
        try 
        {
            session.beginTransaction();
            org.hibernate.Query query = session.createQuery("FROM CS225 "
                    + "WHERE USERNAME = :username");
            query.setParameter("username", username);

            CS225 cs225 = (CS225) query.uniqueResult();
            gradesList.add(cs225.getGrade1());
            gradesList.add(cs225.getGrade2());
            gradesList.add(cs225.getGrade3());
            gradesList.add(cs225.getGrade4());
            gradesList.add(cs225.getGrade5());
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

        return gradesList;
    }
}