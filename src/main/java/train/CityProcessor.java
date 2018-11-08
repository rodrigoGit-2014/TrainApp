package train;

import static train.TrainConstants.SEPARATOR;

public class CityProcessor {


    private Rutes rutes;

    public CityProcessor() {

        initRoute();
        initRoutes();
    }

    private void initRoute() {
        rutes = new Rutes();
    }

    private void initRoutes() {
        Cities[] listOfCities = Cities.values();
        for (Cities ct : listOfCities) {
            City city = new City(ct.name().charAt(0));
            rutes.addRute(city);
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
        for (City cityToSearch : rutes.getRoutes()) {
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

    public void setRutes(Rutes rutes) {
        this.rutes = rutes;
    }

    public Rutes getRutes() {
        return this.rutes;
    }
}
