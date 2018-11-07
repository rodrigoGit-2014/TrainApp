package train;

import org.junit.Before;
import org.junit.Test;

public class DijkstraTest {

    private CityProcessor cityProcessor;


    @Before
    public void setUp() {
        cityProcessor = new CityProcessor();
    }

    @Test
    public void should_test() {

        Rutes rutes = initRoutes();
        cityProcessor.setRutes(rutes);
        City citySource = getCity('A');
        Dijkstra.calculateShortestPathFromSource(initRoutes(), citySource);
    }


    private City getCity(Character name) {
        return cityProcessor.getCity(name);
    }

    private Rutes initRoutes() {
        Rutes rutes = new Rutes();

        City cityA = new City('A', 0);
        City cityB = new City('B', 0);
        City cityC = new City('C', 0);
        City cityD = new City('D', 0);
        City cityE = new City('E', 0);


        cityA.setAdjacentNodes(cityB, 5);
        cityA.setAdjacentNodes(cityD, 5);
        cityA.setAdjacentNodes(cityE, 7);

        cityB.setAdjacentNodes(cityC, 4);

        cityC.setAdjacentNodes(cityD, 8);
        cityC.setAdjacentNodes(cityE, 2);

        cityD.setAdjacentNodes(cityC, 8);
        cityD.setAdjacentNodes(cityE, 6);

        cityE.setAdjacentNodes(cityB, 3);

        rutes.addRute(cityA);
        rutes.addRute(cityB);
        rutes.addRute(cityC);
        rutes.addRute(cityD);
        rutes.addRute(cityE);

        return rutes;
    }

}