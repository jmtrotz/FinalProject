package controllers;

// Import packages
import dataAccessObjects.MenuItemsInterface;
import java.util.HashMap;
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
        String redirectAddress = "";
        String modelName = "";
        HashMap<String, String> mapToReturn = new HashMap<>();      
        
        if (selectedButton.equalsIgnoreCase("grades")) 
        {
            redirectAddress = "grades";
            modelName = "gradeMap";
            mapToReturn = menuItems.listGrades(username, classViewed);
        }
        
        else if (selectedButton.equalsIgnoreCase("files"))
        {
            redirectAddress = "fileUpload";
        }
        
        else if (selectedButton.equalsIgnoreCase("people"))
        {
            redirectAddress = "people";
            modelName = "peopleMap";
            mapToReturn = menuItems.listPeople(classViewed);
        }
        
        // Return the new view and data
        return new ModelAndView(redirectAddress, modelName, mapToReturn);
    }   
}