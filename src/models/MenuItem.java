package models;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {

    private int ID;
    private String name;


    private ArrayList<Product> productList;

    private double price;

    public MenuItem() {
    }


    public MenuItem( int ID, String name, List<Product> productList, double price) {
        this.ID = ID;
        this.name = name;
        this.productList = productList;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        java.lang.String p = "";
        for (int i = 0; i < productList.size();i++){
            p = p + productList.get(i).toString();
        }

        return "MenuItem \n" +
                "name=" + name + "\n"  +
                " productList=" + p + "\n" +
                " price=" + price
                ;
    }
}
