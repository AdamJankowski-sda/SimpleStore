package interfaces;

import java.util.List;

public interface IStoreCart {
    void addProductToCart(IProduct product);
    List<IProduct> getProducts();
    Double getTotalPrice();
    void removeProduct(IProduct product);
}
