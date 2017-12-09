package controllers;

// Import packages
import dataAccessObjects.LoginInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller for the login page
 * @Class CT 406
 * @Date 11/29/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class LoginController implements Controller 
{
    private LoginInterface login;

    /**
     * Set the login interface
     * @param login Java interface
     */
    public void setLoginInterface(LoginInterface login)
    {
        this.login = login;
    }

    /**
     * Handles HTTP requests from clients
     * @param request HTTP request from the client
     * @param response HTTP response sent to the client
     * @return Returns a new view for the client
     * @throws Exception Throws an exception if there's an error
     */
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
    {
        // Get parameters from the webpage
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ModelAndView modelAndView = new ModelAndView();

        // Make sure the login form was completely filled out
        if (username.length() == 0 || password.length() == 0) 
        {
            modelAndView = new ModelAndView("loginError-emptyFields");
        }
        
        // Make sure the user actually exists in the database
        else if (login.userExistsInDB(username))
        {
            modelAndView = new ModelAndView("loginError-username");
        }
        
        // Make sure the password matches the username
        else if (!login.passwordMatchesUsername(username, password))
        {
            modelAndView = new ModelAndView("loginError-password");
        }
        
        // If everything checks out, log them in
        else
        {
            modelAndView = new ModelAndView("viewClasses", "classList", login.listClasses(username));
        }
        
        // Store the username for future use in the session
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
                
        // Return the new view and a list of the user's classes
        return modelAndView;
    }
}