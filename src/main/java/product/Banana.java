package product;

import interfaces.IProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Banana implements IProduct {
    private String Name;
    private Double Price;
    private Boolean IsDiscounted;
    private Double DiscountedPrice;
    private ProductType productType;
    private String imagePath;

    @Override
    public String toString(){
        return "Name: "+Name+", discount: "+IsDiscounted.toString()+", price: "+(IsDiscounted ? DiscountedPrice : Price);
    }
}
