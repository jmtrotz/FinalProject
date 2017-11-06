package objectMapping;

// Generated Nov 4, 2017 5:04:48 PM by Hibernate Tools 4.3.1

import java.util.Set;

public class Student implements java.io.Serializable 
{
    private String studentID;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private Set classes;
    
    public Student()
    {
        
    }
    
    public Student(String studentID, String firstName, String lastName, 
            String username, String password, String email, Set classes)
    {
        this.studentID = studentID;
        this.firstName = firstName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.classes = classes;
    }
    
    public String getStudentID()
    {
        return studentID;
    }

    public void setStudentID(String studentID) 
    {
        this.studentID = studentID;
    }

    public String getFistName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }
    
    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public Set getClasses() 
    {
        return classes;
    }

    public void setClasses(Set classes) 
    {
        this.classes = classes;
    }
}