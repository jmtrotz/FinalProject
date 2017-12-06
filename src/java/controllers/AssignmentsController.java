package controllers;

// Import packages
import dataAccessObjects.AssignmentsInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller for the assignments page
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class AssignmentsController implements Controller 
{
    private AssignmentsInterface assignments;

    /**
     * Set the assignments interface
     * @param assignments Java interface
     */
    public void setAssignmentsInterface(AssignmentsInterface assignments)
    {
        this.assignments = assignments;
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
        // Get information from the session and return the view along with a list of the user's assignments
        HttpSession session = request.getSession();
        return new ModelAndView("assignments", "assignmentsList", assignments.listAssignments(session.getAttribute("username").toString()));
    }
}