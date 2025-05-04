package GameApp;
import javax.swing.JFrame;

import Images.LoadData;
public class GameFrame extends JFrame{
    private LoadData imageLoad;
    private GamePanel gamePanel;

    public GameFrame(){
        imageLoad = new LoadData();
        add(gamePanel = new GamePanel(9, 9, 10));

        setIconImage(imageLoad.getListImage().get("title"));
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[]args){
        new GameFrame();
    }
}
