package JavaCodeConvention.HomeTask1;

//"We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'rectangleArea'
// taking two parameters, 'squareArea' and 'circleArea' taking one parameter each.
//        The parameters of 'rectangleArea' are its length and breadth, that of 'squareArea' is its side and that of 'circleArea' is its radius.
// Now create another class 'Area' containing all the three methods 'rectangleArea', 'squareArea' and 'circleArea' for printing the area of rectangle,
// square and circle respectively. Create an object of class 'Area' and call all the three methods."



abstract class Shape {

    abstract Integer rectangleArea(Integer sideN, Integer sideS);

    abstract Integer squareArea(Integer circleN);

    abstract Double circleArea(Integer circleR);

}
