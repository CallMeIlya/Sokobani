public class Box extends GameObject implements movable {

    public Box(int x, int y) {
        super(x, y);
    }

    public boolean isMovable() {return true;}
    public boolean canCollide() {return true;}

    public void move(int x, int y) {
        int newX = position.getX() + x;
        int newY = position.getY() + y;

        // Ensure the new position is within grid bounds
        if (newX >= 0 && newX < gridWidth && newY >= 0 && newY < gridHeight) {
            position.setX(newX);
            position.setY(newY);
        }

    }

    @Override
    public char getSymbol() {
        return 'B';
    }

}
