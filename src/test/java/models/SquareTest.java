package models;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SquareTest{

    @Test
    private void givenWhitePiece(){

        final Square square = new Square();
        square.putPiece(new Peon(Color.WHITE));

        assertThat(Color.WHITE, is(square.getPiece()));
    }

    @Test
    private void givenBlackPiece(){

        final Square square = new Square();
        square.putPiece(new Peon(Color.BLACK));

        assertThat(Color.BLACK, is(square.getPiece()));
    }

    @Test
    private void givenNull(){

        final Square square = new Square();

        assertNull(square.getPiece());
    }

}