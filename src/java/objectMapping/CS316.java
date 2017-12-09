package objectMapping;

/**
 * Class for creating a CS225 POJO
 * @Class CT 406
 * @Date 11/29/17
 * @authors Jeffrey Trotz & William Varner
 * @version 1.0
 */
public class CS316 implements java.io.Serializable
{
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String assignment1;
    private String assignment2;
    private String assignment3;
    private String assignment4;
    private String assignment5;
    private String grade1;
    private String grade2;
    private String grade3;
    private String grade4;
    private String grade5;

    /**
     * Default constructor
     */
    public CS316()
    {
        
    }
    
    /**
     * Overloaded constructor 1
     * @param username The student's username
     * @param firstName The student's first name
     * @param lastName The student's last name
     * @param email The student's email address
     */
    public CS316(String username, String firstName, String lastName, String email)
    {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    /**
     * Overloaded constructor 2
     * @param username The student's username
     * @param firstName The student's first name
     * @param lastName The student's last name
     * @param email The student's email address
     * @param assignment1 First assignment completed by the student
     * @param assignment2 Second assignment completed by the student
     * @param assignment3 Third assignment completed by the student
     * @param assignment4 Fourth assignment completed by the student
     * @param assignment5 Fifth assignment completed by the student
     * @param grade1 Grade for the first assignment
     * @param grade2 Grade for the second assignment
     * @param grade3 Grade for the third assignment
     * @param grade4 Grade for the fourth assignment
     * @param grade5 Grade for the fifth assignment
     */
    public CS316(String username, String firstName, String lastName, String email, 
            String assignment1, String assignment2, String assignment3, 
            String assignment4, String assignment5, String grade1, String grade2, 
            String grade3, String grade4, String grade5)
    {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
        this.assignment3 = assignment3;
        this.assignment4 = assignment4;
        this.assignment5 = assignment5;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.grade5 = grade5;
    }
    
    /**
     * Getter for username
     * @return Returns username as String
     */
    public String getUsername() 
    {
        return username;
    }

    /**
     * Setter for username
     * @param username Student's username
     */
    public void setUsername(String username)
    {
        this.username = username;
    }

    /**
     * Getter for fristName
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
     * Getter for assignment1
     * @return Returns assignment1 as a String
     */
    public String getAssignment1()
    {
        return assignment1;
    }

    /**
     * Setter for assignment1
     * @param assignment1 First assignment completed by the student
     */
    public void setAssignment1(String assignment1) 
    {
        this.assignment1 = assignment1;
    }

    /**
     * Getter for assignment2
     * @return Returns assignment2 as a String
     */
    public String getAssignment2() 
    {
        return assignment2;
    }

    /**
     * Setter for assignment2
     * @param assignment2 Second assignment completed by the student
     */
    public void setAssignment2(String assignment2)
    {
        this.assignment2 = assignment2;
    }

    /**
     * Getter for assignment3
     * @return Returns assignment3 as a String
     */
    public String getAssignment3() 
    {
        return assignment3;
    }

    /**
     * Setter for assignment3
     * @param assignment3 Third assignment completed by the student
     */
    public void setAssignment3(String assignment3) 
    {
        this.assignment3 = assignment3;
    }

    /**
     * Getter for assignment4
     * @return Returns assignment4 as a String
     */
    public String getAssignment4() 
    {
        return assignment4;
    }

    /**
     * Setter for assignment4
     * @param assignment4 Fourth assignment completed by the student
     */
    public void setAssignment4(String assignment4)
    {
        this.assignment4 = assignment4;
    }

    /**
     * Getter for assignment5
     * @return Returns assignment5 as a String
     */
    public String getAssignment5()
    {
        return assignment5;
    }

    /**
     * Setter for assignment5
     * @param assignment5 Fifth assignment completed by the student
     */
    public void setAssignment5(String assignment5)
    {
        this.assignment5 = assignment5;
    }

    /**
     * Getter for grade1
     * @return Returns grade1 as a String
     */
    public String getGrade1()
    {
        return grade1;
    }

    /**
     * Setter for grade1
     * @param grade1 Student's grade on assignment1
     */
    public void setGrade1(String grade1)
    {
        this.grade1 = grade1;
    }

    /**
     * Getter for grade2
     * @return Returns grade2 as a String
     */
    public String getGrade2() 
    {
        return grade2;
    }

    /**
     * Setter for grade2
     * @param grade2 Student's grade on assignment2
     */
    public void setGrade2(String grade2)
    {
        this.grade2 = grade2;
    }

    /**
     * Getter for grade3
     * @return Returns grade3 as a String
     */
    public String getGrade3()
    {
        return grade3;
    }

    /**
     * Setter for grade3
     * @param grade3 Student's grade on assignment3
     */
    public void setGrade3(String grade3) 
    {
        this.grade3 = grade3;
    }

    /**
     * Getter for grade4
     * @return Returns grade4 as a String
     */
    public String getGrade4() 
    {
        return grade4;
    }
    
    /**
     * Setter for grade4
     * @param grade4 Student's grade on assignment4
     */
    public void setGrade4(String grade4) 
    {
        this.grade4 = grade4;
    }

    /**
     * Getter for grade5
     * @return Returns grade5 as a String
     */
    public String getGrade5() 
    {
        return grade5;
    }

    /**
     * Setter for grade5
     * @param grade5 Student's grade on assignment5
     */
    public void setGrade5(String grade5) 
    {
        this.grade5 = grade5;
    }
}