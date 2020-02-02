package database;

import interfaces.IDatabase;
import interfaces.IProduct;
import interfaces.IUser;
import product.Apple;
import product.Banana;
import user.User;

import java.util.ArrayList;
import java.util.List;

public class LocalDatabase implements IDatabase {


    @Override
    public List<IProduct> getProducts() {
        return new ArrayList<>(){{
            new Banana("Banana",4.50,false,3.50,500);
            new Apple("Apple",3.0,false,2.20,300);
        }};
    }

    @Override
    public List<IUser> getUsers() {
        return new ArrayList<>(){{
            new User("Adam","Nowak","jemstalnasniadanie123","123","0");
            new User("Bartosz","Nowak","moc123","qwe","1");
        }};
    }

    @Override
    public void saveProducts(List<IProduct> products) {

    }

    @Override
    public void saveUsers(List<IUser> users) {

    }
}
