package train;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CityProcessorTest {

    private CityProcessor cityProcessor;

    @Before
    public void setUp() {
        cityProcessor = new CityProcessor();
    }


    @Test
    public void should_work() {
        cityProcessor.processor("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");

        City cityA = cityProcessor.getCity('A');
        Assert.assertTrue(cityA.getAdjacentNodes().size() == 3);

        City cityB = cityProcessor.getCity('B');
        Assert.assertTrue(cityB.getAdjacentNodes().size() == 1);

        City cityC = cityProcessor.getCity('C');
        Assert.assertTrue(cityC.getAdjacentNodes().size() == 2);

        City cityD = cityProcessor.getCity('D');
        Assert.assertTrue(cityD.getAdjacentNodes().size() == 2);

        City cityE = cityProcessor.getCity('E');
        Assert.assertTrue(cityE.getAdjacentNodes().size() == 1);



    }

}