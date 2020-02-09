package applications;

import database.LocalDatabase;
import interfaces.*;
import storecart.StoreCart;
import storeservice.StoreService;
import userdata.UserData;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SwingApp implements IApplication {


    private JFrame frame;
    private JLabel label;
    IDatabase database = new LocalDatabase();
    IStoreService storeService = new StoreService(database.getProducts());
    IStoreCart storeCart = new StoreCart(new ArrayList<>());
    IUserData userData = new UserData(database.getUsers());

    public SwingApp(){

        frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        addComponentsToPane(panel);

        label = new JLabel("Output");
        frame.add(label);
        frame.add(panel);


    }

    @Override
    public void run() {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGUI();
            }
        });
    }


    private void showGUI() {
        //frame.getContentPane().add(label);
        frame.pack();
        frame.setVisible(true);
    }


    public void addComponentsToPane(Container pane)
    {
        //pane.removeAll();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx=0;
        constraints.gridy=0;
        pane.add(new JLabel("Name"),constraints);

        constraints.gridx=1;
        constraints.gridy=0;
        pane.add(new JLabel("Discount"),constraints);

        constraints.gridx=2;
        constraints.gridy=0;
        pane.add(new JLabel("Price"),constraints);

        List<IProduct> productList = storeService.getProducts();

        for(int i=0;i<productList.size();i++)
        {
            IProduct product = productList.get(i);

            int y = i+1;

            constraints.gridx=0;
            constraints.gridy=y;
            pane.add(new JLabel(product.getName()),constraints);

            constraints.gridx=1;
            constraints.gridy=y;
            pane.add(new JLabel(product.getIsDiscounted().toString()),constraints);

            constraints.gridx=2;
            constraints.gridy=y;
            pane.add(new JLabel((product.getIsDiscounted()?product.getDiscountedPrice():product.getPrice()).toString()),constraints);


            try {
                BufferedImage myPicture = ImageIO.read(new File(product.getImagePath()));
                Image image = myPicture.getScaledInstance(myPicture.getWidth()/5,myPicture.getHeight()/5,BufferedImage.SCALE_DEFAULT);
                constraints.gridx=3;
                constraints.gridy=y;
                JLabel picLabel = new JLabel(new ImageIcon(image));
                pane.add(picLabel,constraints);
            }
            catch (IOException ioex){
                System.out.println(ioex.getMessage());
            }



            JButton addToCartButton = new JButton("Add to Cart");
            addToCartButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    storeCart.addProductToCart(product);
                    productList.remove(product);
                    frame.setTitle(product.toString());

                    pane.repaint();
                }
            });
            constraints.gridx=4;
            constraints.gridy=y;
            pane.add(addToCartButton,constraints);

        }

    }




}
