# Thomas Travels - Java Project

##  Project Overview
Thomas Travels is a simple Java-based application designed to manage and automate driver-related operations in a travel service system.

This project demonstrates core Java concepts such as:
- Classes and Objects
- ArrayList
- Encapsulation
- Method implementation

## Problem Statement
The system manages driver details including:
- Driver ID
- Driver Name
- Category (Auto / Car / Lorry)
- Total Distance Travelled

The application performs operations like:
- Checking if a driver belongs to a specific category
- Retrieving driver details by ID
- Counting drivers by category
- Finding drivers based on category
- Identifying the driver with maximum distance travelled

---

##  Tech Stack
- Java
- IntelliJ IDEA / Eclipse
- OOP Concepts
- Collections Framework (ArrayList)

##  Project Structure

ThomasTravels/
│
├── src/
│ └── com/
│ ├── model/
│ │ └── Driver.java
│ ├── service/
│ │ └── Travel.java
│ └── Test.java
│
├── .idea/
├── .gitignore


  
---

##  Features

###  1. Check Driver Category
- Method: `isCarDriver(Driver driver)`
- Returns true if driver category is "Car"

---

###  2. Retrieve Driver by ID
- Method: `retrieveByDriverId(ArrayList<Driver>, driverId)`
- Returns formatted driver details

---

###  3. Count Drivers by Category
- Method: `retrieveCountOfDriver(ArrayList<Driver>, category)`
- Returns number of drivers in a category

---

###  4. Retrieve Drivers by Category
- Method: `retrieveDriver(ArrayList<Driver>, category)`
- Returns list of drivers in that category

---

###  5. Find Maximum Distance Driver
- Method: `retrieveMaximumDistanceTravelledDriver(ArrayList<Driver>)`
- Returns driver with highest distance

---

##  How to Run

1. Open project in IntelliJ / Eclipse
2. Make sure JDK is configured
3. Navigate to:
4. Run the file

## Sample Output

true
false
Driver name is Balram belonging to the category Auto traveled 789.09 KM so far

---

---

##  Future Improvements
- Add database integration (MySQL)
- Add user interface (GUI or Web)
- Add driver search and filtering
- Convert into Spring Boot application

---

##  Author
Teja Marri

---

##  If you like this project
Give it a ⭐ on GitHub!
