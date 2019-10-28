package controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import models.Game;
import models.State;
import models.StateValue;

public class ResumeControllerTest{

    @Test
    private void givenInitialWhenResumenCallWithTrue(){
        final State state = new State();
        final ResumeController resumeController = new ResumeController(new Game(), state);
        resumeController.resume(true);
        assertThat(StateValue.INITIAL, is(state));
    }

    @Test
    private void givenInGameWhenResumenCallWithTrue(){
        final State state = new State();
        final ResumeController resumeController = new ResumeController(new Game(), state);
        resumeController.resume(false);
        assertThat(StateValue.IN_GAME, is(state));
    }

}