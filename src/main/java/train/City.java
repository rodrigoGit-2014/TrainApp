package train;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class City {

    private Character name;

    private int distance;

    private Map<City, Integer> adjacentNodes = new HashMap<>();

    private List<City> shortestPath = new LinkedList<>();

    public City(Character name) {
        this.name = name;
        this.distance = Integer.MAX_VALUE;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    public Map<City, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(City city, int distance) {
        this.adjacentNodes.put(city,distance);
    }

    public List<City> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<City> shortestPath) {
        this.shortestPath = shortestPath;
    }
}
