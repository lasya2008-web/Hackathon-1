import java.util.Scanner;
public class WasteCollection
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter waste colleted in kg: ");
        double waste = scanner.nextDouble();
        if(waste >= 100)
        {
            System.out.println("Collected Target Achieved");
        }
        else 
        {
            System.out.println("More Waste Collection Required");
        }
        scanner.close();
    }  
    
    
}