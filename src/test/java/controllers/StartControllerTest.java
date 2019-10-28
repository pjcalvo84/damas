package controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import models.Game;
import models.State;
import models.StateValue;

public class StartControllerTest{

    @Test
    private void givenInGameWhenCreateStartController(){
        final State state = new State();
        final StartController startController = new StartController(new Game(), state);
        assertThat(StateValue.IN_GAME, is(state.getValueState()));
    }

}