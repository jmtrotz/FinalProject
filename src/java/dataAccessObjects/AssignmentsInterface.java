package dataAccessObjects;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

/**
 * Interface for assignment listing methods
 * @Class CT 406
 * @Date 12/6/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public interface AssignmentsInterface 
{
    public ArrayList listAssignments(HttpServletRequest request);
}