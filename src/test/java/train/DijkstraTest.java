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
        System.out.println();
    }


    private City getCity(Character name) {
        return cityProcessor.getCity(name);
    }

    private Rutes initRoutes() {
        Rutes rutes = new Rutes();

/*
        City cityA = new City('A', 0);
        City cityB = new City('B', Integer.MAX_VALUE);
        City cityC = new City('C', Integer.MAX_VALUE);
        City cityD = new City('D', Integer.MAX_VALUE);
        City cityE = new City('E', Integer.MAX_VALUE);
        City cityF = new City('F', Integer.MAX_VALUE);


        cityA.setAdjacentNodes(cityB, 10);
        cityA.setAdjacentNodes(cityC, 15);

        cityB.setAdjacentNodes(cityD, 12);
        cityB.setAdjacentNodes(cityF, 15);

        cityC.setAdjacentNodes(cityE, 10);

        cityD.setAdjacentNodes(cityF, 1);
        cityD.setAdjacentNodes(cityE, 2);

        cityF.setAdjacentNodes(cityE, 5);


        rutes.addRute(cityA);
        rutes.addRute(cityB);
        rutes.addRute(cityC);
        rutes.addRute(cityD);
        rutes.addRute(cityF);
*/
        City cityA = new City('A');
        City cityB = new City('B');
        City cityC = new City('C');
        City cityD = new City('D');
        City cityE = new City('E');


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

        System.out.println();
        return rutes;

    }


}