import javax.swing.*;

public class GameFrame extends JFrame {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem basic, normal, hard, newGame, exit, howToPlay;

    public GameFrame() {
        setTitle("Test Game Frame");

        setJMenuBar(menuBar = new JMenuBar());
        menuBar.add(menu = new JMenu("Game"));
        menuBar.add(howToPlay = new JMenuItem("How to play")); 

        menu.add(newGame = new JMenuItem("New game"));
        menu.addSeparator();
        menu.add(basic = new JMenuItem("Basic"));
        menu.add(normal = new JMenuItem("Normal"));
        menu.add(hard = new JMenuItem("Hard"));
        menu.addSeparator();
        menu.add(exit = new JMenuItem("Exit"));

        // Thêm sự kiện cho Control
        howToPlay.addActionListener(e -> {
            String message = """
                 Hướng dẫn chơi game:
                
                - Basic: 8x8 ô, 10 mìn
                - Normal: 16x16 ô, 40 mìn
                - Hard: 30x16 ô, 99 mìn

                 Cách chơi:
                - Click trái: mở ô
                - Click phải: đánh dấu mìn
                """;

            JOptionPane.showMessageDialog(this, message, "Hướng dẫn", JOptionPane.INFORMATION_MESSAGE);
        });

        basic.addActionListener(e -> System.out.println("Basic selected"));
        normal.addActionListener(e -> System.out.println("Normal selected"));
        hard.addActionListener(e -> System.out.println("Hard selected"));
        newGame.addActionListener(e -> System.out.println("New Game selected"));
        exit.addActionListener(e -> System.exit(0));

        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameFrame());
    }
}
