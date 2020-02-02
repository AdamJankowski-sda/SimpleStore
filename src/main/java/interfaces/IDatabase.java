package interfaces;

import java.util.List;

public interface IDatabase {
    List<IProduct> getProducts();
    List<IUser> getUsers();

    void saveProducts(List<IProduct> products);
    void saveUsers(List<IUser> users);
}
