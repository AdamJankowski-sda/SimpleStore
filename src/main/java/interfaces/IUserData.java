package interfaces;

import java.util.List;

public interface IUserData {
    void addUser(IUser user);
    List<IUser> getUsers();
    void removeUser(IUser user);
    IUser getUserByLogin(String login);
    IUser getUserById(String id);
}
