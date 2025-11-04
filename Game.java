import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Game {
    ArrayList<GameObject> Objects = new ArrayList<>();

    static char grid[][] = {
            {'#', '#', '#', '#', '#'},
            {'#', '.', '.', '.', '#'},
            {'#', '.', '.', '.', '#'},
            {'#', '.', '.', '.', '#'},
            {'#', '#', '#', '#', '#'}
    };

    public static void InnitializeGrid() {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {

            }
        }
    }


    public static void printGrid(Player player) {
        Position playerPos = player.getPosition();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (i == playerPos.getY() && j == playerPos.getX()) {
                    System.out.print(player.getSymbol());
                } else {
                    System.out.print(grid[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Sokobani, start!");

        Player player = new Player(2, 2);
        System.out.println(""+player.getPosition());

        printGrid(player);
    }
}


    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.


