import javax.swing.*;
import java.util.ArrayList;

public class GameEndChecker {

    ArrayList<JButton> butons;
    JButton[][] butonArray = new JButton[3][3];
    char winnerGame;
    public GameEndChecker(ArrayList<JButton> butons,char winnerGame) {
        this.butons = butons;
        this.winnerGame = winnerGame;
    }

    public boolean Checker(char winnerGame) {
        int sayac = 0;
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                butonArray[i][j] = butons.get(sayac);
                sayac++;
            }
        }
        for(int i=0;i<3;i++) {
            if(
                    butonArray[i][0].getText().equals(Character.toString(winnerGame)) &&
                            butonArray[i][1].getText().equals(Character.toString(winnerGame)) &&
                            butonArray[i][2].getText().equals(Character.toString(winnerGame))
            )return true;

            if(
                    butonArray[0][i].getText().equals(Character.toString(winnerGame)) &&
                            butonArray[1][i].getText().equals(Character.toString(winnerGame)) &&
                            butonArray[2][i].getText().equals(Character.toString(winnerGame))
            )return true;

            if(
                    butonArray[0][0].getText().equals(Character.toString(winnerGame)) &&
                            butonArray[1][1].getText().equals(Character.toString(winnerGame)) &&
                            butonArray[2][2].getText().equals(Character.toString(winnerGame))
            )return true;

            if(
                    butonArray[0][2].getText().equals(Character.toString(winnerGame)) &&
                            butonArray[1][1].getText().equals(Character.toString(winnerGame)) &&
                            butonArray[2][0].getText().equals(Character.toString(winnerGame))
            )return true;
        }
        return false;
    }

}
