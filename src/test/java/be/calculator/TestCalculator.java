package be.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    @Test
    void test111() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("(1, 1, 1)");
        assertEquals(3, result);
    }

    @Test
    void testAndPlus111() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&+(1, 1, 1)");
        assertEquals(3, result);
    }

    @Test
    void testAnd111() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&(1, 1, 1)");
        assertEquals(3, result);
    }

    @Test
    void testPlus111() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("+(1, 1, 1)");
        assertEquals(3, result);
    }

    @Test
    void testMin111() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("-(1, 1, 1)");
        assertEquals(3, result);
    }

    @Test
    void testAndPlus111GeenHaakjes() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&+1, 1, 1");
        assertEquals(3, result);
    }

    @Test
    void testAndPlus111GeenHaakjesSpaties() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&+ 1,   1  ,  1");
        assertEquals(3, result);
    }

    @Test
    void testAndPlus111EenHaakje() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&+ (1,   1  ,  1");
        assertEquals(0, result);
    }

    @Test
    void testAndPlus1e1() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&+(1, e, 1)");
        assertEquals(0, result);
    }

    @Test
    void testAndMin311() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&-(3,1,1)");
        assertEquals(1, result);
    }

    @Test
    void testAndPlus3min21() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&+(3,-2,1)");
        assertEquals(0, result);
    }

    @Test
    void testAndPlus3211() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&+(3,2,1,1)");
        assertEquals(7, result);
    }

    @Test
    void testAndPlus3() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&+(3)");
        assertEquals(3, result);
    }

    @Test
    void testAndMaal345() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&*(3, 4, 5)");
        assertEquals(60, result);
    }

    @Test
    void testAndDelen6032() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&/(60, 3, 2)");
        assertEquals(10, result);
    }

    @Test
    void testAndDelen6032GeenHaakjes() {
        CodeCalculator cc = new CodeCalculator();
        double result = cc.getResult("&/60, 3, 2");
        assertEquals(10, result);
    }
}

