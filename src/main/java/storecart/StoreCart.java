package storecart;

import interfaces.IProduct;
import interfaces.IStoreCart;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class StoreCart implements IStoreCart {

    private List<IProduct> products;

    @Override
    public void addProductToCart(IProduct product) {
        products.add(product);
    }

    @Override
    public List<IProduct> getProducts() {
        return products;
    }

    @Override
    public Double getTotalPrice() {
        double sum = products
                .stream()
                .mapToDouble(product -> product.getIsDiscounted() ? product.getDiscountedPrice() : product.getPrice()).sum();
        return sum;
    }

    @Override
    public void removeProduct(IProduct product) {
        products.remove(product);
    }
}
