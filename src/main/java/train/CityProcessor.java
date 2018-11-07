package train;

import java.util.HashSet;
import java.util.Set;

import static train.TrainConstants.SEPARATOR;

public class CityProcessor {

    private Set<City> ruteGraph = new HashSet<>();

    public CityProcessor() {

        Cities[] listOfCities = Cities.values();
        for (Cities ct : listOfCities) {
            City city = new City(ct.name().charAt(0), 0);
            ruteGraph.add(city);
        }
    }

    public void processor(String rutes) {

        String[] multiRutes = getRutes(rutes);

        for (String rute : multiRutes) {
            City sourceCity = getCity(getElement(rute, 0));
            City destineCity = getCity(getElement(rute, 1));
            int distance = Character.getNumericValue(getElement(rute, 2));
            connectCities(sourceCity, destineCity, distance);
        }

    }

    private void connectCities(City source, City destine, int distance) {
        source.setAdjacentNodes(destine, distance);
    }

    public City getCity(Character cityName) {
        for (City cityToSearch : ruteGraph) {
            if (cityToSearch.getName().equals(cityName)) {
                return cityToSearch;
            }
        }
        return null;
    }


    private Character getElement(String cities, int index) {
        return cities.trim().charAt(index);
    }

    private String[] getRutes(String pathOfCities) {
        return pathOfCities.split(SEPARATOR);
    }
}
