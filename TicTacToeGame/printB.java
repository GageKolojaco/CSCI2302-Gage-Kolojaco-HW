package TicTacToeGame;

public class printB {

public static char[][] board = new char[3][3];

public void printBoard() {
    System.out.println("-----[1]-[2]-[3]-");
    for (int i = 0; i < 3; i++) {
        if(i == 0)
        System.out.print("[1] | ");
        if(i == 1)
        System.out.print("[2] | ");
        if(i == 2)
        System.out.print("[3] | ");
    for (int j = 0; j < 3; j++) {
        System.out.print(board[i][j] + " | ");
        } 
        System.out.println();
    }
    System.out.println("-----------------");

}
}
