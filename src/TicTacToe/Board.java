package TicTacToe;

public class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }

    public boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public void placeSymbol(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public boolean checkWin(int row, int col, char symbol) {
        return checkRow(row, symbol) || checkColumn(col, symbol) || checkDiagonals(symbol);
    }

    private boolean checkRow(int row, char symbol) {
        return board[row][0] == symbol && board[row][1] == symbol && board[row][2] == symbol;
    }

    private boolean checkColumn(int col, char symbol) {
        return board[0][col] == symbol && board[1][col] == symbol && board[2][col] == symbol;
    }

    private boolean checkDiagonals(char symbol) {
        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

    public boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ')
                    return false;
            }
        }
        return true;
    }
}