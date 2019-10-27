package controllers;

import models.Game;
import models.State;
import models.StateValue;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ResumeControllerTest {

    @Test
    private void test() {
        State state = new State();
        ResumeController resumeController = new ResumeController(new Game(), state);
        resumeController.resume(true);
        assertThat(StateValue.INITIAL, is(state));
    }

    @Test
    private void test2(){
        State state = new State();
        ResumeController resumeController = new ResumeController(new Game(), state);
        resumeController.resume(false);
        assertThat(StateValue.IN_GAME, is(state));
    }

}