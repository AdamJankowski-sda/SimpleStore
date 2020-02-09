package cartview;

import interfaces.ICartView;
import interfaces.IProduct;
import interfaces.IStoreCart;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class CartView implements ICartView {

    private IStoreCart storeCart;

    @Override
    public void printProductList() {
        int cellLength = 20;
        String breakLine = "";
        int columns = 3;

        List<IProduct> products = storeCart.getProducts();

        for(int i=0;i< cellLength*columns + columns+1;i++)
            breakLine+="-";

        System.out.println(breakLine);

        System.out.print("|Nazwa Produktu");
        String spaces="";
        for(int i=0;i<cellLength-"Nazwa Produktu".length();i++)
            spaces+=" ";
        System.out.print(spaces);
        System.out.print("|Ilosc");
        spaces="";
        for(int i=0;i<cellLength-"Ilosc".length();i++)
            spaces+=" ";
        System.out.print(spaces);
        System.out.print("|Cena");
        spaces="";
        for(int i=0;i<cellLength-"Cena".length();i++)
            spaces+=" ";
        System.out.print(spaces+"|");
        System.out.println();
        System.out.println(breakLine);

//        HEADER - END

        products.forEach(product->{

            String innerSpaces = "";
            System.out.print("|"+product.getName());
            for(int i=0;i<cellLength-product.getName().length();i++)
                innerSpaces+=" ";
            System.out.print(innerSpaces);

            innerSpaces = "";
            System.out.print("|"+1);
            for(int i=0;i<cellLength-(1+"").length();i++)
                innerSpaces+=" ";
            System.out.print(innerSpaces);

            innerSpaces = "";
            System.out.print("|"+(product.getIsDiscounted() == true ? product.getDiscountedPrice():product.getPrice()));
            for(int i=0;i<cellLength-(1+"").length();i++)
                innerSpaces+=" ";
            System.out.print(innerSpaces+"|");
            System.out.println();
        });
        System.out.println(breakLine);
    }
}
