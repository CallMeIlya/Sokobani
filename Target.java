public class Target extends GameObject {
    public Target(int x, int y) {
        super(x, y);
    }

    @Override
    public char getSymbol() {
        return 'X';
    }
}
