package com.codespace.battle2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplate2 extends JPanel {
    final boolean COLORDED_MODE = true;
    final int BF_WIDTH = 576;
    final int BF_HEIGHT = 576;
    final int TOP = 1;
    final int BOTTOM = 2;
    final int LEFT = 3;
    final int RIGHT = 4;
    int tankDirection = RIGHT;
    int tankX = 0;
    int tankY = 0;
    int bulletX = -100;
    int bulletY = -100;
    final int SPEED = 25;
    final int BULLET_SPEED = 5;
    final int STEP = 1;
    final int CELL_SIZE = 64;
    /**
     * Write your code here.
     */
    String[][] battleField = {
            {" ", " ", " ", " ", "B", " ", " ", " ", " "},
            {" ", " ", " ", "B", "B", " ", " ", " ", " "},
            {"B", " ", "B", " ", "B", " ", " ", " ", " "},
            {" ", " ", " ", " ", "B", "B", "B", " ", " "},
            {"B", " ", " ", " ", "B", " ", " ", " ", "B"},
            {" ", "B", " ", " ", "B", " ", " ", " ", " "},
            {"B", " ", " ", " ", "B", " ", " ", " ", " "},
            {" ", " ", " ", " ", "B", " ", " ", " ", " "},
            {" ", "B", " ", " ", "B", " ", " ", " ", " "}

    };

    void runTheGame() throws Exception {
       //task 1-2
//        moveToQuadrant(3, 5);
//        Thread.sleep(500);
//        moveToQuadrant(1, 1);
//        Thread.sleep(500);
        //task 3
//        while (fire());
//        System.out.println("the end");
        //task 4
//        moveToQuadrant(3, 5);
//        Thread.sleep(500);
//        moveToQuadrant(9, 5);
//        Thread.sleep(500);
        //task 5
        getStartingPoint();
        clean ();
    }

    void getStartingPoint () throws Exception {
        String temp = quadrantRandomize();
        while (!checkQuadrant(temp)) {
            temp = quadrantRandomize();
        }

        int row = Integer.parseInt(temp.substring(0,temp.indexOf("_")));
        int col = Integer.parseInt(temp.substring(temp.indexOf("_")+1));

        String tempCoord = getQuadrantXY(row+1, col+1);
        tankX = Integer.parseInt(tempCoord.substring(0,tempCoord.indexOf("_")));
        tankY = Integer.parseInt(tempCoord.substring(tempCoord.indexOf("_")+1));
    }

    String quadrantRandomize () throws Exception {
        int randQudrantX = (int) (Math.random() * 9);
        int randQudrantY = (int) (Math.random() * 9);
        String result = String.format("%d_%d", randQudrantX, randQudrantY);
        return result;
    }

    boolean checkQuadrant (String randomQuadrant) throws Exception {
        int row = Integer.parseInt(randomQuadrant.substring(0,randomQuadrant.indexOf("_")));
        int col = Integer.parseInt(randomQuadrant.substring(randomQuadrant.indexOf("_")+1));

        if (battleField[row][col].equals("B")) return false;
        return true;
    }


    void clean() throws Exception {
        int col = 1;

        while (col > 0 && col <=battleField.length) {
            moveToQuadrant(1, col);
            checkTargetsInColumnAndFire(col);
            col++;
        }
    }

    void checkTargetsInColumnAndFire (int col) throws Exception {
        col--;
        for (int row = 0; row < battleField.length; row++) {
            if (battleField[row][col].equals("B")) {
                turn (2);
                fire();
            }
        }
    }


    void clearNextField() throws Exception {
        String position = getQuadrant(tankX, tankY);
        int currentRow = Integer.parseInt(position.substring(0,position.indexOf("_")));
        int currentCol = Integer.parseInt(position.substring(position.indexOf("_")+1));
        int futureRow = currentRow;
        int futureCol = currentCol;

        switch (tankDirection) {
            case TOP: futureRow--;  break;
            case BOTTOM: futureRow++;  break;
            case LEFT: futureCol--; break;
            case RIGHT: futureCol++; break;
        }

        if ((futureRow >= 0 && futureRow < battleField.length) && (futureCol >= 0 && futureCol < battleField[futureRow].length)) {
            if (battleField[futureRow][futureCol].equals("B")) {
                fire();
            }
        }

    }



    boolean fire() throws Exception {
//        turn(2);

        bulletX = tankX + 25;
        bulletY = tankY + 25;
        boolean result = false;

        while ((bulletX >= 0 && bulletX < BF_WIDTH) && (bulletY >= 0 && bulletY <BF_HEIGHT)) {

            switch (tankDirection) {
                case TOP: bulletY -= STEP; break;
                case BOTTOM: bulletY += STEP; break;
                case LEFT: bulletX -= STEP; break;
                case RIGHT: bulletX += STEP; break;
            }

            if (processInterception()) {
                bulletX = -100;
                bulletY = -100;
                result = true;
            }

            repaint();
            Thread.sleep(BULLET_SPEED);
        }

        return result;

//        while (!processInterception()) {
//            for (int x = 1; x <= 64; x++) {
//                if (
//                        (tankDirection == TOP && bulletY == 0) ||
//                        (tankDirection == LEFT && bulletX == 0) ||
//                        (tankDirection == BOTTOM && bulletY == BF_HEIGHT) ||
//                        (tankDirection == RIGHT && bulletX == BF_WIDTH)) {
//                    System.out.println("Border reached:  (" + bulletX + "; " + bulletY + ")");
//                    return false;
//                }
//
//                switch (tankDirection) {
//                    case TOP: bulletY -= STEP; break;
//                    case BOTTOM: bulletY += STEP; break;
//                    case LEFT: bulletX -= STEP; break;
//                    case RIGHT: bulletX += STEP; break;
//                }
//
//                repaint();
//                Thread.sleep(BULLET_SPEED);
//            }
//        }
//
//        bulletX = -100;
//        bulletY = -100;
//        return true;
    }

    boolean processInterception() {
        String position = getQuadrant(bulletX, bulletY);
        int row = Integer.parseInt(position.substring(0,position.indexOf("_")));
        int col = Integer.parseInt(position.substring(position.indexOf("_")+1));
        if ((row >= 0 && row < battleField.length) && (col >= 0 && col < battleField[row].length)) {
            if (battleField[row][col].equals("B")) {
                battleField[row][col] = " ";
                return true;
            }
        }
        return false;
    }

    void turn(int direction) {
        tankDirection = direction;
        }

    String getQuadrantXY(int v, int h) {
        int coordX = (h * CELL_SIZE) - CELL_SIZE;
        int coordY = (v * CELL_SIZE) - CELL_SIZE;
        String result = String.format("%d_%d", coordX, coordY);
        return result;
    }

    String getQuadrant(int coordX, int coordY) {
        int h = coordX / CELL_SIZE;
        int v = coordY / CELL_SIZE;
        String result = String.format("%d_%d", v, h);
        return result;
    }

    void moveToQuadrant(int v, int h) throws Exception {
        String coord = getQuadrantXY(v,h);
        int coordX = Integer.parseInt(coord.substring(0,coord.indexOf('_')));
        int coordY = Integer.parseInt(coord.substring(coord.indexOf('_')+1));

        while (tankY != coordY) {
            moveTopBottom(coordY);
        }

        while (tankX != coordX) {
            moveLeftRight (coordX);
        }
    }

    void moveTopBottom (int coordY) throws Exception {
        if (tankY < coordY) {
            move2(BOTTOM);
        } else if (tankY > coordY){
            move2(TOP);
        }
    }

    void moveLeftRight (int coordX) throws Exception {
        if (tankX < coordX) {
            move2(RIGHT);
        } else if (tankX > coordX){
            move2(LEFT);
        }
    }

    void move2 (int direction) throws Exception {
        turn (direction);
        clearNextField();

        if (
                (tankDirection == TOP && tankY == 0) ||
                        (tankDirection == LEFT && tankX == 0) ||
                        (tankDirection == BOTTOM && tankY == (BF_HEIGHT - 64)) ||
                        (tankDirection == RIGHT && tankX == (BF_WIDTH - 64))) {
            System.out.println("Border reached:  (" + tankX + "; " + tankY + ")");
            return;
        }

        for (int x=1; x <=64; x++) {
            switch (tankDirection) {
                case TOP:
                    System.out.println("Top:  (" + tankX + "; " + tankY + ")");
                    tankY -= STEP;
                    break;
                case BOTTOM:
                    System.out.println("Bottom:  (" + tankX + "; " + tankY + ")");
                    tankY += STEP;
                    break;
                case LEFT:
                    System.out.println("Left:  (" + tankX + "; " + tankY + ")");
                    tankX -= STEP;
                    break;
                case RIGHT:
                    System.out.println("Right:  (" + tankX + "; " + tankY + ")");
                    tankX += STEP;
                    break;
            }

            repaint();
            Thread.sleep(SPEED);

        }
    }

//    void move(int direction) throws Exception {
//        turn(direction);
//
//        if (
//                (tankDirection == TOP && tankY == 0) ||
//                (tankDirection == LEFT && tankX == 0) ||
//                (tankDirection == BOTTOM && tankY == (BF_HEIGHT - 64)) ||
//                (tankDirection == RIGHT && tankX == (BF_WIDTH - 64))) {
//            System.out.println("Border reached:  (" + tankX + "; " + tankY + ")");
//            return;
//        }
//
//        for (int x=1; x <=64; x++) {
//            switch (tankDirection) {
//                case TOP: System.out.println("Top:  (" + tankX + "; " + tankY + ")"); tankY -= STEP; break;
//                case BOTTOM: System.out.println("Bottom:  (" + tankX + "; " + tankY + ")"); tankY += STEP; break;
//                case LEFT: System.out.println("Left:  (" + tankX + "; " + tankY + ")"); tankX -= STEP; break;
//                case RIGHT: System.out.println("Right:  (" + tankX + "; " + tankY + ")"); tankX += STEP; break;
//            }
//
//            repaint();
//            Thread.sleep(SPEED);
//        }
//    }



// Magic bellow. Do not worry about this now, you will understand
// everything in this course.
// Please concentrate on your tasks only.

    public static void main(String[] args) throws Exception {
        BattleFieldTemplate2 bf = new BattleFieldTemplate2();
        bf.runTheGame();
    }
    public BattleFieldTemplate2() throws Exception {
        JFrame frame = new JFrame("BATTLE FIELD 2");
        frame.setLocation(750, 150);
        frame.setMinimumSize(new Dimension(BF_WIDTH+18, BF_HEIGHT + 46));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int i = 0;
        Color cc;
        for (int v = 0; v < 9; v++) {
            for (int h = 0; h < 9; h++) {
                if (COLORDED_MODE) {
                    if (i % 2 == 0) {
                        cc = new Color(252, 241, 177);
                    } else {
                        cc = new Color(233, 243, 255);
                    }
                } else {
                    cc = new Color(180, 180, 180);
                }
                i++;
                g.setColor(cc);
                g.fillRect(h * 64, v * 64, 64, 64);
            }
        }
        for (int j = 0; j < battleField.length; j++) {
            for (int k = 0; k < battleField.length; k++) {
                if (battleField[j][k].equals("B")) {
                    String coordinates = getQuadrantXY(j + 1, k + 1);
                    int separator = coordinates.indexOf("_");
                    int x = Integer.parseInt(coordinates.substring(0,

                            separator));
                    int y = Integer.parseInt(coordinates.substring(separator
                            + 1));
                    g.setColor(new Color(0, 0, 155));
                    g.fillOval(x, y, 64, 64);
                }
            }
        }
        g.setColor(new Color(255, 0, 0));
        g.fillOval(tankX, tankY, 64, 64);
        g.setColor(new Color(0, 255, 0));
        if (tankDirection == TOP) {
            g.fillRect(tankX + 20, tankY, 24, 34);
        } else if (tankDirection == BOTTOM) {
            g.fillRect(tankX + 20, tankY + 30, 24, 34);
        } else if (tankDirection == LEFT) {
            g.fillRect(tankX, tankY + 20, 34, 24);
        } else {
            g.fillRect(tankX + 30, tankY + 20, 34, 24);
        }
        g.setColor(new Color(255, 255, 0));
        g.fillOval(bulletX, bulletY, 14, 14);
    }
}