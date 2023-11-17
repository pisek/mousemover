package pisek;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionSwitcher implements ActionListener {

    private final JButton button;
    private MoverThread mover;
    private boolean start = true;

    public ActionSwitcher(JButton button) {
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (start) {
            button.setText("Stop Mover");
            start = false;
            mover = new MoverThread();
            mover.start();
        } else {
            button.setText("Start Mover");
            start = true;
            mover = null;
            mover.end();
        }
    }
}
