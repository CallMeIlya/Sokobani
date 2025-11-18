abstract class GameObject {
    protected Position position;

    public static final int gridWidth = 7;
    public static final int gridHeight = 7;

    public abstract boolean isMovable();
    public abstract boolean canCollide();

    public GameObject(int x, int y) {
        position = new Position(x, y);
    }

    public Position getPosition() {return position;}

    public abstract char getSymbol();
}
