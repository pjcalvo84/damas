package models;

public class Dama extends Piece{
    public Dama(final Color color){
        super(color);
    }

    @Override
    public boolean isJumpTo(final int i){
        return false;
    }
}
