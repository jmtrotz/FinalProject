package dataAccessObjects;

/**
 * Interface for login methods
 * @Class CT 406
 * @Date 11/29/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public interface LoginInterface
{
    /**
     * Method to verify that a username actually exists in the database
     * @param username Username entered into the login form
     * @return Returns true if the username exists, returns false if it doesn't
     */
    public boolean userExistsInDB (String username);
    
    /**
     * Method to verify that a password matches its username
     * @param username Username entered into the login form
     * @param password Password entered into the login form
     * @return Returns true if the password and username don't match, false if they don't
     */
    public boolean passwordMatchesUsername (String username, String password);
}