import com.sun.javafx.scene.traversal.Direction;

import java.awt.event.KeyEvent;

public class Player {

    private int x = 0;
    private int y = 0;
    private int speed = 2;
    private int mapX = 0;
    private int mapY = 0;

    private Direction playerDirection = Direction.NEXT;

    public void move() {
        switch(playerDirection) {
            case UP:
                mapY+=speed;
                break;
            case DOWN:
                mapY-=speed;
                break;
            case LEFT:
                mapX+=speed;
                break;
            case RIGHT:
                mapX-=speed;
                break;
            default:
                break;
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_DOWN) {
            playerDirection = Direction.UP;
        }
        if(key == KeyEvent.VK_UP) {
            playerDirection = Direction.DOWN;
        }
        if(key == KeyEvent.VK_LEFT) {
            playerDirection = Direction.LEFT;
        }
        if(key == KeyEvent.VK_RIGHT) {
            playerDirection = Direction.RIGHT;
        }
    }

    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMapX() {
        return mapX;
    }

    public int getMapY() {
        return mapY;
    }
}