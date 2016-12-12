package com.zfis.pojo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	public String city;
	
	public int inventory;
	public int inventoryAvailable;
	
	public int animalsCount;
	
    public List<Animal> animals;
	
	public Zoo(String city){
		this.city = city;
		this.animals = new ArrayList<Animal>();
	}
	
	public int getInventoryAvailable() {
		return inventoryAvailable;
	}

	public void setInventoryAvailable(int inventoryAvailable) {
		this.inventoryAvailable = inventoryAvailable;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public int getAnimalsCount() {
		return animalsCount;
	}

	public void setAnimalsCount(int animalsCount) {
		this.animalsCount = animalsCount;
	}
	
	public void addAnimalToList(Animal animal){
		this.animals.add(animal);
		
	}

	public boolean notifyVendors(){
		return true;
	}
	
	

}
