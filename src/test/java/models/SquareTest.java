package models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    private void test(){

        Square square = new Square();
        square.putPiece(new Peon(Color.WHITE));

        assertThat(Color.WHITE, is(square.getPiece()));
    }

    @Test
    private void test2(){

        Square square = new Square();
        square.putPiece(new Peon(Color.BLACK));

        assertThat(Color.BLACK, is(square.getPiece()));
    }

    @Test
    private void test1(){

        Square square = new Square();

        assertNull(square.getPiece());
    }

}