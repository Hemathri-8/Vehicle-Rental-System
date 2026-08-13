import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);

    static String[] carId = {"C101", "C102"};
    static String[] carModel = {"Swift", "Baleno"};
    static String[] carNumber = {"KA01AB1234", "KA02CD5678"};
    static int[] carRent = {1500, 1800};
    static boolean[] carAvailable = {true, true};

    static String[] bikeId = {"B101", "B102"};
    static String[] bikeModel = {"Pulsar", "Activa"};
    static String[] bikeNumber = {"KA03EF1111", "KA04GH2222"};
    static int[] bikeRent = {700, 500};
    static boolean[] bikeAvailable = {true, true};

    static String customerId ;
    static String customerName;
    static String drivingLicense;

    static String rentedVehicleId = "";
    static String rentedVehicleModel = "";
    static String rentedVehicleNumber = " ";
    static String rentedCustomerId = "" ;

    static int customerNumber = 1001;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== VEHICLE RENTAL SYSTEM =====");
            System.out.println("1. Rent Vehicle");
            System.out.println("2. Return Vehicle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                rentVehicle();
            }
            else if (choice == 2) {
                returnVehicle();
            }
            else if (choice == 3) {
                System.out.println("Thank you for using Vehicle Rental System!");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }
    }

    static void rentVehicle() {
        System.out.println("\n----- RENT VEHICLE -----");

        customerId = "CUS" + customerNumber;
        customerNumber++;

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        while (true) {
            System.out.print("Enter Driving License Number (15 characters): ");
            drivingLicense = sc.nextLine();

            if (drivingLicense.length() == 15) {
                break;
            }
            else {
                System.out.println(
                        "DL number must contain exactly 15 characters."
                );
            }
        }

        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Enter choice: ");
        int type = sc.nextInt();

        if (type == 1) {
            rentCar();
        }
        else if (type == 2) {
            rentBike();
        }
        else {
            System.out.println("Invalid vehicle type!");
        }
    }

    static void rentCar() {
        System.out.println("\n----- AVAILABLE CARS -----");

        for (int i = 0; i < 2; i++) {
            System.out.println("\nVehicle " + (i + 1)+":-");
            System.out.println("Vehicle ID     : " + carId[i]);
            System.out.println("Model & Name   : " + carModel[i]);
            System.out.println("Vehicle Number : " + carNumber[i]);
            System.out.println("Rent Per Day   : Rs." + carRent[i]);
            System.out.println("Status         : " +
                    (carAvailable[i] ? "Available" : "Not Available"));
        }

        System.out.print("\nEnter Vehicle ID to rent: ");
        sc.nextLine();
        String id = sc.nextLine();

        for (int i = 0; i < 2; i++) {
            if (carId[i].equalsIgnoreCase(id)) {
                if (!carAvailable[i]) {
                    System.out.println("This car is already rented.");
                    return;
                }

                System.out.print("Enter number of days: ");
                int days = sc.nextInt();
                int totalRent = carRent[i] * days;
                carAvailable[i] = false;

                rentedVehicleId = carId[i];
                rentedVehicleModel = carModel[i];
                rentedVehicleNumber = carNumber[i];
                rentedCustomerId = customerId;

                displayFinalDetails(
                        carId[i],
                        carModel[i],
                        carNumber[i],
                        totalRent
                );
                return;
            }
        }
        System.out.println("Invalid Vehicle ID!");
    }

    static void rentBike() {
        System.out.println("\n----- AVAILABLE BIKES -----");

        for (int i = 0; i < 2; i++) {
            System.out.println("\nVehicle " + (i + 1)+":-");
            System.out.println("Vehicle ID     : " + bikeId[i]);
            System.out.println("Model & Name   : " + bikeModel[i]);
            System.out.println("Vehicle Number : " + bikeNumber[i]);
            System.out.println("Rent Per Day   : Rs." + bikeRent[i]);
            System.out.println("Status         : " +
                    (bikeAvailable[i] ? "Available" : "Not Available"));
        }

        System.out.print("\nEnter Vehicle ID to rent: ");
        sc.nextLine();
        String id = sc.nextLine();

        for (int i = 0; i < 2; i++) {
            if (bikeId[i].equalsIgnoreCase(id)) {
                if (!bikeAvailable[i]) {
                    System.out.println("This bike is already rented.");
                    return;
                }

                System.out.print("Enter number of days: ");
                int days = sc.nextInt();
                int totalRent = bikeRent[i] * days;
                bikeAvailable[i] = false;

                rentedVehicleId = bikeId[i];
                rentedVehicleModel = bikeModel[i];
                rentedVehicleNumber = bikeNumber[i];
                rentedCustomerId = customerId;

                displayFinalDetails(
                        bikeId[i],
                        bikeModel[i],
                        bikeNumber[i],
                        totalRent
                );
                return;
            }
        }
        System.out.println("Invalid Vehicle ID!");
    }

    static void displayFinalDetails(
            String vehicleId,
            String vehicleModel,
            String vehicleNumber,
            int totalRent) {

        System.out.println("\n===== RENTAL DETAILS =====");
        System.out.println("Customer ID     : " + customerId);
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Vehicle ID      : " + vehicleId);
        System.out.println("Vehicle Model   : " + vehicleModel);
        System.out.println("Vehicle Number  : " + vehicleNumber);
        System.out.println("Total Rent      : Rs." + totalRent);
        System.out.println("\nVehicle rented successfully!");
    }

    static void returnVehicle() {
        System.out.println("\n----- RETURN VEHICLE -----");
        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();

        if (!rentedCustomerId.equalsIgnoreCase(id)) {
            System.out.println("Customer ID not found!");
            return;
        }

        for (int i = 0; i < 2; i++) {
            if (carId[i].equalsIgnoreCase(rentedVehicleId)) {
                carAvailable[i] = true;
                System.out.println(
                        "Car " + carId[i] + " returned successfully!"
                );
                clearRentalDetails();
                return;
            }
        }

        for (int i = 0; i < 2; i++) {
            if (bikeId[i].equalsIgnoreCase(rentedVehicleId)) {
                bikeAvailable[i] = true;
                System.out.println(
                        "Bike " + bikeId[i] + " returned successfully!"
                );
                clearRentalDetails();
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    static void clearRentalDetails() {
        rentedVehicleId = "";
        rentedVehicleModel = "";
        rentedVehicleNumber = "";
        rentedCustomerId = "";
        System.out.println("Vehicle is now available for rent.");
    }
}