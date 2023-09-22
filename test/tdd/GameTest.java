import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void ifGameIsOnTest(){
        Game ps5 = new Game();
        boolean status = ps5.getIsOn();
        assertEquals(false, status);

        ps5.setIsOn(true);
        boolean newStatus = ps5.getIsOn();
        assertEquals(true, newStatus);
    }

    @Test
    public void ifGameIsOffTest(){
        Game ps5 = new Game();
        ps5.setIsOn(true);
        boolean status = ps5.getIsOn();
        assertEquals(true, status);

        ps5.setIsOn(false);
        boolean newStatus = ps5.getIsOn();
        assertEquals(false, newStatus);
    }

    @Test
    public void ifGamePadIsConnected(){
        Game ps5 = new Game();
        ps5.setIsOn(true);
        boolean status = ps5.getIsOn();
        assertEquals(true, status);

        ps5.connectPad();
        boolean newStatus = ps5.connectPad();
        assertEquals(true, newStatus);
    }

    @Test
    public void ifGamePadIsDisconnected(){
        Game ps5 = new Game();
        ps5.setIsOn(true);
        boolean status = ps5.getIsOn();
        assertEquals(true, status);

        ps5.disconnectPad();
        boolean newStatus = ps5.disconnectPad();
        assertEquals(true, newStatus);
    }
}
