package org.example.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void looses_when_dice_number_is_too_low() {
        // Dice dice = new Dice(6); // 6 caras

        // Mockito para simular clases para datos random o no tan especificos (Simulado)
        Dice dice = Mockito.mock(Dice.class);

        // Simulando el dado que devuelve 2 y no uno aleatorio
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 2); // Ganar si tiene un 2

        assertFalse(player.play()); // dato en false
    }

    @Test
    public void wins_when_dice_number_is_big() {
        // Mockito para simular clases para datos random o no tan especificos (Simulado)
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);

        assertEquals(true, player.play());
    }

}