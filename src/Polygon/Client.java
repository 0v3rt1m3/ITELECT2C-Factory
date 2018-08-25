package Polygon;

import Polygon.Factory.PolygonFactory;
import Polygon.Shapes.Polygon;

public class Client {
    public static void main(String[] args) {
        PolygonFactory polygonFactory = new PolygonFactory();

        Polygon triangle = polygonFactory.getPolygon(3);
        System.out.println(triangle.getType());

        Polygon square = polygonFactory.getPolygon(4);
        System.out.println(square.getType());

        Polygon pentagon = polygonFactory.getPolygon(5);
        System.out.println(pentagon.getType());

        Polygon hectagon = polygonFactory.getPolygon(7);
        System.out.println(hectagon.getType());

        Polygon octagon = polygonFactory.getPolygon(8);
        System.out.println(octagon.getType());
    }
}
