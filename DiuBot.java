import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class DiuBot extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();

    private ResponsesManager responsesManager = new ResponsesManager();

    DiuBot() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400, 400);
        f.getContentPane().setBackground(Color.black);
        f.setTitle("DiuBot");
        f.setLocationRelativeTo(null);
        f.add(ca);
        f.add(cf);
        ca.setSize(300, 310);
        ca.setLocation(1, 1);
        ca.setBackground(Color.BLACK);
        cf.setSize(300, 20);
        cf.setLocation(1, 330);
        f.add(b);
        l.setFont(new Font("Fira code", Font.BOLD, 12));
        l.setForeground(Color.BLUE);
        l.setText("SEND");
        b.add(l);
        b.setSize(400, 20);
        b.setLocation(300, 330);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b) {
                    String text = cf.getText().toLowerCase();
                    ca.setForeground(Color.GREEN);
                    ca.append("You: >" + text + "\n");
                    cf.setText("");

                    String response = responsesManager.getResponse(text);
                    replyMeth(response);
                }
            }
        });
    }

    public void replyMeth(String s) {
        ca.append("DiuBot: " + s + "\n");
    }
}

class DiuBotMain {
    public static void main(String[] args) {
        new DiuBot();
    }
}
