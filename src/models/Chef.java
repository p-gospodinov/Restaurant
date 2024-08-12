package models;

import enums.MeasurementType;

import java.util.ArrayList;
import java.util.List;

public class Chef extends Employee {
    private List<Order> orders = new ArrayList<>();

    public Chef(String name, double salary) {
        super.setName(name);
        super.setSalary(salary);
    }
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    public void receiveOrder(List<Order> orders) {
        this.orders = orders;
    }

    public void prepareOrder() {


        List<List<MenuItem>> temp = new ArrayList<>();
        for (Order order : orders) {
            temp.add(order.getMenuItemList());
        }
        for (List<MenuItem> order : temp) {
            for(MenuItem menuItem : order) {
                for(Product product : menuItem.getProductList()){
                    product.setStoreQuantity(product.getStoreQuantity()-product.getQuantity());
                }
            }



            if(product.getMeasurementType() == MeasurementType.COUNT){

                    c = (int)product.getStoreq() - (int)product.getQuantity();
                    product.setStoreq(c);

            }
        }


    }


}
