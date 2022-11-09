package TicTacToeGame;

public class ChangePlayer {

public char turn = 'X';

public void whichPlayer() {
    if (turn == 'X') {
        System.out.println("It's O's turn!");
        turn = 'O';
    } else {
        turn = 'X';
        System.out.println("It's X's turn!");
    }
}
public char getTurn() {
    return turn;
}
}