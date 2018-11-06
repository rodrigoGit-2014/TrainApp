package train;

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
    public void should_work(){
        cityProcessor.processor("AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7");

        
    }

}