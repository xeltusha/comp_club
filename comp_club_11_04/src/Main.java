import javax.swing.*;

public class Main extends JFrame {
    private JPanel jform;
    private JComboBox comboBox1;
    private JButton calculateThePriceButton;
    private JTextField textField1;
    private JTextArea welcomeToComputerClubTextArea;
    private JTextArea chooseTheTypeOfTextArea;
    private JTextArea textArea3;

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