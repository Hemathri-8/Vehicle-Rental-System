# 🚗 Vehicle Rental System

A simple **Vehicle Rental System** developed in **Java** using basic programming concepts such as arrays, methods, loops, conditional statements, and user input using `Scanner`.

This project allows customers to **rent and return cars or bikes** through a console-based menu.

## 📌 Features

* 🚘 Rent a car
* 🏍️ Rent a bike
* 🔄 Return a rented vehicle
* 👤 Generate a unique Customer ID
* 🪪 Validate driving license number length
* 💰 Calculate total rental cost based on number of days
* ✅ Display vehicle availability status
* 🔍 Search vehicles using Vehicle ID
* 🚫 Prevent already-rented vehicles from being rented again
* 📋 Display complete rental details

## 🛠️ Technologies Used

* **Java**
* **Java Scanner**
* **Arrays**
* **Loops**
* **Conditional Statements**
* **Methods**
* **Boolean Variables**

## 📂 Project Structure

```text
Vehicle-Rental-System/
│
├── Main.java
└── README.md
```

## 🚘 Available Vehicles

### Cars

| Vehicle ID | Model  | Vehicle Number | Rent Per Day |
| ---------- | ------ | -------------- | ------------ |
| C101       | Swift  | KA01AB1234     | ₹1500        |
| C102       | Baleno | KA02CD5678     | ₹1800        |

### Bikes

| Vehicle ID | Model  | Vehicle Number | Rent Per Day |
| ---------- | ------ | -------------- | ------------ |
| B101       | Pulsar | KA03EF1111     | ₹700         |
| B102       | Activa | KA04GH2222     | ₹500         |

## ▶️ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/Hemathri-8/vehicle-rental-system.git
```

### 2. Open the Project

Open the project in any Java-supported IDE, such as:

* IntelliJ IDEA
* Eclipse
* NetBeans
* VS Code

### 3. Compile the Program

```bash
javac Main.java
```

### 4. Run the Program

```bash
java Main
```

## 💻 How the System Works

When the program starts, the following menu is displayed:

```text
===== VEHICLE RENTAL SYSTEM =====
1. Rent Vehicle
2. Return Vehicle
3. Exit
Enter your choice:
```

### 1️⃣ Rent Vehicle

The customer enters:

* Customer name
* Driving license number
* Vehicle type
* Vehicle ID
* Number of rental days

The system then calculates the total rent.

**Formula:**

```text
Total Rent = Rent Per Day × Number of Days
```

For example:

```text
Rent Per Day = ₹1500
Number of Days = 3

Total Rent = ₹1500 × 3
           = ₹4500
```

After a successful rental, the selected vehicle's availability is changed to `false`.

### 2️⃣ Return Vehicle

The customer enters their **Customer ID**.

The system checks whether the customer has a currently rented vehicle. If the customer ID is found, the vehicle is marked as available again.

Example:

```text
Enter Customer ID: CUS1001

Car C101 returned successfully!
Vehicle is now available for rent.
```

### 3️⃣ Exit

Selecting option `3` exits the program.

```text
Thank you for using Vehicle Rental System!
```

## 🧠 Core Java Concepts Demonstrated

This project demonstrates several important Core Java concepts.

### Arrays

Vehicle information is stored using arrays:

```java
static String[] carId = {"C101", "C102"};
static String[] carModel = {"Swift", "Baleno"};
static int[] carRent = {1500, 1800};
```

### Methods

The program is divided into separate methods:

```java
rentVehicle()
rentCar()
rentBike()
returnVehicle()
displayFinalDetails()
clearRentalDetails()
```

Using methods makes the program easier to understand and maintain.

### Boolean Availability

Vehicle availability is tracked using boolean arrays:

```java
static boolean[] carAvailable = {true, true};
static boolean[] bikeAvailable = {true, true};
```

* `true` → Vehicle is available
* `false` → Vehicle is currently rented

### Loops

`for` loops are used to search through available vehicles and find the vehicle selected by the customer.

### Conditional Statements

`if`, `else if`, and `else` statements are used to handle menu choices, vehicle types, availability, and validation.

### User Input

The `Scanner` class is used to receive input from the customer:

```java
static Scanner sc = new Scanner(System.in);
```

## 🧾 Sample Output

```text
===== VEHICLE RENTAL SYSTEM =====
1. Rent Vehicle
2. Return Vehicle
3. Exit
Enter your choice: 1

----- RENT VEHICLE -----

Enter Customer Name: Rahul

Enter Driving License Number (15 characters): ABCDE123456789XY

Select Vehicle Type:
1. Car
2. Bike
Enter choice: 1

----- AVAILABLE CARS -----

Vehicle 1:-
Vehicle ID     : C101
Model & Name   : Swift
Vehicle Number : KA01AB1234
Rent Per Day   : Rs.1500
Status         : Available

Vehicle 2:-
Vehicle ID     : C102
Model & Name   : Baleno
Vehicle Number : KA02CD5678
Rent Per Day   : Rs.1800
Status         : Available

Enter Vehicle ID to rent: C101
Enter number of days: 3

===== RENTAL DETAILS =====
Customer ID     : CUS1001
Customer Name   : Rahul
Vehicle ID      : C101
Vehicle Model   : Swift
Vehicle Number  : KA01AB1234
Total Rent      : Rs.4500

Vehicle rented successfully!
```

## ⚠️ Current Limitations

This is a **basic console-based Java project**, so it currently has some limitations:

* Vehicle data is stored only in arrays.
* Rental information is not stored permanently.
* The system currently handles one active rental record at a time.
* There is no graphical user interface.
* Payment processing is not implemented.
* Date-based rental tracking is not implemented.
* Customer records are not permanently stored.
* Data is lost when the program is closed.

## 🚀 Future Improvements

The project can be enhanced by adding:

* 🗄️ Database integration using MySQL
* 👥 Multiple customer management
* 📅 Rental and return dates
* 💳 Payment functionality
* 🖥️ GUI using Java Swing or JavaFX
* 🔐 Customer login and authentication
* 📊 Rental history
* 🔎 Advanced vehicle search
* 🧾 Invoice generation
* 🏢 Admin management system
* 💾 Permanent storage of customer and vehicle data

## 🎯 Learning Objective

The main objective of this project is to understand and implement **Core Java programming concepts** by developing a simple real-world application.

This project is suitable for beginners who want to practice:

```text
Variables
    ↓
Arrays
    ↓
Loops
    ↓
Conditional Statements
    ↓
Methods
    ↓
User Input
    ↓
Application Logic
```

## 👨‍💻 Author

**Hemathri-8**

GitHub: **[@Hemathri-8](https://github.com/Hemathri-8)**

If you found this project useful, feel free to ⭐ **star the repository**!

## 📄 License

This project is created for **educational and learning purposes**.
