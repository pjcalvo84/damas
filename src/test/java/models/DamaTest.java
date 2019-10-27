package models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class DamaTest {


    @Test
    public void given(){

        Piece dama = new Dama(Color.WHITE);
        assertThat(Color.WHITE, is(dama.getColor()));

    }

    @Test
    public void given2(){

        Piece dama = new Dama(Color.BLACK);
        assertThat(Color.WHITE, not(dama.getColor()));

    }

    @Test
    public void test3(){
        Piece peon = new Dama(Color.WHITE);
    }


    @Test
    private void test4(){
        Piece dama = new Dama(Color.WHITE);
        assertThat(true, is(dama.isJumpTo(1)));
    }

    @Test
    private void test5(){
        Piece dama = new Dama(Color.WHITE);
        assertThat(false, is(dama.isJumpTo(2)));
    }

    @Test
    private void test6(){
        Piece dama = new Dama(Color.WHITE);
        assertThat(false, is(dama.isJumpTo(3)));
    }
}