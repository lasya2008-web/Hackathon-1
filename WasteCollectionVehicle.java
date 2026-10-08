import java.util.Scanner;
public class WasteCollectionVehicle
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vehicle number: ");
        int vehicleNumber = scanner.nextInt();

        System.out.println("Enter waste collected (in kg) : ");
        double wasteCollected = scanner.nextDouble();

        System.out.println("ENter number of collection points: ");
        int collectionPoints = scanner.nextInt();

        System.out.println("Enter vehicle status");
        char vehicleStatus = scanner.next().charAt(0);

        System.out.println("/n---- Vehicle Details----");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste collected (kg): " + wasteCollected);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);
        scanner.close();
    }    
    
}