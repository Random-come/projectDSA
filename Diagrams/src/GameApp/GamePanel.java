package GameApp;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class GamePanel extends JPanel {
    private int width;
    private int height;
    private int bomp;
    private JButton[][] arrayButtons;
    private JPanel p1, p2, p11, p12, p13;
    private JLabel time_counter, bomp_counter;
    private JButton smile_ic;

    public GamePanel(int width, int height, int bomp){
        arrayButtons = new JButton[width][height];
        setLayout(new BorderLayout(20, 20));
        add(p1 = new JPanel(new BorderLayout()),BorderLayout.NORTH);

        p1.setBorder(BorderFactory.createLoweredBevelBorder());
        p1.add(p11 = new JPanel(), BorderLayout.WEST);
        p1.add(p12 = new JPanel(), BorderLayout.EAST);
        p1.add(p13 = new JPanel(), BorderLayout.CENTER);
        p11.add(time_counter = new JLabel("Bompt count:"));
        p12.add(bomp_counter = new JLabel("Time: "));
        p13.add(smile_ic = new JButton("wtf"));

        add(p2 = new JPanel(new GridLayout(width,height)), BorderLayout.CENTER);
        p2.setBorder(BorderFactory.createLoweredBevelBorder());
        for (int i = 0;i < arrayButtons.length;i++){
            for (int j = 0;j < arrayButtons.length;j++){
                p2.add(arrayButtons[i][j] = new JButton());
                arrayButtons[i][j].setPreferredSize(new Dimension(35,35));
            }
        }
    }
}
