package models;


import models.Menu;
import models.MenuItem;
import models.Order;
import enums.MeasurementType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    // Menu menu;
    Order order;
    private boolean leaveTip;

    public Client(Menu menu, boolean leaveTip) {
        //this.menu = menu;
        this.order = makeOrder(menu);
        this.leaveTip = leaveTip;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Order getOrder() {
        return order;
    }


    public boolean isLeaveTip() {
        return leaveTip;
    }

    public void setLeaveTip(boolean leaveTip) {
        this.leaveTip = leaveTip;
    }

    public Order makeOrder(Menu menu){


    public Order makeOrder(Menu menu){
        ArrayList<MenuItem> menuItemList = new ArrayList<>();
        menuItemList = menu.getMenuItemList();
        ArrayList<Product> productList = new ArrayList<>();
        Random rand = new Random();
        int orderID = rand.nextInt((1000 - 1) + 1) + 1;

        Order order = new Order( menuItemList);
    
        int numItems = rand.nextInt(menuItemList.size()) + 1;
        for (int i = 0; i < numItems; i++) {
            int randomIndex = rand.nextInt(menuItemList.size());
            MenuItem menuItem = menuItemList.get(randomIndex);
            menuItemList.add(menuItem);
            
        }
        return order;
    }

    public double getOrderBill(){
        return this.order.getBill();
    }

    @Override
    public String toString() {
        return "Client{" +
                ", order=" + order +
                '}';
    }




}
