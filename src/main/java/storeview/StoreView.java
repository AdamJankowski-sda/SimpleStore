package storeview;

import interfaces.IProduct;
import interfaces.IStoreService;
import interfaces.IStoreView;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class StoreView implements IStoreView {

    private IStoreService storeService;

    @Override
    public void printProductList() {
        List<IProduct> products = storeService.getProducts();
        System.out.println("-----------------------");
    }
}
