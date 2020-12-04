package com.epam.javar.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<SnakeSection> sections = new ArrayList<>();
    private boolean isAlive;
    private SnakeDirection direction;


    public Snake(int x, int y) {
        sections.add(new SnakeSection(x, y));
        isAlive = true;

    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public void move() {
        if (!(isAlive == false)) {
            if (direction.equals(SnakeDirection.UP)) {
                move(0, -1);
            }
            if (direction.equals(SnakeDirection.RIGHT)) {
                move(1, 0);
            }
            if (direction.equals(SnakeDirection.DOWN)) {
                move(0, 1);
            }
            if (direction.equals(SnakeDirection.LEFT)) {
                move(-1, 0);
            }
        }
    }

    public void move(int dx, int dy) {
        //Создаем новую голову - новый "кусочек змеи".
        SnakeSection head = sections.get(0);
        head = new SnakeSection(head.getX() + dx, head.getY() + dy);

        checkBorders(sections.get(0));
        checkBody(sections.get(0));
        if (isAlive = true) {
            Mouse mouse = Room.game.getMouse();
            if (mouse.getX() == head.getX() && mouse.getY() == head.getY()) {
                sections.add(0, head);
                Room.game.eatMouse();
            } else {
                sections.add(0, head);
                sections.remove(sections.size() - 1);
            }

        }
    }


    public void checkBorders(SnakeSection head) {
        if ((head.getX() < 0 || head.getX() >= Room.game.getWidth()) || head.getY() < 0 || head.getY() >= Room.game.getHeight()) {
            isAlive = false;
        }
    }

    public void checkBody(SnakeSection head) {
        if (sections.contains(head)) isAlive = false;
    }

}
