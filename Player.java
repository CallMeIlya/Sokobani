class Player extends GameObject implements movable {

    //The reason that movement is flipped is to the visual representation is matched with the function names
    // (IE moving up actually moves the player up on the grid)
    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean isMovable() {return true;}
    public boolean canCollide() {return true;}

    @Override
    public char getSymbol() {
        return 'P';
    }

    public void move(int x, int y) {
        int newX = position.getX() + x;
        int newY = position.getY() + y;

        // Ensure the new position is within grid bounds
        if (newX >= 0 && newX <= gridWidth && newY >= 0 && newY <= gridHeight) {
            position.setX(newX);
            position.setY(newY);
        }

    }






    public void setPosition(Position position) {
        this.position = position;
    }
}
