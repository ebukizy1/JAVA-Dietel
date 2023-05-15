package chapter7;

import java.util.ArrayList;

public class ElectricalList {

private ArrayList<String> electricalItems = new ArrayList<String>();
public void addElectricalItems(String item){
    electricalItems.add(item);
}
public void printElectricalList() {
    System.out.println("you have " + electricalItems.size() + " item in your electrical shop");
    for (int i = 0; i < electricalItems.size(); i++) {
        System.out.println((i + 1) + electricalItems.get(i));
    }
}
    public void modifyElectricalItem(int position, String newItem) {
        electricalItems.set(position, newItem);
        System.out.println("electrical item " + (position + 1) + "has been modify");
    }
    public void removeElectricalItem(int position){
    String theItem = electricalItems.get(position);
    electricalItems.remove(position);
}
public String findItem(String searchItem){
   // boolean exists = electricalItems.contains(searchItem);
    int position = electricalItems.indexOf(searchItem);
    if(position>=0){
        return electricalItems.get(position);
    }
    return null;
}




}
