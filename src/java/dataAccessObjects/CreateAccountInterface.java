package dataAccessObjects;

public interface CreateAccountInterface {

    public void createAccount(String studentID, String firstName, String lastName,
            String username, String password, String email, String class1,
            String class2, String class3, String class4, String class5,
            String class6, String class7);

    public boolean verifyUsername(String username);

    public boolean verifyPassword(String password, String confirmPassword);
}