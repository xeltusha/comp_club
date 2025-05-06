import javax.swing.*;

public class Main extends JFrame {
    private JPanel jform;
    Main(){
        setContentPane(jform);
        setTitle("Computer Club");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}