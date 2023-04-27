package pedro.ieslaencanta.com.chess.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMove {
    private Board b;

    @BeforeEach
    void setUp() {
        this.b = new Board();
    }



    @Test
    void move_pi1_pf2() {
        Move result = this.b.move(-2,5,1,1);
        assertEquals(result, null);
    }
    @Test
    void move_pi2_pf2() {
        Move result = this.b.move(1,1,1,2);
        assertTrue(result instanceof Move);
    }
    @Test
    void move_pi4_pf2() {
        Move result = this.b.move(8,1,1,1);
        assertEquals(result, null);
    }
    @Test
    void move_pi2_pf1() {
        Move result = this.b.move(-2,5,1,1);
        assertEquals(result, null);
    }
    @Test
    void move_pi2_pf3() {
        Move result = this.b.move(-2,5,1,1);
        assertEquals(result, null);
    }
    @Test
    void move_pi3_pf2() {
        Move result = this.b.move(-2,5,1,1);
        assertEquals(result, null);
    }

    @Test
    void move_pi2_pf2_no_init() {
        this.b.move(6,0,5,0);
        this.b.move(1,0,2,0);
        Move result = this.b.move(5,0,4,0);
        assertTrue(result instanceof Move);
    }

    @Test
    void move_Ls1() {
        Move result = this.b.move(-1,0,1,1);
        assertEquals(result, null);
    }
    @Test
    void move_Ls2() {
        Move result = this.b.move(0,-1,1,1);
        assertEquals(result, null);
    }
    @Test
    void move_Ls3() {
        Move result = this.b.move(0,0,1,1);
        assertTrue(result instanceof Move);
    }
    @Test
    void move_Ls4() {
        Move result = this.b.move(7,7,1,1);
        assertTrue(result instanceof Move);
    }
    @Test
    void move_Ls5() {
        Move result = this.b.move(8,7,1,1);
        assertEquals(result, null);
    }
    @Test
    void move_Ls6() {
        Move result = this.b.move(7,8,1,1);
        assertEquals(result, null);
    }
    @Test
    void move_Lf1() {
        Move result = this.b.move(1,1,-1,0);
        assertEquals(result, null);
    }
    @Test
    void move_Lf2() {
        Move result = this.b.move(1,1,0,-1);
        assertEquals(result, null);
    }
    @Test
    void move_Lf3() {
        Move result = this.b.move(1,1,0,0);
        assertTrue(result instanceof Move);
    }
    @Test
    void move_Lf4() {
        Move result = this.b.move(1,1,7,7);
        assertTrue(result instanceof Move);
    }
    @Test
    void move_Lf5() {
        Move result = this.b.move(1,1,8,7);
        assertEquals(result, null);
    }
    @Test
    void move_Lf6() {
        Move result = this.b.move(1,1,7,8);
        assertEquals(result, null);
    }

}