import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Graph g = new Graph();

        g.addCity("Hyderabad");
        g.addCity("Warangal");
        g.addCity("Vijayawada");
        g.addCity("Visakhapatnam");
        g.addCity("Tirupati");
        g.addCity("Khammam");
        g.addCity("Guntur");
        g.addCity("Nellore");
        g.addCity("Kurnool");
        g.addCity("Rajahmundry");

        g.addRoad("Hyderabad", "Warangal", 150);
        g.addRoad("Hyderabad", "Vijayawada", 275);
        g.addRoad("Warangal", "Vijayawada", 130);
        g.addRoad("Vijayawada", "Visakhapatnam", 350);
        g.addRoad("Vijayawada", "Tirupati", 430);
        g.addRoad("Warangal", "Khammam", 120);
        g.addRoad("Khammam", "Vijayawada", 100);
        g.addRoad("Vijayawada", "Guntur", 35);
        g.addRoad("Guntur", "Nellore", 280);
        g.addRoad("Nellore", "Tirupati", 130);
        g.addRoad("Kurnool", "Hyderabad", 220);
        g.addRoad("Rajahmundry", "Visakhapatnam", 190);
        g.addRoad("Vijayawada", "Rajahmundry", 150);

        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("\n===== ROUTE OPTIMIZATION SYSTEM =====");
        System.out.println("1. Find Shortest Route");
        System.out.println("2. Exit");

        System.out.print("Enter Choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        System.out.println("\n========== AVAILABLE CITIES ==========");

        System.out.println("Hyderabad");
        System.out.println("Warangal");
        System.out.println("Vijayawada");
        System.out.println("Visakhapatnam");
        System.out.println("Tirupati");
        System.out.println("Khammam");
        System.out.println("Guntur");
        System.out.println("Nellore");
        System.out.println("Kurnool");
        System.out.println("Rajahmundry");

        if (choice == 1) {
            System.out.print("\nEnter Source City: ");
            String source = sc.nextLine();
            
            System.out.print("Enter Destination City: ");
            String destination = sc.nextLine();
            if (!g.cityExists(source) || !g.cityExists(destination)) {
                System.out.println("\nInvalid city entered!");
            } else {
                Dijkstra.shortestPath(g, source, destination);
            }

        } else if (choice == 2) {
            System.out.println("Thank you for using Route Optimization System!");
        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}