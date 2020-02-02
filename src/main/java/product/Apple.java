package product;

import interfaces.IProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apple implements IProduct {
    private String Name;
    private Double Price;
    private Boolean IsDiscounted;
    private Double DiscountedPrice;
    private Integer Quantity;
}