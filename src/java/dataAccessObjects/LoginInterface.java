package dataAccessObjects;

public interface LoginInterface
{
    public boolean userExistsInDB (String username);
    public boolean passwordMatchesUsername (String username, String password);
}