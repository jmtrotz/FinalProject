package controllers;

// Import packages
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dataAccessObjects.CreateAccountInterface;

/**
 * Controller for the account creation page
 * @Class CT 406
 * @Date 11/29/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class CreateAccountController implements Controller 
{
    private CreateAccountInterface createAccount;

    /**
     * Set the account creation interface
     * @param createAccount Account creation interface
     */
    public void setCreateAccountInterface(CreateAccountInterface createAccount) 
    {
        this.createAccount = createAccount;
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
        String redirectAddress = "";

        // Make sure the form was completely filled out
        if (studentID.length() == 0 || firstName.length() == 0
                || lastName.length() == 0 || username.length() == 0
                || password.length() == 0 || email.length() == 0) 
        {
            redirectAddress = "createAccountError-emptyFields";
        } 
        
        // Make sure both passwords entered in the form match
        else if (!password.equals(confirmPassword)) 
        {
            redirectAddress = "createAccountError-passwordMismatch";
        } 
        
        // Make sure the username chosen by the client isn't taken
        else if (createAccount.userExistsInDB(username)) 
        {
            redirectAddress = "createAccountError-usernameTaken";
        } 
        
        // If everything checks out, add the user to the database
        else 
        {
            
            createAccount.createAccount(studentID, firstName, lastName, email,
                    username, password, class1, class2, class3, class4, class5,
                    class6, class7);
            redirectAddress = "accountCreated";
        }

        // Return the new view
        return new ModelAndView(redirectAddress);
    }
}