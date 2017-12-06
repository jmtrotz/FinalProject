package controllers;

// Import packages
import dataAccessObjects.PeopleInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * Controller for the people page
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class PeopleController implements Controller 
{
    private PeopleInterface people;
    /**
     * Set the grades interface
     * @param people Java interface
     */
    public void setPeopleInterface(PeopleInterface people)
    {
        this.people = people;
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
        // Return the view along with a list of the user's classmates
        return new ModelAndView("people", "peopleList", people.listPeople());
    }
}