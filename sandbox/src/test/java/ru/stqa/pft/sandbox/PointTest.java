package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.figures.Point;
import ru.stqa.pft.figures.UtilsCalculation;

public class PointTest {

    @Test
    public void testPointDistance1(){
        Point p1 = new Point(3, 4);
        Assert.assertEquals(p1.distance(0, 0),5.0);
    }

    @Test
    public void TestPointDistance2(){
        Point p1 = new Point(3, 4);
        Point p2 = new Point(0, 0);
        Assert.assertEquals(p1.distance(p2),5.0);
    }

    @Test
    public void TestUtilsCalculationDistance(){
        Point p1 = new Point(3.0, 4.0);
        Point p2 = new Point(0.0, 0.0);
        Assert.assertEquals(UtilsCalculation.distance(p1, p2),5.0);
    }
}
