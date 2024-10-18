import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PlayerMoveController {

    ArrayList<JButton> butons;
    GameEndChecker control;
    TicTacToeBoard board;
    JButton restartGame;
    char winnerGame;
    int sayac=0;
    public PlayerMoveController(ArrayList<JButton> butons,GameEndChecker control,char winnerGame,TicTacToeBoard board,JButton restartGame) {
        this.butons = butons;
        this.control = control;
        this.winnerGame = winnerGame;
        this.board = board;
        this.restartGame = restartGame;
        playerMove();
    }

    public void playerMove() {
        Integer[] bb = new Integer[1];
        bb[0] = 0;
        board.getLblTurn1().setBackground(Color.cyan);
        for(int i=0;i<9;i++) {
            JButton bt = butons.get(i);
            bt.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(bt.getText().equals("") && !(control.Checker(winnerGame))){
                        if(bb[0] == 0) {
                            bt.setText("X");
                            bb[0] = 1;
                            board.getLblTurn2().setBackground(Color.cyan);
                            board.getLblTurn1().setBackground(Color.orange);
                        }
                        else {
                            bt.setText("O");
                            bb[0] = 0;
                            board.getLblTurn1().setBackground(Color.cyan);
                            board.getLblTurn2().setBackground(Color.orange);
                        }
                    }
                    System.out.println(sayac);
                    sayac++;
                    if(control.Checker(winnerGame)){
                        JOptionPane.showMessageDialog(null,"Gamer " + winnerGame + " Is Won !!!","Information",JOptionPane.INFORMATION_MESSAGE);
                    }else if(sayac == 9)
                        JOptionPane.showMessageDialog(null,"Nobody Won :) Try Again","Information",JOptionPane.INFORMATION_MESSAGE);

                    if(winnerGame == 'X')
                        winnerGame = 'O';
                    else
                        winnerGame = 'X';
                }
            });
        }

        restartGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i< butons.size();i++) {
                    butons.get(i).setText("");
                }
                board.getLblTurn1().setBackground(Color.cyan);
                board.getLblTurn2().setBackground(Color.orange);
                JOptionPane.showMessageDialog(null,"To restart the game, close the window and run the code again!","Important",JOptionPane.ERROR_MESSAGE);
            }
        });

    }
}
