package pisek;

import java.awt.*;

public class MoverThread extends Thread {

    private boolean run = true;
    private boolean toRight = true;

    @Override
    public void run() {
        try {
            while (run) {
                Point location = MouseInfo.getPointerInfo().getLocation();

                Robot robot = new Robot();
                robot.mouseMove(location.x + (toRight ? 1 : -1), location.y);
                toRight = !toRight;

                Thread.sleep(Main.WAIT_TIME);
            }
        } catch (InterruptedException | AWTException e) {
        }
    }

    public void end() {
        run = false;
    }
}
