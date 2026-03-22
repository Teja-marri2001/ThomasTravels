package com;

import java.util.ArrayList;
import java.util.List;

import com.model.Driver;
import com.service.Travel;

public class Test {
	
	
	public static void main(String[] args) {
		
		ArrayList<Driver> drivers = new ArrayList<Driver>();
		drivers.add(new Driver(1,"Fayaz","Lorry",3000.9));
		Driver driver = new Driver(2,"Sasi","Car",365.0);
		drivers.add(driver);
		Driver driver2 = new Driver(3,"Prashanth","Bus",897.90);
		drivers.add(driver2);
		drivers.add(new Driver(4,"Mohan","Car",206.78));
		drivers.add(new Driver(5,"Balram","Auto",789.09));
		drivers.add(new Driver(6,"DhanLakshmi","Scooty",897.10));
		drivers.add(new Driver(7,"meher","Car",345.90));
		
		
		
		Travel travel = new Travel();
		boolean isCarDriver = travel.isCarDriver(driver);
		System.out.println(isCarDriver);
		boolean isCarDriver2 = travel.isCarDriver(driver2);
		System.out.println(isCarDriver2);
		
		String retriveByDriverId = travel.retriveByDriverId(drivers, 5);
		System.out.println(retriveByDriverId);
		String retriveByDriverId2 = travel.retriveByDriverId(drivers, 15);
		System.out.println(retriveByDriverId2);
		
		
		long retriveCountOfDriver = travel.retriveCountOfDriver(drivers, "Scooty");
		System.out.println(retriveCountOfDriver);
		long retriveCountOfDriver2 = travel.retriveCountOfDriver(drivers, "Bike");
		System.out.println(retriveCountOfDriver2);
		
		List<Driver> retriveDriver = travel.retriveDriver(drivers, "scooty");
		System.out.println(retriveDriver);
		List<Driver> retriveDriver2 = travel.retriveDriver(drivers, "car");
		System.out.println(retriveDriver2);
		
		Driver driver3 = travel.retriveMaximumDistanceTravelledDriver(drivers);
		System.out.println(driver3);
		
	}

}
