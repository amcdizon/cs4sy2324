import java.util.ArrayList;

public class Store {
	private String name;
  	private double earnings;
  	private ArrayList<Item> itemList;
	private static ArrayList<Store> storeList = new ArrayList();

  	public Store(String name){
    	this.name = name;
    	itemList = new ArrayList<Item>();
    	storeList.add(this);
  	}

	public String getName(){
	    return name;
	}
	public double getEarnings(){
	    return earnings;
	}
	public void sellItem(int index){
		if(index < itemList.size()){
			earnings += itemList.get(index).getCost();
			System.out.printf(itemList.get(index).getName() + " sold for $%.2f\n", itemList.get(index).getCost());
	  	}
		else {
			System.out.println("There are only " + itemList.size() + " items in the store.");
		}
	}
	public void sellItem(String name){
		boolean found = false;
		for(Item i : itemList) {
			if(i.getName().equals(name)){
				earnings += i.getCost();
				System.out.printf(i.getName() + " sold for $%.2f\n", i.getCost());
				break;
			}
		}
		if(!found) {System.out.println("The store does not sell " + name);}
	}
	public void sellItem(Item i){
		if(itemList.contains(i)){
			earnings += i.getCost();
			System.out.printf(i.getName() + " sold for $%.2f\n", i.getCost());
		}
		else {
			System.out.println("The store does not sell " + i.getName());
		}
	}
	public void addItem(Item i){
		itemList.add(i);
	}
	public void filterType(String type){
		for(Item i : itemList) {
			if(i.getType().equals(type)) {
				System.out.println(i.getName());
			}
		}
	}
  	public void filterCheap(double maxCost){
		for(Item i : itemList) {
			if(i.getCost() <= maxCost) {
				System.out.println(i.getName());
			}
		}
	}
	public void filterExpensive(double minCost){
		for(Item i : itemList) {
			if(i.getCost() >= minCost) {
				System.out.println(i.getName());
			}
		}
	}
	public static void printStats(){
		for(Store s : storeList) {
			System.out.println(s.getName() + ": " + s.getEarnings());
		}
	}
}
