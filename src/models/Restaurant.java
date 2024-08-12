package models;


import enums.MeasurementType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Restaurant {
  
   private String name;
    private double initialBalance = 1000;
    //private Menu menu;


    public Restaurant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

//    public Menu getMenu() {
//        return menu;
//    }
//
//    public void setMenu(Menu menu) {
//        this.menu = menu;
//    }

    public static void main(String[] args) {

        Product product1 = new Product("flour", MeasurementType.KG, 0.250, 100000);
        Product product2 = new Product("tomato souse", MeasurementType.KG, 0.025, 1000);
        Product product3 = new Product("mozzarella", MeasurementType.KG, 0.025, 1000);
        Product product4 = new Product("mushrooms", MeasurementType.KG, 0.025, 1000);
        Product product5 = new Product("olives", MeasurementType.KG, 0.025, 1000);
        Product product6 = new Product("french mozzarella", MeasurementType.KG, 0.025, 1000);
        Product product7 = new Product(" spicy salami", MeasurementType.KG, 0.025, 1000);
        Product product8 = new Product(" bacon", MeasurementType.KG, 0.025, 1000);
        Product product9 = new Product(" spicy salami", MeasurementType.KG, 0.025, 1000);
        Product product10 = new Product(" sausage", MeasurementType.KG, 0.025, 1000);
        Product product11 = new Product(" ham", MeasurementType.KG, 0.025, 1000);
        Product product12 = new Product(" pineapple", MeasurementType.KG, 0.025, 1000);
        Product product13 = new Product(" pepper", MeasurementType.KG, 0.025, 1000);
        Product product14 = new Product(" onion", MeasurementType.KG, 0.025, 1000);
        Product product15 = new Product(" courgettes", MeasurementType.KG, 0.025, 1000);
        Product product16 = new Product(" tomato", MeasurementType.KG, 0.025, 1000);
        Product product17 = new Product(" Fanta", MeasurementType.COUNT, 1, 1000);
        Product product18 = new Product(" Coke", MeasurementType.COUNT, 1, 1000);
        Product product19 = new Product(" Beer", MeasurementType.COUNT, 1, 1000);


        System.out.println(product1.toString());
        ArrayList<Product> pizza1 = new ArrayList<>();

        pizza1.add(product1);
        pizza1.add(product2);
        pizza1.add(product3);

        ArrayList<Product> pizza2 = new ArrayList<>();
        pizza2.add(product1);
        pizza2.add(product4);
        pizza2.add(product5);
        pizza2.add(product6);
        pizza2.add(product7);
        ArrayList<Product> pizza3 = new ArrayList<>();
        pizza3.add(product1);
        pizza3.add(product8);
        pizza3.add(product3);
        pizza3.add(product2);
        ArrayList<Product> pizza4 = new ArrayList<>();
        pizza4.add(product1);
        pizza4.add(product9);
        pizza4.add(product10);
        pizza4.add(product3);
        pizza4.add(product2);

        ArrayList<Product> pizza5 = new ArrayList<>();
        pizza5.add(product1);
        pizza5.add(product11);
        pizza5.add(product12);
        pizza5.add(product4);
        pizza5.add(product7);
        pizza5.add(product3);
        ArrayList<Product> pizza6 = new ArrayList<>();
        pizza6.add(product1);
        pizza6.add(product12);
        pizza6.add(product13);
        pizza6.add(product7);
        pizza6.add(product7);
        pizza6.add(product3);
        ArrayList<Product> pizza7 = new ArrayList<>();
        pizza7.add(product1);
        pizza7.add(product14);
        pizza7.add(product15);
        pizza7.add(product16);
        pizza7.add(product7);
        ArrayList<Product> beverage1 = new ArrayList<>();
        beverage1.add(product17);
        ArrayList<Product> beverage2 = new ArrayList<>();
        beverage2.add(product18);
        ArrayList<Product> beverage3 = new ArrayList<>();
        beverage3.add(product19);
        MenuItem menuitem1 = new MenuItem(0, "Margarita", pizza1, 12.00);
        MenuItem menuitem2 = new MenuItem(1, "Vegeteriana", pizza2, 12.00);
        MenuItem menuitem3 = new MenuItem(2, "Peperoni", pizza3, 12.00);
        MenuItem menuitem4 = new MenuItem(3, "Diavolo", pizza4, 12.00);
        MenuItem menuitem5 = new MenuItem(4, "Valcha", pizza5, 12.00);
        MenuItem menuitem6 = new MenuItem(5, "Havai", pizza6, 12.00);
        MenuItem menuitem7 = new MenuItem(6, "Pomodore", pizza7, 12.00);
        MenuItem menuitem8 = new MenuItem(7, "Fanta", beverage1, 3.00);
        MenuItem menuitem9 = new MenuItem(8, "Coke", beverage2, 3.00);
        MenuItem menuitem10 = new MenuItem(9, "Beer", beverage3, 3.00);
        List<MenuItem> menuItem = new ArrayList<>();
        menuItem.add(menuitem1);
        menuItem.add(menuitem2);
        menuItem.add(menuitem3);
        menuItem.add(menuitem4);
        menuItem.add(menuitem5);
        menuItem.add(menuitem6);
        menuItem.add(menuitem7);
        menuItem.add(menuitem8);
        menuItem.add(menuitem9);
        menuItem.add(menuitem10);
        Menu menu = new Menu(menuItem);
//        String smeniitam = menuItem.toString();
//        System.out.println(smeniitam);
//        ArrayList<ArrayList<MenuItem>> menu = new ArrayList<>();
//        menu.add(menuItem);
//        String smenu = menu.toString();
//        System.out.println(smenu);

        String printMenu = menu.toString();
        System.out.println(printMenu);

        List<Client> clients = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            clients.add(new Client(menu,true));
        }

        Server server1 = new Server("Ivan", 1500);
        Server server2 = new Server("Maria", 1500);
        Server server3 = new Server("Stefan", 1800);
        Server server4 = new Server("Darina", 1800);

        Chef chef1 = new Chef("Georgi", 3000);
        Chef chef2 = new Chef("Spas", 3500);

        for (int i = 0; i < 4; i++) {
            server1.takeOrder(clients.get(i));
            server1.giveOrderToChef(chef1);
            chef1.prepareOrder();
        }

        for (int i = 4; i < 8; i++) {
            server2.takeOrder(clients.get(i));
            server2.giveOrderToChef(chef1);
            chef1.prepareOrder();
        }

        for (int i = 8; i < 12; i++) {
            server3.takeOrder(clients.get(i));
            server3.giveOrderToChef(chef2);
            chef2.prepareOrder();
        }

        for (int i = 12; i < 16; i++) {
            server4.takeOrder(clients.get(i));
            server4.giveOrderToChef(chef2);
            chef2.prepareOrder();
        }

        System.out.println(product1.toString());

        System.out.println("--------Menu--------");
        System.out.println("Product        Price");
        for (int i = 0; i < 10; i++) {
            System.out.println(menu.getMenuItemList().get(i).getName() +"     "+ menu.getMenuItemList().get(i).getPrice() + " lv.");
        }

        System.out.println();

        double totalIncome = 0;
        for(Client client : clients){
            totalIncome += client.getOrderBill();
        }
        System.out.println("The total income for the day is: " + String.format("%.2f",totalIncome));

        System.out.println();

        server1.printTips();
        server2.printTips();
        server3.printTips();
        server4.printTips();

        System.out.println();

        //int arrSize = menu.getMenuItemList().size();
        int[] numberOfPurchases = new int[10];
        List<Order> allOrders = new ArrayList<>();
        List<List<MenuItem>> order = new ArrayList<>();
        for(Client client : clients){
           allOrders.add(client.getOrder());
        }
        for(Order purchase : allOrders){
            order.add(purchase.getMenuItemList());
        }
        for(List<MenuItem> menuItemList : order){
            for(MenuItem menuItem1 : menuItemList){
                numberOfPurchases[menuItem1.getID()] ++;
            }
        }

        for (int i = 0; i < numberOfPurchases.length; i++) {
            System.out.println(menuItem.get(i).getName() + " has been ordered "  + numberOfPurchases[i] + " times!" );
        }

//        int[] sortedArr = new int[100];
//        sortedArr = numberOfPurchases;
//        Arrays.sort(sortedArr);
//        for (int i = 0; i < sortedArr.length; i++) {
//            System.out.println(sortedArr[i]);
//        }
//        int minValue = numberOfPurchases[0];
//        int counter = 0;
//        for (int i = 0; i < numberOfPurchases.length; i++) {
//            if(numberOfPurchases[i] < minValue){
//                minValue = numberOfPurchases[i];
//                counter++;
//            }
//        }
//
//        menuItem.remove(10-counter);

        //List<MenuItem> updatedMenu = new ArrayList<>();
//        for(MenuItem menuItem1 : menuItem){
//            System.out.println(menuItem1.getName());
//        }

        int index = 0;
        int min = numberOfPurchases[0];
        for (int i = 0; i < numberOfPurchases.length; i++) {
            if(numberOfPurchases[i] <= min){
                min = numberOfPurchases[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("The new menu looks like this:");
        Collections.swap(menuItem, index,10);
        for (int i = 0; i < 9; i++) {
            System.out.println(menuItem.get(i).getName());
        }

        System.out.println();

        System.out.println(product1.toString());
        System.out.println(product2.toString());
        System.out.println(product3.toString());
        System.out.println(product4.toString());
        System.out.println(product5.toString());
        System.out.println(product6.toString());
        System.out.println(product7.toString());
        System.out.println(product8.toString());
        System.out.println(product9.toString());
        System.out.println(product10.toString());
        System.out.println(product11.toString());
        System.out.println(product12.toString());
        System.out.println(product13.toString());
        System.out.println(product14.toString());
        System.out.println(product15.toString());
        System.out.println(product16.toString());
        System.out.println(product17.toString());
        System.out.println(product18.toString());
        System.out.println(product19.toString());

    }
}
