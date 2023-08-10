package GeoPoliticalZones;

import java.util.Scanner;

public class GeoPoliticalZoneApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a state: ");
        String userState = scanner.nextLine();

        GeoPoliticalZone zone = findGeoPoliticalZone(userState);
        if (zone != null) {
            System.out.println(zone);
        } else {
            System.out.println("State not found in any geopolitical zone.");
        }
    }

    private static GeoPoliticalZone findGeoPoliticalZone(String state) {
        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            if (zone.containsState(state)) {
                return zone;
            }
        }
        return null;
    }
}