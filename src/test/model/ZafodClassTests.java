package test.model;


import main.model.Zafod;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ZafodClassTests {
    @Test
    void testSpeedValue_1() {
        int input_speed = 1;
        assertEquals(false, Zafod.goFast(input_speed));
    }
    @Test
    void testSpeedValue_2() {
        int input_speed = 50;
        assertEquals(true, Zafod.goFast(input_speed));
    }
    @Test
    void testSpeedValue_3() {
        int input_speed = 120;
        assertEquals(true, Zafod.goFast(input_speed));
    }
    @Test
    void testSpeedValue_incorrect() {
        int input_speed = 0;
        assertThrows(IllegalArgumentException.class, () -> Zafod.goFast(input_speed));
    }
    @Test
    void testNegativeValue() {
        int input_speed = - 5;
        assertThrows(IllegalArgumentException.class, () -> Zafod.goFast(input_speed));
    }
    @Test
    void testStringValue() {
        String input_speed = "why";
        assertThrows(IllegalArgumentException.class, () -> Zafod.goFast(Integer.parseInt(input_speed)));
    }
    @Test
    void testGetNervousTrue() {
        boolean input = true;
        assertEquals(true,Zafod.getNervous(input));
    }
    @Test
    void testGetNervousFalse() {
        boolean input = false;
        assertEquals(false,Zafod.getNervous(input));
    }
    @Test
    void testGetNervousStringValue() {
        String input = "heeeyyou";
        assertEquals(false,Zafod.getNervous(Boolean.parseBoolean(input)));
    }
    @Test
    void testGetNervousNullValue() {
        assertEquals(false,Zafod.getNervous(Boolean.parseBoolean(null)));
    }
}
