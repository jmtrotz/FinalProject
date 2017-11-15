package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import dataAccessObjects.CreateAccountInterface;

public class CreateAccountController implements Controller {

    private CreateAccountInterface createAccount;

    public void setCreateAccountInterface(CreateAccountInterface createAccount) {
        this.createAccount = createAccount;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
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

        if (studentID.length() == 0 || firstName.length() == 0
                || lastName.length() == 0 || username.length() == 0
                || password.length() == 0 || email.length() == 0) {
            redirectAddress = "createAccountError-emptyFields";
        } else if (!createAccount.verifyPassword(password, confirmPassword)) {
            redirectAddress = "createAccountError-passwordMismatch";
        } else if (!createAccount.verifyUsername(username)) {
            redirectAddress = "createAccountError-usernameTaken";
        } else {
            createAccount.createAccount(studentID, firstName, lastName, username,
                    password, email, class1, class2, class3, class4, class5,
                    class6, class7);
            redirectAddress = "accountCreated";
        }

        return new ModelAndView(redirectAddress);
    }
}