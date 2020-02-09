package database;

import interfaces.IDatabase;
import interfaces.IProduct;
import interfaces.IUser;
import product.Apple;
import product.Banana;
import product.ProductType;
import user.User;

import java.util.ArrayList;
import java.util.List;

public class LocalDatabase implements IDatabase {


    @Override
    public List<IProduct> getProducts() {
        return new ArrayList<>(){{
            add(new Banana("Banana",4.50,false,3.50, ProductType.Banana,"C:\\Users\\adico\\OneDrive\\Pulpit\\Files\\TacticalFolder\\fotsy\\praca.png"));
            add(new Banana("Banana",4.50,false,3.50, ProductType.Banana,"C:\\Users\\adico\\OneDrive\\Pulpit\\Files\\TacticalFolder\\fotsy\\praca.png"));
            add(new Banana("Banana",4.50,false,3.50, ProductType.Banana,"C:\\Users\\adico\\OneDrive\\Pulpit\\Files\\TacticalFolder\\fotsy\\praca.png"));
            add(new Banana("Banana",4.50,false,3.50, ProductType.Banana,"C:\\Users\\adico\\OneDrive\\Pulpit\\Files\\TacticalFolder\\fotsy\\praca.png"));
            add(new Apple("Apple",3.0,true,2.20,ProductType.Apple,"C:\\Users\\adico\\OneDrive\\Pulpit\\Files\\TacticalFolder\\img\\petscards\\PetsCards_png\\pet_a_hen1.png"));
            add(new Apple("Apple",3.0,true,2.20,ProductType.Apple,"C:\\Users\\adico\\OneDrive\\Pulpit\\Files\\TacticalFolder\\img\\petscards\\PetsCards_png\\pet_a_hen1.png"));
        }};
    }

    @Override
    public List<IUser> getUsers() {
        return new ArrayList<>(){{
            add(new User("Adam","Nowak","jemstalnasniadanie123","123","0"));
            add(new User("Bartosz","Nowak","moc123","qwe","1"));
        }};
    }

    @Override
    public void saveProducts(List<IProduct> products) {

    }

    @Override
    public void saveUsers(List<IUser> users) {

    }
}
