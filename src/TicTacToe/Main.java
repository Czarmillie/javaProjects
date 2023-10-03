//package TicTacToe;
//
//import javax.swing.JOptionPane;
//
//public class Main {
//    public static void main(String[] args) {
//        Player player1 = new Player("Player 1", 'X');
//        Player player2 = new Player("Player 2", 'O');
//        Board board = new Board();
//
//        JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe!\n" + player1.getName() + " goes first (X).");
//
//        while (true) {
//            board.displayBoard();
//            getPlayerMove(player1, board);
//            if (board.checkWin(player1.getSymbol())) {
//                board.displayBoard();
//                JOptionPane.showMessageDialog(null, player1.getName() + " wins!");
//                break;
//            }
//            if (board.isBoardFull()) {
//                board.displayBoard();
//                JOptionPane.showMessageDialog(null, "It's a draw!");
//                break;
//            }
//
//            board.displayBoard();
//            getPlayerMove(player2, board);
//            if (board.checkWin(player2.getSymbol())) {
//                board.displayBoard();
//                JOptionPane.showMessageDialog(null, player2.getName() + " wins!");
//                break;
//            }
//            if (board.isBoardFull()) {
//                board.displayBoard();
//                JOptionPane.showMessageDialog(null, "It's a draw!");
//                break;
//            }
//        }
//    }
//
//    private static void getPlayerMove(Player player, Board board) {
//        while (true) {
//            String input = JOptionPane.showInputDialog("Player " + player.getName() +
//                    ", enter row (1-3) and column (1-3) separated by a space (e.g., 1 2):");
//
//            if (input == null) {
//                JOptionPane.showMessageDialog(null, "Game exited.");
//                System.exit(0);
//            }
//
//            String[] tokens = input.split(" ");
//            if (tokens.length != 2) {
//                JOptionPane.showMessageDialog(null, "Invalid input. Try again.");
//                continue;
//            }
//
//            int row, col;
//            try {
//                row = Integer.parseInt(tokens[0]) - 1;
//                col = Integer.parseInt(tokens[1]) - 1;
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Invalid input. Try again.");
//                continue;
//            }
//
//            if (board.isValidMove(row, col)) {
//                board.placeSymbol(row, col, player.getSymbol());
//                break;
//            } else {
//                JOptionPane.showMessageDialog(null, "Invalid move. Try again.");
//            }
//        }
//    }
//}
