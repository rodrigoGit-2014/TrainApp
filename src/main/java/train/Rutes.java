package train;

import java.util.HashSet;
import java.util.Set;

public class Rutes {

    private Set<City> rutes = new HashSet<>();


    public void addRute(City city){
        rutes.add(city);
    }

    public Set<City> getRoutes(){
        return this.rutes;
    }
}
