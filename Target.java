public class Target extends GameObject {
    public Target(int x, int y) {
        super(x, y);
    }

    public boolean isMovable() {return false;}

    public boolean canCollide() {
        return false;
    }

    @Override
    public char getSymbol() {
        return 'X';
    }
}
