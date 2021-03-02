package test.model;

import main.model.Tunnel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TunnelClassTests {
    @Test
    void testRightHigherCorner(){
        double input_x = 1;
        double input_y = 35;
        assertEquals("right", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testLeftHigherCorner(){
        double input_x = -1000;
        double input_y = 35;
        assertEquals("left", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testRightLowerCorner(){
        double input_x = 18;
        double input_y = -35;
        assertEquals("right", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testLeftLowerCorner(){
        double input_x = -13;
        double input_y = 368;
        assertEquals("left", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testZeroValue(){
        double input_x = 0;
        double input_y = 0;
        assertEquals("zero", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testOY_1(){
        double input_x = 0;
        double input_y = 48;
        assertEquals("OY", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testOY_2(){
        double input_x = 0;
        double input_y = -537;
        assertEquals("OY", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testOX_1(){
        double input_x = 53890;
        double input_y = 0;
        assertEquals("OX", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testOX_2(){
        double input_x = - 537870;
        double input_y = 0;
        assertEquals("OX", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testNonIntegerValues_1(){
        double input_x = -56.6779;
        double input_y = 345.99998;
        assertEquals("left", Tunnel.checkLocation(input_x,input_y));
    }
    @Test
    void testNonIntegerValues_2(){
        double input_x = 53.9870;
        double input_y = 1150.7777;
        assertEquals("right", Tunnel.checkLocation(input_x,input_y));
    } @Test
    void testStringValues(){
        String input_x = "hhhjkk";
        String input_y = "ppppppppppppllll";
        assertThrows(NumberFormatException.class, () -> Tunnel.checkLocation(Double.parseDouble(input_x), Double.parseDouble(input_y)));
    }
    @Test
    void testNullValues(){
        String input_x = null;
        String input_y = null;
        assertThrows(NullPointerException.class, () -> Tunnel.checkLocation(Double.parseDouble(input_x), Double.parseDouble(input_y)));
    }
}
