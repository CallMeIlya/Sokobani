public class Box extends GameObject implements movable {

    public void move(int x, int y) {
        int newX = position.getX() + x;
        int newY = position.getY() + y;
        position.setX(newX);
        position.setY(newY);
    }

    public Box(int x, int y) {
        super(x, y);
    }

    @Override
    public char getSymbol() {
        return 'B';
    }

}
