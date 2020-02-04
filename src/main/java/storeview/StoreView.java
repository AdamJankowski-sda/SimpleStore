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

        int cellWidth = 20;
        int columns = 4;
        String lineBreak="";

        for(int i=0;i<columns * cellWidth + columns+1;i++)
            lineBreak+="-";

        System.out.println(lineBreak);

        String spaces="";

        System.out.print("|Nazwa Produktu");
        for (int i=0;i<cellWidth - "Nazwa Produktu".length();i++ )
            spaces+=" ";
        System.out.print(spaces);

        spaces="";
        System.out.print("|Ilosc");
        for (int i=0;i<cellWidth - "Ilosc".length();i++ )
            spaces+=" ";
        System.out.print(spaces);

        spaces="";
        System.out.print("|Promocja");
        for (int i=0;i<cellWidth - "Promocja".length();i++ )
            spaces+=" ";
        System.out.print(spaces);

        spaces="";
        System.out.print("|Cena");
        for (int i=0;i<cellWidth - "Cena".length();i++ )
            spaces+=" ";
        System.out.print(spaces+"|");
        System.out.println();
        System.out.println(lineBreak);

        products.forEach(product -> {
            String innerSpace="";

            System.out.print("|"+product.getName());
            for (int i=0;i<cellWidth - product.getName().length();i++ )
                innerSpace+=" ";
            System.out.print(innerSpace);

            innerSpace="";

            System.out.print("|"+product.getQuantity());
            for (int i=0;i<cellWidth - (""+product.getQuantity()).length();i++ )
                innerSpace+=" ";
            System.out.print(innerSpace);

            innerSpace="";
            System.out.print("|"+(product.getIsDiscounted() ? "TAK" : "NIE"));
            for (int i=0;i<cellWidth - (product.getIsDiscounted() ? "TAK" : "NIE").length();i++ )
                innerSpace+=" ";
            System.out.print(innerSpace);

            innerSpace="";
            System.out.print("|"+(product.getIsDiscounted() ? product.getDiscountedPrice() : product.getPrice()));
            for (int i=0;i<cellWidth - (""+(product.getIsDiscounted() ? product.getDiscountedPrice() : product.getPrice())).length();i++ )
                innerSpace+=" ";
            System.out.print(innerSpace);
            System.out.println("|");
        });

        System.out.println(lineBreak);
    }
}
