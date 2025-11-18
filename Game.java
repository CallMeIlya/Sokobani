import java.util.ArrayList;
import java.util.Scanner;


/**
 * This class draws a grid and allows a player to move around using WASD keys.
 * @deprecated Grid is implemented because it's easier to visualize the player's position this way.
 * @author Ilya Kuznetsov
 * @version 1.0
 */

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Game {
    static ArrayList<GameObject> Objects = new ArrayList<>();


    static char grid[][] = {
            {'.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.'}
    };

    boolean isMovable(int x, int y) {
        for (int i = 0; i < Objects.size(); i++) {
            GameObject object = Objects.get(i);
            if(object.getPosition().getX() == x && object.getPosition().getY() == y) {
                if(true) {
                    return true;
                }
            }
        }
        return false;
    }

    public static GameObject getObjectAt(int x, int y) {
        for (int i = 0; i < Objects.size(); i++) {
            GameObject object = Objects.get(i);
            if(object.getPosition().getX() == x && object.getPosition().getY() == y) {
                return object;
            }
        }
        return null;
    }

    public static void printGrid(Player player) {
        Position playerPos = player.getPosition();
        for (int i = Game.grid.length-1; i > 0; i--) {
            for (int j = 0; j < Game.grid.length; j++) {
                if (i == playerPos.getY() && j == playerPos.getX()) {
                System.out.print(player.getSymbol()); }
                else {
                    boolean printedObject = false;
                    for(int p = 0; p < Objects.size(); p++) {
                        if (Game.Objects.get(p).getPosition().getX() == j && Game.Objects.get(p).getPosition().getY() == i) {
                            System.out.print(Game.Objects.get(p).getSymbol());
                            printedObject = true;
                            break;
                        }
                    }
                    if(!printedObject) {System.out.print(Game.grid[i][j]);}
                }
            }
            System.out.println();
        }
    }

    static private final Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Sokobani, start!");

        Player player = new Player(2, 2);
        Objects.add(new Wall(1,1));
        printGrid(player);

        while(true) {
            String inputChar = input.nextLine();

           GameObject object;

            switch (inputChar) {
                case "w":
                    object = getObjectAt(player.getPosition().getX()+0, player.getPosition().getY()+1);
                    if(object == null) {
                        player.move(0,+1);
                    } else if(object.canCollide() && object.isMovable()) {
                        player.move(0,+1);
                    } else if(!object.canCollide()) {
                        //do nothign
                    }
                    break;
                case "a":
                    object = getObjectAt(player.getPosition().getX()-1, player.getPosition().getY()+0);
                    if(object == null) {
                        player.move(-1,0);
                    } else if(object.canCollide() && object.isMovable()) {
                        player.move(-1,0);
                    } else if(!object.canCollide()) {
                        //do nothign
                    }
                    break;
                case "s":
                    object = getObjectAt(player.getPosition().getX()+0, player.getPosition().getY()-1);
                    if(object == null) {
                        player.move(0,-1);
                    } else if(object.canCollide() && object.isMovable()) {
                        player.move(0,-1);
                    } else if(!object.canCollide()) {
                        //do nothign
                    }
                    break;
                case "d":
                    object = getObjectAt(player.getPosition().getX()+1, player.getPosition().getY()+0);
                    if(object == null) {
                        player.move(1,0);
                    } else if(object.canCollide() && object.isMovable()) {
                        player.move(1, 0);
                    } else if(!object.canCollide()) {
                        //do nothing
                    }
                    break;
                case "q":
                    System.out.println("Quitting game.");
                    return;
                default:
                    System.out.println("Invalid input, use WASD to move.");
                    break;
            }
            printGrid(player);
        }
    }
}



    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.


