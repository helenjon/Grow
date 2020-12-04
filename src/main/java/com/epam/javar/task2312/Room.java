package com.epam.javar.task2312;

import java.util.ArrayList;
import java.util.Arrays;

public class Room {

    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;
    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.height = height;
        this.width = width;
        this.snake = snake;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public static void main(String[] args) {
        Snake snake = new Snake(1, 1);
        game = new Room(10, 10, snake);
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.print();
        game.run();
    }

    private void run() {
        KeyboardObserver observer = new KeyboardObserver();
        observer.run();
    }

    private void print() {
        String[][] multD = new String[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                multD[i][j] = ".";
            }
        }
        //add mouse
        multD[mouse.getX()][mouse.getY()] = "^";

//  вариант для валидатора  - рисуем тело змеи
        ArrayList<SnakeSection> sections = new ArrayList<SnakeSection>(snake.getSections());
        for (SnakeSection snakeSection : sections) {
            multD[snakeSection.getY()][snakeSection.getX()] = "x";
        }

        //add snakes' head
        multD[snake.getY()][snake.getX()] = snake.isAlive() ? "X" : "x";

//  мой вариант   - рисуем тело змеи
//        for (int i = 1; i < snake.getSections().size(); i++) {
//            multD[snake.getSections().get(i).getX()][snake.getSections().get(i).getY()] = "x";
//        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(multD[y][x]);
            }
            System.out.println();
        }

    }

    public void sleep() {
        if (snake.getSections().size() < 11) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (snake.getSections().size() >= 11 && snake.getSections().size() < 15) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (snake.getSections().size() > 15) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        mouse = new Mouse(x, y);

    }

    public void eatMouse() {
        createMouse();
    }



}
