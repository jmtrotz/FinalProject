package controllers;

// Import packages
import dataAccessObjects.MenuItemsInterface;
import java.util.ArrayList;
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
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception 
    {
        // Get parameters from the webpage
        String selectedButton = request.getParameter("button");
        String redirectAddress = "";
        String modelName = "";
        ArrayList<String> listToReturn = new ArrayList<>();
        HashMap<String, String> mapToReturn = new HashMap<>();
        
        HttpSession session = request.getSession();
        String username = session.getAttribute("username").toString();
        
        if (selectedButton.equalsIgnoreCase("grades")) 
        {
            redirectAddress = "grades";
            modelName = "gradeList";
            mapToReturn = menuItems.listGrades(username);
        }
        
        else if (selectedButton.equalsIgnoreCase("assignments"))
        {
            redirectAddress = "assignments";
            modelName = "assignmentList";
            listToReturn = menuItems.listAssignments(username);
        }
        
        else if (selectedButton.equalsIgnoreCase("files"))
        {
            redirectAddress = "fileUpload";
        }
        
        else if (selectedButton.equalsIgnoreCase("people"))
        {
            redirectAddress = "people";
            modelName = "peopleList";
            mapToReturn = menuItems.listPeople();
        }
        
        // Return the new view and data
        return new ModelAndView(redirectAddress, modelName, mapToReturn);
    }   
}