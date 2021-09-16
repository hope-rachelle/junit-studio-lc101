package test;

import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyRightBracketFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyLeftBracketFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void backwardBracketsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void separationBracketsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Br[ack]ets"));
    }
    @Test
    public void bracketsBeforeStringTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Brackets"));
    }
    @Test
    public void bracketsAfterStringTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Brackets[]"));
    }

}
