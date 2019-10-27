package controllers;

import models.Game;
import models.State;
import models.StateValue;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CancelControllerTest {


    @Test
    private void test() {
        State state = new State();
        CancelController cancelController = new CancelController(new Game(), state);
        cancelController.resume(true);
        assertThat(StateValue.EXIT, is(state));
    }

    @Test
    private void test2(){
        State state = new State();
        CancelController resumeController = new CancelController(new Game(), state);
        resumeController.resume(false);
        assertThat(StateValue.INITIAL, is(state));
    }

}