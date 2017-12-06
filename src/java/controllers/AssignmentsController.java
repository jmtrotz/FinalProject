package controllers;

import dataAccessObjects.AssignmentsInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

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

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}