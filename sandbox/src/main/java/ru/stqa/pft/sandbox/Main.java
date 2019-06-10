package ru.stqa.pft.sandbox;

import ru.stqa.pft.figures.Point;
import ru.stqa.pft.figures.UtilsCalculation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Hello.hello("user");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите x1: ");
    int x1 = scanner.nextInt();
    System.out.print("Введите y1: ");
    int y1 = scanner.nextInt();
    System.out.print("Введите x2: ");
    int x2 = scanner.nextInt();
    System.out.print("Введите y2: ");
    int y2 = scanner.nextInt();

    Point p1 = new Point(x1, y1);
    Point p2 = new Point(x2, y2);
    System.out.println("Расстояние между точками:  " + p1.distance(x2, y2));
    System.out.println("Расстояние между точками:  " + UtilsCalculation.distance(p1, p2));
    System.out.println("Расстояние между точками:  " + p1.distance(p2));
}
}