import java.util.Scanner;

public class QueueController {

    public static void main(String[] args) {
        boolean isExit = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of vehicles in the Queue : ");
        int QueueLength = sc.nextInt();
        Queue fuelLine = new Queue(QueueLength);
        int choice;
        String vehicleNumber;
        while (!isExit) {
            System.out.println("----------------------------------------------------------");
            System.out.println("\t\t\tFuel Queue For Fuel Station");
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Add vehicle to the queue ");
            System.out.println("2. Remove vehicle from the queue");
            System.out.println("3. Search vehicle from the queue ");
            System.out.println("4. Display vehicle in queue");
            System.out.println("5. Exit program");
            System.out.println("----------------------------------------------------------");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            System.out.println("----------------------------------------------------------");
            switch (choice) {
                case 1:
                    //ADD Vehicle
                    System.out.print("Enter vehicle Name: ");
                    vehicleNumber = sc.next();
                    fuelLine.addVehicle(vehicleNumber);
                    break;
                case 2:
                    //Remove Vehicle
                    System.out.print("Enter vehicle Name: ");
                    vehicleNumber = sc.next();
                    fuelLine.removeVehicle(vehicleNumber);
                    break;
                case 3:
                    //Search Vehicles
                    System.out.print("Enter vehicle Name: ");
                    vehicleNumber = sc.next();
                    fuelLine.search(vehicleNumber);
                    break;
                case 4:
                    //Display Vehicles
                    fuelLine.displayQueue();
                    break;
                case 5:
                    isExit = true;
                    System.exit(-1);
                default:
                    System.out.println("Invalid choice! Try Again");

            }

        }
        sc.close();


    }

}
