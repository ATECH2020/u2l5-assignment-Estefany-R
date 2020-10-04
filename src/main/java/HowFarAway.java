import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double startinglat;
        double startinglong;
        double endinglat;
        double endinglong;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the latitude of the starting location: ");
        startinglat = scanner.nextDouble();
        System.out.print("Enter the longitude of the starting location: "); 
        startinglong = scanner.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        endinglat = scanner.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        endinglong = scanner.nextDouble();

        GeoLocation locStart = new GeoLocation(startinglat, startinglong);

        GeoLocation locEnd = new GeoLocation(endinglat, endinglong);
        double distance = locStart.distanceFrom(locEnd);
        System.out.println("The distance is " + distance +" miles");


        
    }
}