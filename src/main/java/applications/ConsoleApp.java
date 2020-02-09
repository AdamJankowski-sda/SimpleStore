package applications;

import cartview.CartView;
import database.LocalDatabase;
import interfaces.*;
import storecart.StoreCart;
import storeservice.StoreService;
import storeview.StoreView;
import userdata.UserData;

import java.util.ArrayList;

public class ConsoleApp implements IApplication {
    @Override
    public void run() {
        IDatabase database = new LocalDatabase();
        IStoreService storeService = new StoreService(database.getProducts());
        IUserData userData = new UserData(database.getUsers());

        IStoreCart storeCart = new StoreCart(new ArrayList<>(){{add(storeService.getProducts().get(0));}});

        IStoreView storeView = new StoreView(storeService);
        ICartView cartView = new CartView(storeCart);

        System.out.println("Sklep");
        storeView.printProductList();

        System.out.println("Kosz");
        cartView.printProductList();
    }
}
