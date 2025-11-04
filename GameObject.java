abstract class GameObject {
    public Position position;

    public int symbol;

    public GameObject(int x, int y) {
        position = new Position(x, y);
    }

    public Position getPosition() {return position;}

    public abstract char getSymbol();
}
