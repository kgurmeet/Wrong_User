import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Wrong_User implements ActionListener {
    JFrame f;
    JLabel l;
    JButton b;
    Container c;

    Wrong_User() {
        f = new JFrame("Wrong USER");
        c = f.getContentPane();
        l = new JLabel("WRONG USER AND PASSWORD");
        l.setBounds(500, 500, 200, 50);
        b = new JButton(" BACK ");
        b.setBounds(500, 600, 200, 40);
        c.add(l);
        c.add(b);
        b.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(700, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
       new Login();
        f.dispose();
    }
}