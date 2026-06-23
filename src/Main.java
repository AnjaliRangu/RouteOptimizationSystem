public class Main {

    public static void main(String[] args) {

        Graph g = new Graph();

        g.addCity("Hyderabad");
        g.addCity("Warangal");
        g.addCity("Vijayawada");
        g.addCity("Visakhapatnam");
        g.addCity("Tirupati");

        g.addRoad("Hyderabad", "Warangal", 150);
        g.addRoad("Hyderabad", "Vijayawada", 275);
        g.addRoad("Warangal", "Vijayawada", 130);
        g.addRoad("Vijayawada", "Visakhapatnam", 350);
        g.addRoad("Vijayawada", "Tirupati", 430);

        Dijkstra.shortestPath(
                g,
                "Hyderabad",
                "Visakhapatnam"
        );
    }
}
