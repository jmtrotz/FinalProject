package controllers;

// Import packages
import dataAccessObjects.GradesInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller for the grades page
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class GradesController implements Controller
{
    private GradesInterface grades;

    /**
     * Set the grades interface
     * @param grades Java interface
     */
    public void setGradesInterface(GradesInterface grades)
    {
        this.grades = grades;
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
        // Get information from the session and return the view along with a list of the user's grades
        HttpSession session = request.getSession();
        return new ModelAndView("grades", "gradesList", grades.listGrades(session.getAttribute("username").toString()));
    }
}