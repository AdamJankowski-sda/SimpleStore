package interfaces;

import java.util.List;

public interface IDatabase {
    List<IUser> getUsers();
    List<IProduct> getProducts();

    void saveUsers(List<IUser> users);
    void saveProducts(List<IProduct> products);
}
