package dataAccessObjects;

public interface LoginInterface
{
    public boolean verifyUsername (String username);
    public boolean verifyPassword (String username, String password);
}