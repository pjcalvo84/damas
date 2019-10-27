package controllers;

import models.Game;
import models.State;
import models.StateValue;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StartControllerTest {

    @Test
    private void test(){
        State state = new State();
        StartController startController = new StartController(new Game(), state);
        assertThat(StateValue.IN_GAME, is(state.getValueState()));
    }

}