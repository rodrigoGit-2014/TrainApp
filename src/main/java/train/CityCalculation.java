package train;

import java.util.Map;

public class CityCalculation {

    public int getRouteDistance(CityProcessor cityProcessor, String route) {

        char[] cities = route.toCharArray();

        int totalDistance = 0;

        City city = getCity(cities[0], cityProcessor);

        for (int index = 1; index < cities.length; index++) {

            int distance = getDistance(cities[index], city);

            if (distance != 0) {
                totalDistance += distance;
            } else {
                totalDistance = -1;
                break;
            }
            city = getCity(cities[index],cityProcessor);
        }

        return totalDistance;
    }


    public City getCity(Character cityName, CityProcessor cityProcessor) {
        for (City cityToSearch : cityProcessor.getRutes().getRoutes()) {
            if (cityToSearch.getName().equals(cityName)) {
                return cityToSearch;
            }
        }
        return null;
    }

    public int getDistance(Character cityName, City cityToStart) {
        int distance = 0;
        for (Map.Entry<City, Integer> adjacencyPair : cityToStart.getAdjacentNodes().entrySet()) {
            City adjacentNode = adjacencyPair.getKey();
            if (adjacentNode.getName().equals(cityName)) {
                return adjacencyPair.getValue();
            }
        }
        return distance;
    }
}
