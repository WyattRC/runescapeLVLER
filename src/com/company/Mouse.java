package com.company;
import java.awt.*;
import java.awt.event.InputEvent;

public class Mouse {

    public static final int TEN_SECONDS = 10000;
    public static int clickCount = 30;
    public static int empty;
    public static int xRun = 0;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        while (true) {
            if (clickCount < 30 == true) {
                robot.mouseMove(710, 425);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                clickCount++;
                empty--;
                Thread.sleep(TEN_SECONDS);
            } else if (clickCount < 30 == false) {
                if(empty <= 0 == true) {
                    Robot r = new Robot();

                    r.mouseMove(1200, 510);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1250, 510);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1100, 510);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1150, 510);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1100, 530);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1150, 530);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1200, 530);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1250, 530);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1100, 560);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1150, 560);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1200, 560);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1250, 560);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1100, 590);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1150, 590);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1200, 590);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1250, 590);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1100, 620);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1150, 620);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1200, 620);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1250, 620);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1100, 650);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1150, 650);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1200, 650);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1250, 650);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1100, 675);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1150, 675);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1200, 675);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1250, 675);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1100, 710);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1150, 710);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1200, 710);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);

                    r.mouseMove(1250, 710);
                    r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    r.mouseMove(1200, 350);

                    r.delay(500);
                    r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    empty++;
                    r.delay(500);
                } else if (empty <= -2 == false ){
                    clickCount = 0;
                    xRun++;
                    System.out.println(xRun);

                }
            }

        }
    }

}

