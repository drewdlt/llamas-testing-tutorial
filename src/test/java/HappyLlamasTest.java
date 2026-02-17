import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyLlamasTest {

    HappyLlamas happyLlamas = new HappyLlamas();

    public HappyLlamasTest() {}

    @Test
    public void testNormalTrampoline10() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 10;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabric, numTrampolines);


        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.
        assertFalse(result, "10 Llamas w/ Normal Trampolines should be Unhappy!");
    }

    @Test
    public void testNormalTrampoline24() {
        boolean isNasaFabrice = false;
        int numTrampolines = 24;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertTrue(result, "24 Llamas w/ Normal Trampolines should be Happy!");
    }

    @Test
    public void testNormalTrampoline30() {
        boolean isNasaFabrice = false;
        int numTrampolines = 30;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertTrue(result, "30 Llamas w/ Normal Trampolines should be Happy!");
    }

    @Test
    public void testNormalTrampoline42() {
        boolean isNasaFabrice = false;
        int numTrampolines = 42;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertTrue(result, "42 Llamas w/ Normal Trampolines should be Happy!");
    }

    @Test
    public void testNormalTrampoline50() {
        boolean isNasaFabrice = false;
        int numTrampolines = 50;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertFalse(result, "50 Llamas w/ Normal Trampolines should be Unhappy!");
    }

    @Test
    public void testUltraBouncyTrampoline10() {
        boolean isNasaFabrice = true;
        int numTrampolines = 10;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertFalse(result, "10 Llamas w/ Ultra Bouncy Trampolines should be Unhappy!");
    }

    @Test
    public void testUltraBouncyTrampoline24() {
        boolean isNasaFabrice = true;
        int numTrampolines = 24;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertTrue(result, "24 Llamas w/ Ultra Bouncy Trampolines should be Happy!");
    }

    @Test
    public void testUltraBouncyTrampoline30() {
        boolean isNasaFabrice = true;
        int numTrampolines = 30;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertTrue(result, "30 Llamas w/ Ultra Bouncy Trampolines should be Happy!");
    }

    @Test
    public void testUltraBouncyTrampoline42() {
        boolean isNasaFabrice = true;
        int numTrampolines = 42;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertTrue(result, "42 Llamas w/ Ultra Bouncy Trampolines should be Happy!");
    }

    @Test
    public void testUltraBouncyTrampoline50() {
        boolean isNasaFabrice = true;
        int numTrampolines = 50;

        boolean result = happyLlamas.areTheLlamasHappy(isNasaFabrice, numTrampolines);

        assertTrue(result, "50 Llamas w/ Ultra Bouncy Trampolines should be Happy!");
    }

}