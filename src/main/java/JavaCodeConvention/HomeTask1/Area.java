package JavaCodeConvention.HomeTask1;

public class Area extends Shape {
    @Override
    Integer rectangleArea(Integer sideN, Integer sideS) {
        return sideN*sideS;
    }

    @Override
    Integer squareArea(Integer sideN) {
        return sideN*sideN;
    }

    @Override
    Double circleArea(Integer circleR) {
        return 3.14*(circleR*circleR);
    }

}
