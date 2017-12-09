package controllers;

// Import packages
import dataAccessObjects.MenuItemsInterface;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

public class MenuItemsController implements Controller
{
    private MenuItemsInterface menuItems;

    /**
     * Set the grades interface
     * @param menuItems Java interface
     */
    public void setMenuItemsInterface(MenuItemsInterface menuItems)
    {
        this.menuItems = menuItems;
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
        String selectedButton = request.getParameter("button");  
        HttpSession session = request.getSession();
        String username = session.getAttribute("username").toString();
        String classViewed = session.getAttribute("classViewed").toString();
        ModelAndView modelAndView = new ModelAndView();
        
        if (selectedButton.equalsIgnoreCase("home"))
        {
            modelAndView = new ModelAndView("viewClasses", "classList", menuItems.listClasses(username));
        }
        
        else if (selectedButton.equalsIgnoreCase("grades")) 
        {
            modelAndView = new ModelAndView("grades", "gradeMap", menuItems.listGrades(username, classViewed));
        }
        
        else if (selectedButton.equalsIgnoreCase("files"))
        {
            modelAndView = new ModelAndView("fileUpload");
        }
        
        else if (selectedButton.equalsIgnoreCase("people"))
        {
            modelAndView = new ModelAndView("people", "peopleMap", menuItems.listPeople(classViewed));
        }
        
        // Return the new view and data
        return modelAndView;
    }   
}