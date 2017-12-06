package dataAccessObjects;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import objectMapping.CS225;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AssignmentsImplementation 
{
    private static SessionFactory factory;
    
    public ArrayList listAssignments(HttpServletRequest request) 
    {
        HttpSession httpSession = request.getSession();
        String username = httpSession.getAttribute("username").toString();
        
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
}