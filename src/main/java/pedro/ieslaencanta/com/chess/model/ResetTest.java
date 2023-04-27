package pedro.ieslaencanta.com.chess.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pedro.ieslaencanta.com.chess.model.ChessPiece.*;

import static org.junit.jupiter.api.Assertions.*;

class ResetTest {
    private Board b;

    @BeforeEach
    void setUp() {
        this.b = new Board();
    }


    @Test
    void reset() {
        this.b.move(1,1,1,2);
        this.b.move(6,0,5,0);
        this.b.move(1,0,2,0);
        this.b.reset();
        assertTrue(this.b.getCell(0,0).getPiece() instanceof Rook && this.b.getCell(0,0).getPiece().getType() == PieceType.Black);
        assertTrue(this.b.getCell(7,0).getPiece() instanceof Rook && this.b.getCell(7,0).getPiece().getType() == PieceType.White);
        assertTrue(this.b.getCell(7,7).getPiece() instanceof Rook && this.b.getCell(7,7).getPiece().getType() == PieceType.White);
        assertTrue(this.b.getCell(0,7).getPiece() instanceof Rook && this.b.getCell(0,7).getPiece().getType() == PieceType.Black);
        assertTrue(this.b.getCell(0,1).getPiece() instanceof Knight && this.b.getCell(0,1).getPiece().getType() == PieceType.Black);
        assertTrue(this.b.getCell(0,6).getPiece() instanceof Knight && this.b.getCell(0,6).getPiece().getType() == PieceType.Black);
        assertTrue(this.b.getCell(7,1).getPiece() instanceof Knight && this.b.getCell(7,1).getPiece().getType() == PieceType.White);
        assertTrue(this.b.getCell(7,6).getPiece() instanceof Knight && this.b.getCell(7,6).getPiece().getType() == PieceType.White);
        assertTrue(this.b.getCell(0,5).getPiece() instanceof Bishop && this.b.getCell(0,5).getPiece().getType() == PieceType.Black);
        assertTrue(this.b.getCell(0,2).getPiece() instanceof Bishop && this.b.getCell(0,2).getPiece().getType() == PieceType.Black);
        assertTrue(this.b.getCell(7,5).getPiece() instanceof Bishop && this.b.getCell(7,5).getPiece().getType() == PieceType.White);
        assertTrue(this.b.getCell(7,2).getPiece() instanceof Bishop && this.b.getCell(7,2).getPiece().getType() == PieceType.White);
        assertTrue(this.b.getCell(0,3).getPiece() instanceof Queen && this.b.getCell(0,3).getPiece().getType() == PieceType.Black);
        assertTrue(this.b.getCell(7,3).getPiece() instanceof Queen && this.b.getCell(7,3).getPiece().getType() == PieceType.White);
        assertTrue(this.b.getCell(0,4).getPiece() instanceof King && (this.b.getCell(0,4).getPiece().getType() == PieceType.Black));
        assertTrue(this.b.getCell(0,4).getPiece().equals(this.b.getKingBlack()));
        assertTrue(this.b.getCell(7,4).getPiece() instanceof King && this.b.getCell(7,4).getPiece().getType() == PieceType.White);
        assertTrue(this.b.getCell(7,4).getPiece().equals(this.b.getKingWhite()));
        for(int i=0; i< 7; i++){
            assertTrue(this.b.getCell(6,i).getPiece() instanceof Pawn && this.b.getCell(6,i).getPiece().getType() == PieceType.White);
            assertTrue(this.b.getCell(1,i).getPiece() instanceof Pawn && (this.b.getCell(1,i).getPiece().getType() == PieceType.Black));
        }
    }
}