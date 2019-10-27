package models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class PeonTest {

    @Test
    public void given(){

        Piece peon = new Peon(Color.WHITE);
        assertThat(Color.WHITE, is(peon.getColor()));

    }

    @Test
    public void given2(){

        Piece peon = new Peon(Color.BLACK);
        assertThat(Color.WHITE, not(peon.getColor()));

    }

    @Test
    public void test3(){
        Piece peon = new Peon(Color.WHITE);
    }

    @Test
    private void test4(){
        Piece peon = new Peon(Color.WHITE);
        assertThat(true, is(peon.isJumpTo(1)));
    }

    @Test
    private void test5(){
        Piece peon = new Peon(Color.WHITE);
        assertThat(false, is(peon.isJumpTo(2)));
    }

    @Test
    private void test6(){
        Piece peon = new Peon(Color.WHITE);
        assertThat(false, is(peon.isJumpTo(3)));
    }


}