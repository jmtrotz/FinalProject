package servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import objectMapping.CreateAccountImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class CreateAccountServlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext((getServletContext()));
        CreateAccountImplementation createAccount = (CreateAccountImplementation) context.getBean("createAccont");
        
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

        if (studentID.length() == 0 || firstName.length() == 0 || lastName.length() == 0 || username.length() == 0 || password.length() == 0 || email.length() == 0) {
            address = "createAccountError-emptyFields.jsp";
        } 
        
        else if (!createAccount.verifyPassword(password, confirmPassword)) 
        {
            address = "createAccountError-passwordMismatch.jsp";
        } 
        
        else if (!createAccount.verifyUsername(username)) 
        {
            address = "createAccountError-usernameTaken.jsp";
        }
        
        else 
        {
            createAccount.createAccount(studentID, firstName, lastName, username, password, email, classes);
            address = "accountCreated.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}