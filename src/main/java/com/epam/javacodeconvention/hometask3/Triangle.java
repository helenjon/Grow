package com.epam.javacodeconvention.hometask3;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

    private final List<Integer> A = new ArrayList<>();
    private final List<Integer> B = new ArrayList<>();
    private final List<Integer> C = new ArrayList<>();

    public Triangle(Integer x1, Integer y1, Integer x2, Integer y2, Integer x3, Integer y3) {
        this.A.add(x1);
        this.A.add(y1);
        this.B.add(x2);
        this.B.add(y2);
        this.C.add(x3);
        this.C.add(y3);
    }

    public Triangle() {
    }


    void setPoints(String side, Integer x, Integer y) {
        try {
            switch (side) {
                case "C":
                    this.C.add(x);
                    this.C.add(y);
                    break;
                case "B":
                    this.B.add(x);
                    this.B.add(y);
                    break;
                case "A":
                    this.A.add(x);
                    this.A.add(y);
                default:
                    System.out.println("There is NO " + side + " Please enter correct side");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    void calculateSquare() {
        Double s;
        try {
            s = Math.abs((((A.get(0) - C.get(0)) * (A.get(1) - C.get(1))) - ((B.get(0) - C.get(0)) * (B.get(1) - C.get(1))))) * 0.5;
            System.out.println(s);
        } catch (IndexOutOfBoundsException e) {
            if (A.size() < 2) System.out.println("setup XY for A");
            if (B.size() < 2) System.out.println("setup XY for B");
            if (C.size() < 2) System.out.println("setup XY for C");
        }

    }

}
