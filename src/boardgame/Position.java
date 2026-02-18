package boardgame;

public class Position {

    private int roll;
    private int column;

    public Position(int roll, int column) {
        this.roll = roll;
        this.column = column;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return roll + ", " + column;
    }
}
