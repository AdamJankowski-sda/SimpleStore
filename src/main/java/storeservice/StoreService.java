package storeservice;

import interfaces.IProduct;
import interfaces.IStoreService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class StoreService implements IStoreService {

    private List<IProduct> products;

    @Override
    public void addProduct(IProduct product) {
        products.add(product);
    }

    @Override
    public List<IProduct> getProducts() {
        return products;
    }

    @Override
    public void removeProduct(IProduct product) {
        products.remove(product);
    }

    @Override
    public Integer getProductQuantity() {
        return products.size();
    }
}
