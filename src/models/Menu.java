package models;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private ArrayList<MenuItem> menuItemList;

    public Menu() {
    }

    public Menu(ArrayList<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public ArrayList<MenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(ArrayList<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }


    @Override
    public String toString() {
        java.lang.String p = "";
        for (int i = 0; i < menuItemList.size();i++){
            p = p + menuItemList.get(i).toString();
        }
        return "Menu \n"  +
                "menuItemList=" + p
                ;
    }
}
