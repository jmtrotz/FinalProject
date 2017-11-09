package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import objectMapping.LoginImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class LoginServlet extends HttpServlet 
{    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ApplicationContext context = WebApplicationContextUtils.getRequiredWebApplicationContext((getServletContext()));
        LoginImplementation login = (LoginImplementation) context.getBean("login");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = "";
        
        if (username.length() == 0 || password.length() == 0) 
        {
            address = "loginError-emptyFields.jsp";
        } 
        
        else
        {
            login.login(username, password);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(address);
        dispatcher.forward(request, response);
    }
}