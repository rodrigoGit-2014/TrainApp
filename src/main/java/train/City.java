package train;

import java.util.HashMap;
import java.util.Map;

public class City {

    private Character name;

    private int distance;

    private Map<City, Integer> adjacentNodes = new HashMap<>();

    public City(Character name, int distance) {
        this.name = name;
        this.distance = distance;
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
}
