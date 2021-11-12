package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Task14 task14 = new Task14();
//        System.out.println(task14.sumOdd(100,1000));

//        Task15 task15 = new Task15();
//        System.out.println(task15.isPalindrome(11212));

//        Task16 task16 = new Task16();
//        System.out.println(task16.sumFirstAndLastDigit(257));

//        Task17 task17 = new Task17();
//        System.out.println(task17.getEvenDigitSum(123456789));

//        Task18 task18 = new Task18();
//        System.out.println(task18.hasSharedDigit(15,55));

//        Task20 task20 = new Task20();
//        System.out.println(task20.getGreatestCommonDivisor(81, 153));


//        Task21 task21 = new Task21();
//        task21.printFactors(32);

//        Task22 task22 = new Task22();
//        task22.isPerfecrNumber(5);

//        Task23 task23 = new Task23();
//        task23.numberToWords(343);


//        Task24 task24 = new Task24();
//        System.out.println(task24.canPack(2,2,11));


//        Task25 task25 = new Task25();
//        System.out.println(task25.getLagestPrime(21));

//        Task26 task26 = new Task26();
//        task26.printSquareStar(18);

//        Task27 task27 = new Task27();
//        task27.ENTER();

//        SimpleCalculate calculator = new SimpleCalculate();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());


//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());


//         Wall wall = new Wall(5,4);
//         System.out.println("area= " + wall.getArea());
//
//         wall.setHeight(-1.5);
//         System.out.println("width= " + wall.getWidth());
//         System.out.println("height= " + wall.getHeight());
//         System.out.println("area= " + wall.getArea());


//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());

//        Rectangle rectangle = new Rectangle(5, 10);
//        System.out.println("rectangle.width= " + rectangle.getWidth());
//        System.out.println("rectangle.length= " + rectangle.getLength());
//        System.out.println("rectangle.area= " + rectangle.getArea());
//        Cuboid cuboid = new Cuboid(5,10,5);
//        System.out.println("cuboid.width= " + cuboid.getWidth());
//        System.out.println("cuboid.length= " + cuboid.getLength());
//        System.out.println("cuboid.area= " + cuboid.getArea());
//        System.out.println("cuboid.height= " + cuboid.getHeight());
//        System.out.println("cuboid.volume= " + cuboid.getVolume());


        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }
}
