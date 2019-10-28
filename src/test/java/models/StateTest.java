package models;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class StateTest{

    @Test
    private void givenInitialWhenCreateState(){
        final State state = new State();
        assertThat(StateValue.INITIAL, is(state.getValueState()));
    }

    @Test
    private void givenInGameAfterCallNextMethod(){
        final State state = new State();
        state.next();
        assertThat(StateValue.IN_GAME, is(state.getValueState()));
    }

    @Test
    private void givenInitialAfterCallResetMethod(){
        final State state = new State();
        state.reset();
        assertThat(StateValue.INITIAL, is(state.getValueState()));
    }

}