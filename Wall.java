public class Wall extends GameObject {
    public Wall(int x, int y) {
        super(x, y);
    }

    @Override
    public char getSymbol() {
        return '#';
    }
}
