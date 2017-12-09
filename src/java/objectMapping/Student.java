package objectMapping;

/**
 * Class for creating a student POJO
 * @Class CT 406
 * @Date 11/29/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class Student implements java.io.Serializable 
{
    // Declare attributes used in this class
    private String studentID;
    private String firstName;
    private String lastName;    
    private String email;
    private String username;
    private String password;
    private String class1;
    private String class2;
    private String class3;
    private String class4;
    private String class5;
    private String class6;

    /**
     * Default constructor
     */
    public Student()
    {

    }

    /**
     * Overloaded constructor
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
     * @param class7
     */
    public Student(String studentID, String firstName, String lastName,
            String email,  String username, String password, String class1,
            String class2, String class3, String class4, String class5,
            String class6) 
    {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.class1 = class1;
        this.class2 = class2;
        this.class3 = class3;
        this.class4 = class4;
        this.class5 = class5;
        this.class6 = class6;
        
    }

    /**
     * Getter for studentID
     * @return Returns studentID as a String
     */
    public String getStudentID() 
    {
        return studentID;
    }

    /**
     * Setter for studentID
     * @param studentID Student's school issued student ID number
     */
    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }

    /**
     * Getter for firstName
     * @return Returns firstName as a String
     */
    public String getFirstName() 
    {
        return firstName;
    }

    /**
     * Setter for firstName
     * @param firstName Student's first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Getter for lastName
     * @return Returns lastName as a String
     */
    public String getLastName() 
    {
        return lastName;
    }

    /**
     * Setter for lastName
     * @param lastName Student's last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    /**
     * Getter for email
     * @return Returns email as a String
     */
    public String getEmail() 
    {
        return email;
    }

    /**
     * Setter for email
     * @param email Student's email address
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Getter for username
     * @return Returns username as a String
     */
    public String getUsername()
    {
        return username;
    }

    /**
     * Setter for username
     * @param username Username chosen by the student
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * Getter for password
     * @return Returns password as a String
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Setter for password
     * @param password Password chosen by the student
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    public String getClass2() {
        return class2;
    }

    public void setClass2(String class2) {
        this.class2 = class2;
    }

    public String getClass3() {
        return class3;
    }

    public void setClass3(String class3) {
        this.class3 = class3;
    }

    public String getClass4() {
        return class4;
    }

    public void setClass4(String class4) {
        this.class4 = class4;
    }

    public String getClass5() {
        return class5;
    }

    public void setClass5(String class5) {
        this.class5 = class5;
    }

    public String getClass6() {
        return class6;
    }

    public void setClass6(String class6) {
        this.class6 = class6;
    }
}