package train;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Dijkstra {

    public static Rutes calculateShortestPathFromSource(Rutes routes, City city) {
        city.setDistance(0);

        Set<City> settledNodes = new HashSet<>();
        Set<City> unsettledNodes = new HashSet<>();

        unsettledNodes.add(city);

        while (unsettledNodes.size() != 0) {
            City currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<City, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                City adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }

            }
            settledNodes.add(currentNode);
        }


        return routes;
    }

    private static void calculateMinimumDistance(City evaluationNode,
                                                 Integer edgeWeigh, City sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<City> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    public static City getLowestDistanceNode(Set<City> unsettledNodes) {

        City lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (City nextCity : unsettledNodes) {
            int nodeDistance = nextCity.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = nextCity;
            }
        }
        return lowestDistanceNode;
    }


}
