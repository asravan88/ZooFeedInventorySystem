package com.zfis.manager;


public class FeedInvetorySystem {

	public static void main(String[] args) {
		ZooManagerImpl zmi = new ZooManagerImpl();
		zmi.populateZoos();
		zmi.setAnimalPerZooPerFeedByIntervals("SF", "tiger", 2,5);
		zmi.setAnimalPerZooPerFeedByIntervals("SF", "Lion", 3,5);
		
		zmi.setAnimalPerZooPerFeedByIntervals("NY", "elephant", 10,5);
		zmi.setAnimalPerZooPerFeedByIntervals("NY", "Lion", 3,5);

		zmi.setShippmentPerZoo("SF", 800);
		zmi.setShippmentPerZoo("NY", 100);
		
		
		zmi.listInventoryPerZoo();
		
		
		
	}
	
	
	

}
