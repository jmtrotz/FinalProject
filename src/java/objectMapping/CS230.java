package objectMapping;

public class CS230 implements java.io.Serializable 
{
    private String username;
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
    
    public CS230()
    {
        
    }
    
    public CS230(String username, String email, String assignment1, String assignment2, 
            String assignment3, String assignment4, String assignment5, String grade1,
            String grade2, String grade3, String grade4, String grade5)
    {
        this.username = username;
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
    
    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getAssignment1()
    {
        return assignment1;
    }

    public void setAssignment1(String assignment1)
    {
        this.assignment1 = assignment1;
    }

    public String getAssignment2()
    {
        return assignment2;
    }

    public void setAssignment2(String assignment2)
    {
        this.assignment2 = assignment2;
    }

    public String getAssignment3() 
    {
        return assignment3;
    }

    public void setAssignment3(String assignment3)
    {
        this.assignment3 = assignment3;
    }

    public String getAssignment4() 
    {
        return assignment4;
    }

    public void setAssignment4(String assignment4)
    {
        this.assignment4 = assignment4;
    }
    
    public String getAssignment5() 
    {
        return assignment5;
    }

    public void setAssignment5(String assignment5)
    {
        this.assignment5 = assignment5;
    }

    public String getGrade1()
    {
        return grade1;
    }

    public void setGrade1(String grade1) 
    {
        this.grade1 = grade1;
    }

    public String getGrade2()
    {
        return grade2;
    }

    public void setGrade2(String grade2) 
    {
        this.grade2 = grade2;
    }

    public String getGrade3() 
    {
        return grade3;
    }

    public void setGrade3(String grade3) 
    {
        this.grade3 = grade3;
    }

    public String getGrade4()
    {
        return grade4;
    }

    public void setGrade4(String grade4)
    {
        this.grade4 = grade4;
    }

    public String getGrade5() 
    {
        return grade5;
    }

    public void setGrade5(String grade5) 
    {
        this.grade5 = grade5;
    }
}