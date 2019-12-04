package JavaCodeConvention.HomeTask1;

public class Area extends Shape {
    @Override
    Integer rectangleArea(final Integer sideN, final Integer sideS) {
        return sideN*sideS;
    }

    @Override
    Integer squareArea(final Integer sideN) {
        return sideN*sideN;
    }

    @Override
    Double circleArea(final Integer circleR) {
        return 3.14*(circleR*circleR);
    }

}
