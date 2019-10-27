package models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void test1(){
        Turn turn = new Turn();
        assertThat(Color.WHITE, is(turn.getTurn()));
    }

    @Test
    public void test2(){
        Turn turn = new Turn();
        turn.nextTurn();
        assertThat(Color.BLACK, is(turn.getTurn()));
    }

    @Test
    public void test3(){
        Turn turn = new Turn();
        assertThat(Color.BLACK, is(not(turn.getTurn())));
    }

    @Test
    public void test4(){
        Turn turn = new Turn();
        turn.nextTurn();
        assertThat(Color.BLACK, is(not(turn.getTurn())));
    }

}