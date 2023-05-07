package model;

import java.util.HashMap;

public class RestaurantMenu {
	HashMap<String, Dish> restaurantMenu;

	private static RestaurantMenu instance;

	public static RestaurantMenu getRestaurantMenu(HashMap<String, Dish> restaurantMenu) {
		if (instance == null) {
			instance = new RestaurantMenu(restaurantMenu);
		}
		return instance;
	}
	private RestaurantMenu(HashMap<String, Dish> restaurantMenu) {
		this.restaurantMenu = restaurantMenu;
	}
	public HashMap<String, Dish> getInstance() {
		return restaurantMenu;
	}
	public void printKeys() {
		int numeral=1;
		for (String Dishname : restaurantMenu.keySet()) {
			int price = restaurantMenu.get(Dishname).getPrice();
			System.out.println(Integer.toString(numeral)+ Dishname + ", Precio:  " + Integer.toString(price));
			numeral=numeral+1;
		}
	}
	public Dish getDish(String dishName) {
		return restaurantMenu.get(dishName);
	}
	public void updateService(String dishName,Dish updatedDish) {
		restaurantMenu.put(dishName,updatedDish);
	}
	
}

