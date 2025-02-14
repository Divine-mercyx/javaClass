
package geoPolitics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class GeoPoliticalZoneTest {

    @Test
    public void assignObjectToVariable_checkSameness_testGeoPoliticsZoneEnum() {
        var zone = GeoPoliticalZone.SOUTH_SOUTH;
        var secondZone = GeoPoliticalZone.SOUTH_SOUTH;
        assertSame(zone, secondZone);
    }

    @Test
    public void assignObjectToVariable_getStates_testGeoPoliticsZoneEnum() {
        var zone = GeoPoliticalZone.SOUTH_SOUTH;
        assertArrayEquals(zone.getStates(), new String[] {"Akwa-ibom", "Bayelsa", "Cross-river", "Delta", "Edo", "Rivers"});
    }



}