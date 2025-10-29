public class Player {
    private Position position;

    private static final int gridWidth = 5;
    private static final int gridHeight = 5;

    public Player(Position position) {
        this.position = position;
    }
    //The reason that movement is flipped is to the visual representation is matched with the function names
    // (IE moving up actually moves the player up on the grid)
    public void moveUp() {
        if(this.position.getY() <= 0) {return;}
        this.position.setY(this.position.getY() - 1);
    }

    public void moveDown() {
        if(this.position.getY() >= gridHeight-1) {return;}
        this.position.setY(this.position.getY() + 1);
    }

    public void moveLeft() {
        if(this.position.getX() <= 0) {return;}
        this.position.setX(this.position.getX() - 1);
    }

    public void moveRight() {
        if(this.position.getX() >= gridWidth-1) {return;}
        this.position.setX(this.position.getX() + 1);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
