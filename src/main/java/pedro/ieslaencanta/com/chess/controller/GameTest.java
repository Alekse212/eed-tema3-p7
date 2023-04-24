package pedro.ieslaencanta.com.chess.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pedro.ieslaencanta.com.chess.model.Board;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {
    private Game g;
    private Board b;
    @BeforeEach
    void setUp() {
        this.g = new Game();
    }


    @Test
    void canMove_p_null() {
        boolean result =  this.g.canMove(3,5,2,5);
        assertEquals(false,result);
    }

    @Test
    void canMove_turn_blanco_en_torno() {
        boolean result =  this.g.canMove(6,5,4,5);
        assertEquals(true,result);
    }

    @Test
    void canMove_turn_negro_no_en_torno() {
        boolean result =  this.g.canMove(1,5,3,5);
        assertEquals(false,result);
    }

}