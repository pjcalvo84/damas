package models;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TurnTest{

    @Test
    public void givenWhiteWhenCreatTurn(){
        final Turn turn = new Turn();
        assertThat(Color.WHITE, is(turn.getTurn()));
    }

    @Test
    public void givenBlackAfterCallNextTurn(){
        final Turn turn = new Turn();
        turn.nextTurn();
        assertThat(Color.BLACK, is(turn.getTurn()));
    }

    @Test
    public void givenNotBlackAfterCreateTurn(){
        final Turn turn = new Turn();
        assertThat(Color.BLACK, is(not(turn.getTurn())));
    }

    @Test
    public void givenNotBlackAfterCallTwoTimesNextTurn(){
        final Turn turn = new Turn();
        turn.nextTurn();
        turn.nextTurn();
        assertThat(Color.BLACK, is(not(turn.getTurn())));
    }

}