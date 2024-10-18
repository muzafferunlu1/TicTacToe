import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    private static char winnerGame = 'X';

    public static void main(String[] args) {

        JFrame frm = new JFrame("TicTacToe");
        frm.setSize(540,540);


        //Gerekli nesnelerin oluşturulması
        TicTacToeBoard board = new TicTacToeBoard(frm);
        ArrayList<JButton> butons = board.getButons();

        GameEndChecker control = new GameEndChecker(butons,winnerGame);

        PlayerMoveController playerMoveController = new PlayerMoveController(butons,control,winnerGame,board,board.getRestartGame());


        frm.setLayout(null);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}