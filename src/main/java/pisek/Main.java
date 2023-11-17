package pisek;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static final int WAIT_TIME = 60000;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Magic");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 1;
        c.gridy = 1;
        JButton button = new JButton("Start Mover");
        button.setSize(50, 100);
        frame.add(button, c);
        frame.setResizable(false);
        frame.setSize(300, 280);
        button.addActionListener(new ActionSwitcher(button));

        frame.setVisible(true);
    }



}