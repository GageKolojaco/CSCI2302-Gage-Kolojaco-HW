package TicTacToeGame;

import java.util.Scanner;

class Game {
printB map = new printB();
private FullPlace fullPlace = new FullPlace();
ChangePlayer playerChanger = new ChangePlayer();
WinnerConditions winner = new WinnerConditions();
Scanner input = new Scanner(System.in);
char[][] board = printB.board;
NoPlace noPlace = new NoPlace();
private int row, col;
private static final int GAME_FIELD_SIZE =3;

void StartGame() {
    for (int i = 0; i < GAME_FIELD_SIZE; i++) {
        for (int j = 0; j < GAME_FIELD_SIZE; j++) {
            board[i][j] = '_';
        }
    }
    map.printBoard();
    while (winner.Winner()) {
        System.out.println("Please input a integer between 1 & 3 to select your row!");
        row = input.nextInt();
        System.out.println("Please input a integer between 1 & 3 to select your column!");
        col = input.nextInt();
        if ((row <= 0 && row > GAME_FIELD_SIZE) || (col <= 0 && col > GAME_FIELD_SIZE)) {
            System.out.println("It appears you've inputed a number which is outside the boundary of the board!\nPlease try again!");
        } else {
            if (fullPlace.isFull(row, col)) {
                System.err.println("That place is already taken, please try again!");
            } else {
                board[row - 1][col - 1] = playerChanger.getTurn();
                map.printBoard();
                playerChanger.whichPlayer();
            }
        }
    }
    playerChanger.whichPlayer();
    System.out.println("the winner is " + playerChanger.getTurn());
}
}