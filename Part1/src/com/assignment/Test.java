package com.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Items {
	private int itemId;
	private String shortDescription;
	private double price;
	private String brand;

	public Items(int itemId, String shortDescription, double price, String brand) 
	{
		this.itemId = itemId;
		this.shortDescription = shortDescription;
		this.price = price;
		this.brand = brand;
	}

	public int getItemId() {
		return itemId;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public double getPrice() {
		return price;
	}

	public String getBrand() {
		return brand;
	}
}

public class Test {
	public static void main(String[] args) {
		List<Items> items = new ArrayList<>();
		items.add(new Items(1, "Item1", 50.0, "Nokia"));
		items.add(new Items(2, "Item2", 100.0, "BMW"));
		items.add(new Items(3, "Item3", 75.0, "Lenovo"));
		items.add(new Items(4, "Item4", 120.0, "Toshiba"));
		items.add(new Items(5, "Item5", 200.0, "Toyota"));
		items.add(new Items(6, "Item6", 170.0, "Samsung"));
		items.add(new Items(7, "Item7", 310.0, "TATA"));
		items.add(new Items(8, "Item8", 1000.0, "Apple"));
		items.add(new Items(9, "Item9", 110.0, "Hp"));
		items.add(new Items(10, "Item10", 270.0, "Dell"));

		List<Items> filteredAndSortedItems = items.stream().filter(item -> item.getBrand().startsWith("T"))
				.sorted((i1, i2) -> Double.compare(i2.getPrice(), i1.getPrice())).collect(Collectors.toList());

		filteredAndSortedItems.forEach(item -> System.out.println(
				item.getItemId() + " " + item.getPrice() + " " + item.getShortDescription() + " " + item.getBrand()));
	}
}
