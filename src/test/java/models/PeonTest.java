package models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PeonTest{

    @Test
    public void givenOKWhenCreatePeonWithWhiteColor(){

        final Piece peon = new Peon(Color.WHITE);
        assertThat(Color.WHITE, is(peon.getColor()));

    }

    @Test
    public void givenBlackWhenCreatePeonWithBlackColor(){

        final Piece peon = new Peon(Color.BLACK);
        assertThat(Color.WHITE, not(peon.getColor()));

    }

    @Test
    private void givenTrueWhenPeonJumpOneSquare(){
        final Piece peon = new Peon(Color.WHITE);
        assertThat(true, is(peon.isJumpTo(1)));
    }

    @Test
    private void givenFalseWhenPeonJumpTwoSquare(){
        final Piece peon = new Peon(Color.WHITE);
        assertThat(false, is(peon.isJumpTo(2)));
    }

    @Test
    private void givenFalseWhenPeonJumpTreeSquare(){
        final Piece peon = new Peon(Color.WHITE);
        assertThat(false, is(peon.isJumpTo(3)));
    }

}