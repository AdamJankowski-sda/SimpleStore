package interfaces;

import java.util.List;

public interface IStoreService {
    void addProduct(IProduct product);
    List<IProduct> getProducts();
    void removeProduct(IProduct product);
    Integer getProductQuantity();
}
