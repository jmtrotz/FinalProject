package controllers;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dataAccessObjects.LoginInterface;

public class LoginController implements Controller
{    
    private LoginInterface login;
    
    public void setCustomerDao(LoginInterface login) 
    {
        this.login = login;
    }
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String redirectAddress = "";
        
        if (username.length() == 0 || password.length() == 0) 
        {
            redirectAddress = "loginError-emptyFields";
        } 
        
        else 
        {
            login.login(username, password);
        }
        
        return new ModelAndView(redirectAddress, "login", null);
    }
}