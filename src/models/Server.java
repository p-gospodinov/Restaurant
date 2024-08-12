package models;

import java.util.ArrayList;
import java.util.List;

public class Server extends Employee {

    private double tips;
    private List<Order> orders;

    public Menu menu;

    public Server(String name, double salary){
        this.orders = new ArrayList<>();
        super.setName(name);
        super.setSalary(salary+getTips());
        //this.menu = menu;
    }
    public void setTips(double tips) {
        this.tips = tips;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public double getTips(){
        double turnover = 0;
        for(Order order : orders){
            turnover += order.getBill();
        }
        return turnover * 0.10;
    }

    public void printTips(){
        System.out.println("Server " + super.getName() + " collected " + String.format("%.2f",getTips()) + " in tips for the day!");
    }

    public void giveOrderToChef(Chef chef){
        chef.receiveOrder(orders);
    }
    public void takeOrder(Client client){
        orders.add(client.getOrder());
    }

    }

