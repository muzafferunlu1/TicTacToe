import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

public class TicTacToeBoard {
    ArrayList<JButton> butonlar = new ArrayList<>();
    JFrame frm;
    JButton btn;
    private JLabel lblTurn1;
    private JLabel lblTurn2;
    private JButton restartGame;
    int koordinatX=0,koordinatY=200,sayac=0;
    public TicTacToeBoard(JFrame frm) {
        this.frm = frm;
        TicTacToeBoardAdd();
    }

    public void TicTacToeBoardAdd() {
        Border border = BorderFactory.createLineBorder(Color.WHITE,2);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK,5);

        // Gamer1 yazan label kodu
        JLabel lblGamer1 = new JLabel("Gamer1",SwingConstants.CENTER);
        lblGamer1.setBounds(333,10,100,50);
        lblGamer1.setFont(new Font("Monospaced",Font.CENTER_BASELINE,15));
        lblGamer1.setForeground(Color.DARK_GRAY);
        lblGamer1.setBackground(Color.orange);
        lblGamer1.setBorder(border);
        lblGamer1.setOpaque(true);
        frm.add(lblGamer1);

        // Gamer2 yazan label kodu
        JLabel lblGamer2 = new JLabel("Gamer2",SwingConstants.CENTER);
        lblGamer2.setBounds(333,60,100,50);
        lblGamer2.setFont(new Font("Monospaced",Font.CENTER_BASELINE,15));
        lblGamer2.setForeground(Color.DARK_GRAY);
        lblGamer2.setBackground(Color.orange);
        lblGamer2.setBorder(border);
        lblGamer2.setOpaque(true);
        frm.add(lblGamer2);

        // X yazan label kodu
        JLabel lblGamer1Name = new JLabel("X",SwingConstants.CENTER);
        lblGamer1Name.setBounds(433,10,60,50);
        lblGamer1Name.setFont(new Font("Monospaced",Font.CENTER_BASELINE,15));
        lblGamer1Name.setForeground(Color.DARK_GRAY);
        lblGamer1Name.setBackground(Color.orange);
        lblGamer1Name.setBorder(border);
        lblGamer1Name.setOpaque(true);
        frm.add(lblGamer1Name);

        // O yazan label kodu
        JLabel lblGamer2Name = new JLabel("O",SwingConstants.CENTER);
        lblGamer2Name.setBounds(433,60,60,50);
        lblGamer2Name.setFont(new Font("Monospaced",Font.CENTER_BASELINE,15));
        lblGamer2Name.setForeground(Color.DARK_GRAY);
        lblGamer2Name.setBackground(Color.orange);
        lblGamer2Name.setBorder(border);
        lblGamer2Name.setOpaque(true);
        frm.add(lblGamer2Name);

        // Click on the boxes to play yazan label kodu
        JLabel lblInformation = new JLabel("Click on the boxes to play",SwingConstants.CENTER);
        lblInformation.setBounds(1,100,298,50);
        lblInformation.setFont(new Font("Monospaced",Font.CENTER_BASELINE,15));
        lblInformation.setForeground(Color.DARK_GRAY);
        lblInformation.setBackground(Color.PINK);
        lblInformation.setBorder(border);
        lblInformation.setOpaque(true);
        frm.add(lblInformation);

        // XOX BOARD yazan label kodu
        JLabel lblBoard = new JLabel("XOX BOARD",SwingConstants.CENTER);
        lblBoard.setBounds(1,150,298,50);
        lblBoard.setFont(new Font("Monospaced",Font.CENTER_BASELINE,30));
        lblBoard.setForeground(Color.DARK_GRAY);
        lblBoard.setBackground(Color.PINK);
        lblBoard.setBorder(border);
        lblBoard.setOpaque(true);
        frm.add(lblBoard);

        // It's X player's turn yazan label kodu
        lblTurn1 = new JLabel("It's X player's turn",SwingConstants.CENTER);
        lblTurn1.setBounds(320,200,180,50);
        lblTurn1.setFont(new Font("Monospaced",Font.CENTER_BASELINE,15));
        lblTurn1.setForeground(Color.DARK_GRAY);
        lblTurn1.setBackground(Color.orange);
        lblTurn1.setBorder(border);
        lblTurn1.setOpaque(true);
        frm.add(lblTurn1);

        // It's O player's turn yazan label kodu
        lblTurn2 = new JLabel("It's O player's turn",SwingConstants.CENTER);
        lblTurn2.setBounds(320,250,180,50);
        lblTurn2.setFont(new Font("Monospaced",Font.CENTER_BASELINE,15));
        lblTurn2.setForeground(Color.DARK_GRAY);
        lblTurn2.setBackground(Color.orange);
        lblTurn2.setBorder(border);
        lblTurn2.setOpaque(true);
        frm.add(lblTurn2);

        // Turn Color yazan label kodu
        JLabel lblTurn = new JLabel("Turn Color",SwingConstants.CENTER);
        lblTurn.setBounds(320,150,180,50);
        lblTurn.setFont(new Font("Verdana",Font.CENTER_BASELINE,20));
        lblTurn.setForeground(Color.cyan);
        lblTurn.setBackground(Color.LIGHT_GRAY);
        lblTurn.setBorder(border);
        lblTurn.setOpaque(true);
        frm.add(lblTurn);


        restartGame = new JButton("Restart");
        restartGame.setBounds(362,350,100,50);
        restartGame.setFont(new Font("Verdana",Font.CENTER_BASELINE,20));
        restartGame.setForeground(Color.orange);
        restartGame.setBackground(Color.darkGray);
        restartGame.setBorder(border2);
        restartGame.setOpaque(true);
        frm.add(restartGame);


        for(int i=0;i<9;i++) {
            btn = new JButton();
            btn.setBounds(koordinatX,koordinatY,100,100);
            btn.setFont(new Font("Verdana",Font.LAYOUT_RIGHT_TO_LEFT,40));
            btn.setBorder(border);
            btn.setBackground(Color.LIGHT_GRAY);
            butonlar.add(btn);
            if(sayac == 0 || sayac == 1)
                koordinatX+=100;
            if(sayac == 2 || sayac == 3 || sayac == 4) {
                if(sayac == 2) {
                    koordinatX = 0;
                    koordinatY += 100;
                }
                else
                    koordinatX += 100;
            }
            if(sayac == 5 || sayac == 6 || sayac == 7) {
                if(sayac == 5) {
                    koordinatX = 0;
                    koordinatY += 100;
                }
                else
                    koordinatX += 100;
            }
            sayac++;
            frm.add(btn);
        }
    }

    public JLabel getLblTurn1() {
        return lblTurn1;
    }

    public JLabel getLblTurn2() {
        return lblTurn2;
    }

    public JButton getRestartGame() {
        return restartGame;
    }

    public ArrayList<JButton> getButons() {
        return butonlar;
    }
}
