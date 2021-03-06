package dataAccessObjects;

/**
 * Interface for account creation methods
 * @Class CT 406
 * @Date 11/29/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public interface CreateAccountInterface
{
    /**
     * Method to add a student to the database
     * @param studentID Student's school issued student ID number
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param username Username chosen by the student
     * @param password Password chosen by the student
     * @param email Student's email address
     * @param class1
     * @param class2
     * @param class3
     * @param class4
     * @param class5
     * @param class6
     */
    public void createAccount(String studentID, String firstName, String lastName,
            String username, String password, String email, String class1,
            String class2, String class3, String class4, String class5,
            String class6);

    /**
     * Method to verify that a username isn't already in use
     * @param username Username chosen by the student
     * @return Returns true if the username is taken, returns false if it isn't
     */
    public boolean userExistsInDB(String username);
}