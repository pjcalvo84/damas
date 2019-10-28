package controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import models.Game;
import models.State;
import models.StateValue;

public class CancelControllerTest{

    @Test
    private void givenExitWhenCancelCallWithTrue(){
        final State state = new State();
        final CancelController cancelController = new CancelController(new Game(), state);
        cancelController.cancel(true);
        assertThat(StateValue.EXIT, is(state));
    }

    @Test
    private void givenInitialWhenCancelCallWithFalse(){
        final State state = new State();
        final CancelController cancelController = new CancelController(new Game(), state);
        cancelController.cancel(false);
        assertThat(StateValue.INITIAL, is(state));
    }

}