package com.zfis.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zfis.pojo.Animal;
import com.zfis.pojo.Zoo;

public class ZooManagerImpl {
	
	public Map<String,Zoo> listOfZoos = new HashMap();
	
	
	
	public void setAnimalPerZooPerFeedByIntervals(String city, String animalName, int feedRequired, int numIntervals) {
		
		List<Animal> animalsPerzoo = new ArrayList<Animal>();
		Zoo zoo = (Zoo)listOfZoos.get(city);
		
		Animal animal1 = new Animal(animalName);
		animal1.setFeedRequired(feedRequired);
		animal1.setInterval(numIntervals);
		
		zoo.addAnimalToList(animal1);
		
	}
	
	public void populateZoos(){

		Zoo zoo1 = new Zoo("SF");
		zoo1.setAnimalsCount(2);
		listOfZoos.put("SF",zoo1);
		
		Zoo zoo2 = new Zoo("NY");
		zoo2.setAnimalsCount(200);
		listOfZoos.put("NY",zoo2);
		
		
	}
	
	public void setShippmentPerZoo(String city,int numOfFeeds ) {
		
		Zoo zoo = (Zoo)listOfZoos.get(city);
		zoo.setInventory(numOfFeeds);
	}
	
	public void listInventoryPerZoo(){
		for (Map.Entry<String, Zoo> entry : this.listOfZoos.entrySet()) {
			
			String city = entry.getKey();
			Zoo zoo = (Zoo) entry.getValue();
	
			System.out.println("City : " + zoo.city + " animalsCount : " + zoo.animalsCount + " inventory: "+zoo.inventory + " inventoryAvailable "+zoo.inventoryAvailable);
			for(Animal animal : zoo.animals) {
				System.out.println("Zoo City : " + zoo.city +" Animal Name : "+animal.name + " Animal Feed Required "+animal.feedRequired +" Animal Feed Intervals :"+animal.interval);
			}
		}
		
		
	}

	public double avgFeedPerDayByAnimalByZoo(String city){

		int totalNumOfFeeds = 0;
		int animalCount =0 ;
		for (Map.Entry<String, Zoo> entry : this.listOfZoos.entrySet()) {
			
			if(city.equalsIgnoreCase( entry.getKey() ) ){
				Zoo zoo = (Zoo) entry.getValue();
				int numOfAnimals = zoo.animals.size();
				
				for(Animal animal : zoo.animals) {
					int numfeeds = animal.feedRequired * animal.interval;
					totalNumOfFeeds = totalNumOfFeeds + numfeeds;
					animalCount++;
				}
				
			}
		}
		
		return (totalNumOfFeeds/animalCount);
		
		
	}
	
}
