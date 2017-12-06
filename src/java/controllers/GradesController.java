package controllers;

import dataAccessObjects.GradesInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

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

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}