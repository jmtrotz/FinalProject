package servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import objectMapping.Student;

public class CreateAccountServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String address = "";
        String studentID = request.getParameter("studentID");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");
        String email = request.getParameter("email");
        String class1 = request.getParameter("class1");
        String class2 = request.getParameter("class2");
        String class3 = request.getParameter("class3");
        String class4 = request.getParameter("class4");
        String class5 = request.getParameter("class5");
        String class6 = request.getParameter("class6");
        String class7 = request.getParameter("class7");
        Set classes = new HashSet();
        classes.add(class1);
        classes.add(class2);
        classes.add(class3);
        classes.add(class4);
        classes.add(class5);
        classes.add(class6);
        classes.add(class7);

        if (studentID.length() == 0 || firstName.length() == 0 || lastName.length() == 0
                || username.length() == 0 || password.length() == 0 || email.length() == 0) 
        {
            address = "createAccountError-emptyFields.jsp";
        } 
        
        else if (!password.equals(confirmPassword)) 
        {
            address = "createAccountError-passwordMismatch.jsp";
        } 
        
        else if (this.verifyUser(username)) 
        {
            address = "createAccountError-usernameTaken.jsp";
        } 
        
        else 
        {
            this.createAccount(studentID, firstName, lastName, username, password, email, 
                    classes);
            address = "login.jsp";
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
    
    private boolean verifyUser(String username)
    {
        if (false)
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
    private void createAccount(String studentID, String firstName, String lastName, 
            String username, String password, String email, Set classes)
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try 
        {
            tx = session.beginTransaction();
            Student student = new Student(studentID, firstName, lastName, username, 
                    password, email, classes);
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
}