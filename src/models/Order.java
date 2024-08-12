package models;

import java.util.ArrayList;
public class Order {

    private List<MenuItem> menuItemList;
    private double bill;

    public Order(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
        this.bill = setBill();
    }


//    public int getID() {
//        return ID;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }

    public ArrayList<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(ArrayList<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public double getBill() {
        return bill;
    }

    public double setBill() {
        int billWithoutTip = 0;
        for(MenuItem item : menuItemList) {
            billWithoutTip += item.getPrice();
        }
        return billWithoutTip * 1.10;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", menuItemList=" + menuItemList +
                ", bill=" + bill +
                '}';
    }
}
