package models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DamaTest{

    @Test
    public void givenOKWhenCreateDamaWithWhiteColor(){

        final Piece dama = new Dama(Color.WHITE);
        assertThat(Color.WHITE, is(dama.getColor()));

    }

    @Test
    public void givenBlackWhenCreateDamaWithBlackColor(){

        final Piece dama = new Dama(Color.BLACK);
        assertThat(Color.WHITE, not(dama.getColor()));

    }

    @Test
    private void givenTrueWhenDamaJumpOneSquare(){
        final Piece dama = new Dama(Color.WHITE);
        assertThat(true, is(dama.isJumpTo(1)));
    }

    @Test
    private void givenTrueWhenDamaJumpTwoSquare(){
        final Piece dama = new Dama(Color.WHITE);
        assertThat(false, is(dama.isJumpTo(2)));
    }

    @Test
    private void givenTrueWhenDamaJumpTreeSquare(){
        final Piece dama = new Dama(Color.WHITE);
        assertThat(false, is(dama.isJumpTo(3)));
    }
}