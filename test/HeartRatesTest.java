import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HeartRatesTest {

    @Test
    public void testThatHeartRatesExists() {
        HeartRates heartRates = new HeartRates( "Seyi", "Banwo", 13,"DECEMBER", 1990);

        assertNotNull(heartRates);
    }

    @Test
    public void testThatHeartRatesHasFirstName() {
        HeartRates heartRates = new HeartRates( "Seyi", "Banwo", 13,"DECEMBER", 1990);

        assertNotNull(heartRates, heartRates.getFirstName());
    }

    @Test
    public void testThatHeartRatesHasLastName() {
        HeartRates heartRates = new HeartRates( "Seyi", "Banwo", 13,"DECEMBER", 1990);

        assertNotNull(heartRates, heartRates.getLastName());
    }

    @Test
    public void testThatHeartRatesHasDateOfBirth(){
        HeartRates heartRate = new HeartRates( "Seyi", "Banwo", 13,"DECEMBER", 1990);
        heartRate.setDateOfBirth(13, "December", 1990);
        LocalDate dateOfBirth = heartRate.getDateOfBirth();
        assertEquals(LocalDate.of(1990, Month.DECEMBER, 13),dateOfBirth);
    }
}