import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    void frequency() {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("uno", 1);
        mapa.put("dos", 1);
        assertEquals(mapa, Frequency.frequency(new String[]{"uno", "dos"}));

        mapa = new HashMap<>();
        mapa.put("uno", 1);
        mapa.put("dos", 2);
        mapa.put("tres", 3);
        assertEquals(mapa, Frequency.frequency(new String[]{"uno", "dos", "tres", "dos", "tres", "tres"}));
    }
}