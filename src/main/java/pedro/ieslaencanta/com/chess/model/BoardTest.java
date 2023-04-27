package pedro.ieslaencanta.com.chess.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pedro.ieslaencanta.com.chess.controller.Game;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Board b;

    @BeforeEach
    void setUp() {
        this.b = new Board();
    }


    @Test
    void getCell_incorrect() {
        Cell result = this.b.getCell(-2,-10);
        assertEquals(result, null);
    }

    @Test
    void getCell(){
        Cell result = this.b.getCell(6,1);
        assertTrue(result instanceof Cell);
    }

    @Test
    void getCell_de_pos_null(){
        Cell result = this.b.getCell(5,5);
        assertEquals(result.getPiece(), null);
    }

    @Test
    void getCell_limites_incorrect(){
        Cell result = this.b.getCell(-1,8);
        assertEquals(result, null);;
    }

    @Test
    void getCell_limites_correct(){
        Cell result = this.b.getCell(7,0);
        assertTrue(result instanceof Cell);
    }
    @Test
    void getCell_limites_incorrect_2(){
        Cell result = this.b.getCell(8,-1);
        assertEquals(result, null);;
    }

    @Test
    void getCell_limites_correct_2(){
        Cell result = this.b.getCell(0,7);
        assertTrue(result instanceof Cell);
    }
}