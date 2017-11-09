package objectMapping;

import java.util.Set;

public interface CreateAccountInterface {

    public void createAccount(String studentID, String firstName, String lastName, String username, String password, String email, Set classes);

    public boolean verifyUsername(String username);

    public boolean verifyPassword(String password, String confirmPassword);
}
