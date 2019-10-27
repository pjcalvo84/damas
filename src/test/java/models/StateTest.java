package models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StateTest {

    @Test
    private void test(){
        State state = new State();
        assertThat(StateValue.INITIAL, is(state.getValueState()));
    }


    @Test
    private void test1(){
        State state = new State();
        state.next();
        assertThat(StateValue.IN_GAME, is(state.getValueState()));
    }

    @Test
    private void test2(){
        State state = new State();
        state.reset();
        assertThat(StateValue.INITIAL, is(state.getValueState()));
    }


}