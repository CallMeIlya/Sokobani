public class Wall extends GameObject {
    public Wall(int x, int y) {
        super(x, y);
    }

    public boolean isMovable() {return false;}
    public boolean canCollide() {return true;}

    @Override
    public char getSymbol() {
        return '#';
    }
}
