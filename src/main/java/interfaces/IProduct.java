package interfaces;

import product.ProductType;

public interface IProduct {
    String getName();
    Double getPrice();
    Boolean getIsDiscounted();
    Double getDiscountedPrice();
    ProductType getProductType();
    String getImagePath();
}
