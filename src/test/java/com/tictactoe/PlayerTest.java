package com.tictactoe;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PlayerTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void createNewPlayer()
    {
        Player player = new Player("test", 'o');
        assertTrue(player.getName() == "test" && player.getChar() == 'o');
    }
}
