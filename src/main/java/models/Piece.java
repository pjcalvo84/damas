package models;

public abstract class Piece {

	public Piece(Color color) {
	}

	public Color getColor() {
		return null;
	}

	public abstract boolean isJumpTo(int i);
}