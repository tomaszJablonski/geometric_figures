package com.company;

import java.util.Scanner;

public class Main {
//TODO  Napisać metodę w main o nazwie showTables, która wyświetli zawartość obydwu tablic z
//    poprzednich zadań.

    //for each
    static public int showTables(Cuboid[] cuboids,Rectangle[] rectangles) {
        for (Rectangle rectangle: new Rectangle[5]);
        for (Cuboid cuboid: new Cuboid[5]);
        return rectangles.length & cuboids.length;
    }




    public static void main(String[] args) {
//        System.out.println("Rectangle");
//        Rectangle rectangle = new Rectangle(5,5);
//        System.out.println(rectangle);
//        System.out.println(rectangle.isSquare());
//        //print f ograniczenie miejsc po przecinku
//        System.out.printf("%2.2f \n",rectangle.circumference());
//        System.out.println(rectangle.field());
//
//        System.out.println();
//        System.out.println("Cuboid");
//        Cuboid cuboid = new Cuboid(51,rectangle);
//        System.out.println(cuboid);
//        System.out.println(cuboid.isCube());
//        System.out.println(cuboid.volume());
//        System.out.println(cuboid.area());

        Rectangle[] arrayRectangles = new Rectangle[5]; //prostokąty
        Cuboid[] arrayCuboids = new Cuboid[5];    //prostopadłościany

        runApp(arrayRectangles,arrayCuboids);
        System.out.println(arrayRectangles[0]);
        System.out.println(arrayCuboids[0]);

        System.out.println(showTables(arrayCuboids,arrayRectangles));

    }

    static void runApp(Rectangle[] arrayRectangles,Cuboid[] arrayCuboids) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What object do you want to create? Rectangle or Cuboid?");
        String chooseUser = scanner.nextLine();


        while (!(chooseUser.equals("Rectangle") || chooseUser.equals("Cuboid"))) {
            System.out.println("Wrong name");
            System.out.println("Enter correct name");
            chooseUser = scanner.nextLine();
        }

        System.out.println("Enter side A");
        double sideA = scanner.nextDouble();
        System.out.println("enter side B");
        double sideB = scanner.nextDouble();


        if (chooseUser.equals("Rectangle")) {
            for (int i = 0; i < arrayRectangles.length; i++) {
                if (arrayRectangles[i] == null) {
                    arrayRectangles[i] = new Rectangle(sideA, sideB);
                    break;
                }
            }

        } else if (chooseUser.equals("Cuboid")) {
            System.out.print("Enter height: ");
            double height = scanner.nextDouble();

            for (int i = 0; i < arrayCuboids.length; i++) {
                if (arrayCuboids[i] == null) {
                    arrayCuboids[i] = new Cuboid(height, new Rectangle(sideA,sideB));
                    break;

                }

            }

        }
//            System.out.println(arrayRectangles[0]);
//            System.out.println(arrayCuboids[0]);
    }
}
