package dataAccessObjects;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import objectMapping.CS225;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author jmtro
 */
public class GradesImplementation 
{
    private static SessionFactory factory;

    /**
     * Set session factory
     * @param factory Hibernate session factory
     */
    public static void setSessionFactory(SessionFactory factory)
    {
        GradesImplementation.factory = factory;
    }
    
    public ArrayList listGrades(HttpServletRequest request)
    {
        HttpSession httpSession = request.getSession();
        String username = httpSession.getAttribute("username").toString();
        
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