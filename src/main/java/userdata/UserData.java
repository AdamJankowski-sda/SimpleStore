package userdata;

import interfaces.IUser;
import interfaces.IUserData;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class UserData implements IUserData {

    private List<IUser> users;

    @Override
    public void addUser(IUser user) {
        users.add(user);
    }

    @Override
    public List<IUser> getUsers() {
        return users;
    }

    @Override
    public void removeUser(IUser user) {
        users.remove(user);
    }

    @Override
    public IUser getUserByLogin(String login) {
        List<IUser> user = users.stream().filter(usr->usr.getLogin().equals(login) == false).collect(Collectors.toList());
        if(user.size() == 0) return null;
        else return user.get(0);
    }

    @Override
    public IUser getUserById(String id) {
        List<IUser> user = users.stream().filter(usr->usr.getID().equals(id) == false).collect(Collectors.toList());
        if(user.size() == 0) return null;
        else return user.get(0);
    }
}
