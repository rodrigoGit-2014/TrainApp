package train;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CityCalculationTest {


    private CityCalculation cityCalculation;
    private CityProcessor cityProcessor;

    @Before
    public void setUp(){
        cityProcessor = new CityProcessor();
        cityCalculation = new CityCalculation();
    }


    @Test
    public void should_test(){
        cityProcessor.processor("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");
        int distance = cityCalculation.getRouteDistance(cityProcessor,"ABC");

    }

}