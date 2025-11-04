class Player extends GameObject {
    private static final int gridWidth = 5;
    private static final int gridHeight = 5;

    //The reason that movement is flipped is to the visual representation is matched with the function names
    // (IE moving up actually moves the player up on the grid)
    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public char getSymbol() {
        return 'P';
    }

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

    public void setPosition(Position position) {
        this.position = position;
    }
}
