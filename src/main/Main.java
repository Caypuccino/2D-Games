package main;
import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false); //cant resize window
        window.setTitle("2D Game");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();//sized window to fit preferred size and layouts of its subcomponents

        window.setLocationRelativeTo(null);//ga ada patokan posisi jadi nanti bakal di tengah
        window.setVisible(true);

        gamePanel.startGameThread();

    }
}